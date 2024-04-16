package com.zhaoyunfei.javacc.module.service;

import com.zhaoyunfei.javacc.module.dto.ARCActionDto;
import com.zhaoyunfei.javacc.module.dto.CircleActionDto;
import com.zhaoyunfei.javacc.module.dto.LineActionDto;
import com.zhaoyunfei.javacc.module.dto.PTPActionDto;

/**
 * @author ZhaoYunFei
 * @since 2024/4/16 15:00
 */
public interface IExecuteService {

    /**
     * 执行调度ptp动作
     *
     * @param dto 调度参数
     * @return 是否执行成功
     */
    boolean executePtpAction(PTPActionDto dto);

    /**
     * 执行调度lin动作
     *
     * @param dto 调度参数
     * @return 是否执行成功
     */
    boolean executeLinAction(LineActionDto dto);

    /**
     * 执行调度arc动作
     *
     * @param dto 调度参数
     * @return 是否执行成功
     */
    boolean executeArcAction(ARCActionDto dto);

    /**
     * 执行调度circle动作
     *
     * @param dto 调度参数
     * @return 是否执行成功
     */
    boolean executeCircleAction(CircleActionDto dto);
}
