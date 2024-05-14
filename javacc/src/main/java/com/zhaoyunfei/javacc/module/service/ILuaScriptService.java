package com.zhaoyunfei.javacc.module.service;

/**
 * @author ZhaoYunFei
 * @since 2024/4/16 14:39
 */
public interface ILuaScriptService {

    /**
     * 开始lua脚本解析测试
     *
     * @return 是否执行成功
     */
    boolean start();

    /**
     * 暂停脚本解析执行
     *
     * @return 是否暂停成功
     */
    boolean pause();

    /**
     * 继续脚本解析执行
     *
     * @return 是否继续成功
     */
    boolean resume();

    /**
     * 停止脚本解析执行
     *
     * @return 是否停止成功
     */
    boolean stop();


    /**
     * 开始调试
     *
     * @return 是否开始调试成功
     */
    boolean debugStart();

    /**
     * 停止调试
     *
     * @return 是否停止调试成功
     */
    boolean debugStop();

    /**
     * 暂停调试
     *
     * @return 是否暂停调试成功
     */
    boolean debugPause();

    /**
     * 继续调试
     *
     * @return 是否继续调试成功
     */
    boolean debugResume();
}
