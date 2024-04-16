package com.zhaoyunfei.javacc.module.service.impl;

import com.zhaoyunfei.javacc.module.dto.ARCActionDto;
import com.zhaoyunfei.javacc.module.dto.CircleActionDto;
import com.zhaoyunfei.javacc.module.dto.LineActionDto;
import com.zhaoyunfei.javacc.module.dto.PTPActionDto;
import com.zhaoyunfei.javacc.module.service.IExecuteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author ZhaoYunFei
 * @since 2024/4/16 15:00
 */
@Slf4j
@Service
public class ExecuteServiceImpl implements IExecuteService {

    @Override
    public boolean executePtpAction(PTPActionDto dto) {
        // 执行ptp具体业务逻辑
        log.info("执行ptp业务成功:{}", dto);
        return true;
    }

    @Override
    public boolean executeLinAction(LineActionDto dto) {
        // 执行lin具体业务逻辑
        log.info("执行lin业务成功:{}", dto);
        return true;
    }

    @Override
    public boolean executeArcAction(ARCActionDto dto) {
        // 执行arc具体业务逻辑
        log.info("执行arc业务成功:{}", dto);
        return true;
    }

    @Override
    public boolean executeCircleAction(CircleActionDto dto) {
        // 执行circle具体业务逻辑
        log.info("执行circle业务成功:{}", dto);
        return true;
    }
}
