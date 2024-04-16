package com.zhaoyunfei.javacc.module.service.impl;

import cn.hutool.core.io.resource.ResourceUtil;
import com.zhaoyunfei.javacc.exceptions.CustomException;
import com.zhaoyunfei.javacc.module.parser.ActionParser;
import com.zhaoyunfei.javacc.module.service.IExecuteService;
import com.zhaoyunfei.javacc.module.service.ILuaScriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;

/**
 * @author ZhaoYunFei
 * @since 2024/4/16 14:40
 */
@Service
public class LuaScriptServiceImpl implements ILuaScriptService {

    private final IExecuteService iExecuteService;

    public LuaScriptServiceImpl(IExecuteService iExecuteService) {
        this.iExecuteService = iExecuteService;
    }

    @Override
    public boolean luaScriptTest() {
        try {
            InputStream inputStream = ResourceUtil.getStream("classpath:/static/1.lua");
            ActionParser parser=new ActionParser(inputStream,iExecuteService);
            parser.Start();
            return true;
        }catch (Exception e){
            throw new CustomException("解析执行脚本失败,失败原因:"+e.getMessage());
        }
    }
}
