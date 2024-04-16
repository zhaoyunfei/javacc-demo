package com.zhaoyunfei.javacc.utils;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.system.SystemUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.zhaoyunfei.javacc.exceptions.CustomException;
import com.zhaoyunfei.javacc.properties.StorageProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.UUID;

/**
 * @author yujianyi
 * @since 2019/7/23 13:52
 */
@Component
public class FileOperationUtil {

    private FileOperationUtil(StorageProperties storageProperties) {
        this.storageProperties = storageProperties;
    }

    private final StorageProperties storageProperties;

    private String serverFilePathPrefix;


    /**
     * 上传图片:注意这里把图片都上传到deposit文件夹下
     *
     * @param multipartFile 上传的文件
     * @return 执行结果
     * @throws IOException 异常
     */
    public String uploadFile(MultipartFile multipartFile) throws IOException {
        String localFilePath = getFilePath() + File.separator + "deposit" + File.separator;

        String relativePath;
        // 相对路径
        relativePath = DateUtil.format(new Date(), "yyyy-MM-dd");

        // 绝对路径
        String absolutePath = localFilePath + relativePath;
        String oldName = multipartFile.getOriginalFilename();
        String newName = UUID.randomUUID().toString().replace("-", "") + "_" + oldName;

        // 转换后的回显相对路径
        String saveRelativeFilePath = (serverFilePathPrefix + relativePath + File.separator + newName).replace("\\", "/");
        // 保存的路径
        String absoluteFilePath = absolutePath + File.separator + newName;
        File file = new File(absolutePath);
        if (!file.isDirectory()) {
            file.mkdirs();
        }
        multipartFile.transferTo(new File(absoluteFilePath));

        return saveRelativeFilePath;
    }

    /**
     * 删除文件
     *
     * @param fileAddress 文件地址
     * @throws IOException 异常
     */
    public void deleteFile(String fileAddress) throws IOException {
        String localFilePath = getFilePath() + File.separator + "deposit" + File.separator;
        String replace = fileAddress.replace(serverFilePathPrefix, localFilePath);
        Files.deleteIfExists(Paths.get(replace));
    }

    public String writeFile(String fileName, String content) {
        String localFilePath = getFilePath() + File.separator + "deposit" + File.separator;
        // 相对路径
        String relativePath = DateUtil.format(new Date(), "yyyy-MM-dd");

        // 绝对路径
        String absolutePath = localFilePath + relativePath + File.separator + fileName;

        FileUtil.writeBytes(content.getBytes(StandardCharsets.UTF_8), absolutePath);

        return absolutePath;
    }

    public String writeToJsonFile(String fileName, Object data) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

            String localFilePath = getFilePath() + File.separator + "deposit" + File.separator;
            // 相对路径
            String relativePath = DateUtil.format(new Date(), "yyyy-MM-dd");

            // 绝对路径
            String absolutePath = localFilePath + relativePath + File.separator + fileName;

            File file = new File(absolutePath);
            // 将数据写入JSON文件
            objectMapper.writeValue(file, data);

            return absolutePath;
        } catch (IOException e) {
            throw new CustomException("Error occurred while writing JSON file: " + e.getMessage());
        }
    }

    /**
     * 获取文件访问地址前缀
     */
    @PostConstruct
    private void getServerFilePathPrefix() {
        //由于现在部署不再同一台机器上,所以访问资源ip为项目ip
        serverFilePathPrefix = String.format("http://%s:%d/root/deposit/", this.storageProperties.getIp(), this.storageProperties.getPort());
    }

    /**
     * 获取不同环境想表文件地址
     *
     * @return 实际地址
     */
    public String getFilePath() {
        String name = SystemUtil.getOsInfo().getName();
        if (name.toLowerCase().contains("windows")) {
            return this.storageProperties.getWinAddress();
        } else {
            return this.storageProperties.getAddress();
        }
    }
}
