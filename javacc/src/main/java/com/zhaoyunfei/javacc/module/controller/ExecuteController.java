package com.zhaoyunfei.javacc.module.controller;

import com.zhaoyunfei.javacc.module.dto.ARCActionDto;
import com.zhaoyunfei.javacc.module.dto.CircleActionDto;
import com.zhaoyunfei.javacc.module.dto.LineActionDto;
import com.zhaoyunfei.javacc.module.dto.PTPActionDto;
import com.zhaoyunfei.javacc.module.service.IExecuteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhaoYunFei
 * @since 2024/4/16 14:57
 */
@Api(tags = "执行相关接口")
@Slf4j
@RestController
@RequestMapping("/execute")
public class ExecuteController {

    private final IExecuteService iExecuteService;

    public ExecuteController(IExecuteService iExecuteService) {
        this.iExecuteService = iExecuteService;
    }

    @ApiOperation("执行PTP动作 - executePtpAction")
    @PostMapping("/ptp")
    public ResponseEntity<Boolean> executePtpAction(@RequestBody PTPActionDto dto) {
        log.info("executePtpAction - dto:{}", dto);
        boolean b = this.iExecuteService.executePtpAction(dto);
        return ResponseEntity.ok(b);
    }

    @ApiOperation("执行LIN动作 - executeLinAction")
    @PostMapping("/lin")
    public ResponseEntity<Boolean> executeLinAction(@RequestBody LineActionDto dto) {
        log.info("executeLinAction - dto:{}", dto);
        boolean b = this.iExecuteService.executeLinAction(dto);
        return ResponseEntity.ok(b);
    }

    @ApiOperation("执行ARC动作 - executeArcAction")
    @PostMapping("/arc")
    public ResponseEntity<Boolean> executeArcAction(@RequestBody ARCActionDto dto) {
        log.info("executeArcAction - dto:{}", dto);
        boolean b = this.iExecuteService.executeArcAction(dto);
        return ResponseEntity.ok(b);
    }

    @ApiOperation("执行Circle动作 - executeCircleAction")
    @PostMapping("/circle")
    public ResponseEntity<Boolean> executeCircleAction(@RequestBody CircleActionDto dto) {
        log.info("executeCircleAction - dto:{}", dto);
        boolean b = this.iExecuteService.executeCircleAction(dto);
        return ResponseEntity.ok(b);
    }
}
