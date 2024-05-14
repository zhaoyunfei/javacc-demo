package com.zhaoyunfei.javacc.module.service.impl;

import cn.hutool.core.io.resource.ResourceUtil;
import com.zhaoyunfei.javacc.exceptions.CustomException;
import com.zhaoyunfei.javacc.module.listener.ParsingListener;
import com.zhaoyunfei.javacc.module.parser.ActionDebugParser;
import com.zhaoyunfei.javacc.module.parser.ActionParser;
import com.zhaoyunfei.javacc.module.service.IExecuteService;
import com.zhaoyunfei.javacc.module.service.ILuaScriptService;
import org.springframework.stereotype.Service;

import java.io.InputStream;

/**
 * @author ZhaoYunFei
 * @since 2024/4/16 14:40
 */
@Service
public class LuaScriptServiceImpl implements ILuaScriptService {

    private final ParsingListener parsingListener;

    private final IExecuteService iExecuteService;

    private ActionDebugParser actionDebugParser;

    private ActionParser actionParser;


    private void setActionParser(ActionParser actionParser) {
        this.actionParser = actionParser;
    }

    private void setActionDebugParser(ActionDebugParser actionDebugParser) {
        this.actionDebugParser = actionDebugParser;
    }

    public LuaScriptServiceImpl(IExecuteService iExecuteService, ParsingListener parsingListener) {
        this.iExecuteService = iExecuteService;
        this.parsingListener = parsingListener;
    }

    @Override
    public boolean start() {
        try {
            InputStream inputStream = ResourceUtil.getStream("classpath:/static/1.lua");
            ActionParser parser = new ActionParser(inputStream, iExecuteService, parsingListener);
            this.setActionParser(parser);
            parser.start();
            // 执行完毕后置为 null
            this.setActionParser(null);
            return true;
        } catch (Exception e) {
            throw new CustomException("解析执行脚本失败,失败原因:" + e.getMessage());
        }
    }

    @Override
    public boolean pause() {
        try {
            if (actionParser == null) {
                throw new CustomException("暂停执行脚本失败,当前执行器不存在!");
            }
            actionParser.pause();
            return true;
        } catch (Exception e) {
            throw new CustomException("暂停执行脚本失败,失败原因:" + e.getMessage());
        }
    }

    @Override
    public boolean resume() {
        try {
            if (actionParser == null) {
                throw new CustomException("恢复执行脚本失败,当前执行器不存在!");
            }
            actionParser.resume();
            return true;
        } catch (Exception e) {
            throw new CustomException("恢复执行脚本失败,失败原因:" + e.getMessage());
        }
    }

    @Override
    public boolean stop() {
        try {
            if (actionParser == null) {
                throw new CustomException("停止执行脚本失败,当前执行器不存在!");
            }
            actionParser.stop();
            return true;
        } catch (Exception e) {
            throw new CustomException("停止执行脚本失败,失败原因:" + e.getMessage());
        }
    }

    @Override
    public boolean debugStart() {
        try {
            InputStream inputStream = ResourceUtil.getStream("classpath:/static/1.lua");
            ActionDebugParser parser = new ActionDebugParser(inputStream, iExecuteService, parsingListener);
            this.setActionDebugParser(parser);
            parser.start();
            // 执行完毕后置为 null
            this.setActionDebugParser(null);
            return true;
        } catch (Exception e) {
            throw new CustomException("解析执行脚本失败,失败原因:" + e.getMessage());
        }
    }

    @Override
    public boolean debugStop() {
        try {
            if (actionDebugParser == null) {
                throw new CustomException("调试停止执行脚本失败,当前执行器不存在!");
            }
            actionDebugParser.stop();
            return true;
        } catch (Exception e) {
            throw new CustomException("停止执行脚本失败,失败原因:" + e.getMessage());
        }
    }

    @Override
    public boolean debugPause() {
        try {
            if (actionDebugParser == null) {
                throw new CustomException("调试暂停执行脚本失败,当前执行器不存在!");
            }
            actionDebugParser.pause();
            return true;
        } catch (Exception e) {
            throw new CustomException("暂停执行脚本失败,失败原因:" + e.getMessage());
        }
    }

    @Override
    public boolean debugResume() {
        try {
            if (actionDebugParser == null) {
                throw new CustomException("调试继续执行脚本失败,当前执行器不存在!");
            }
            actionDebugParser.resume();
            return true;
        } catch (Exception e) {
            throw new CustomException("恢复执行脚本失败,失败原因:" + e.getMessage());
        }
    }
}
