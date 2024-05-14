package com.zhaoyunfei.javacc.module.listener;

/**
 * @author ZhaoYunFei
 * @since 2024/4/28 14:51
 */
public interface ParsingListener {


    void onParsingRead(int currentLine,int status);
}
