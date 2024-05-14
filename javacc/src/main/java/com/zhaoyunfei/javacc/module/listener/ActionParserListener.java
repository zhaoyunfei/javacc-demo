package com.zhaoyunfei.javacc.module.listener;

import com.zhaoyunfei.javacc.module.vo.ParserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

/**
 * @author ZhaoYunFei
 * @since 2024/4/28 14:56
 */
@Slf4j
@Service
public class ActionParserListener implements ParsingListener {

    private final SimpMessagingTemplate simpMessagingTemplate;

    public ActionParserListener(SimpMessagingTemplate simpMessagingTemplate) {
        this.simpMessagingTemplate = simpMessagingTemplate;
    }

    @Override
    public void onParsingRead(int currentLine,int status) {
        ParserInfo info=new ParserInfo();
        info.setCurrentLine(currentLine);
        info.setStatus(status);
        this.simpMessagingTemplate.convertAndSend("/topic/currentLine",info);
    }
}
