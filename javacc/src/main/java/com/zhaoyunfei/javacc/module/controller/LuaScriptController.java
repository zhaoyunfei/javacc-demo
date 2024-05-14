package com.zhaoyunfei.javacc.module.controller;

import com.zhaoyunfei.javacc.module.service.ILuaScriptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhaoYunFei
 * @since 2024/4/16 14:28
 */
@Api(tags = "Lua脚本测试")
@Slf4j
@RestController
@RequestMapping("/lua")
public class LuaScriptController {

    private final ILuaScriptService iLuaScriptService;

    public LuaScriptController(ILuaScriptService iLuaScriptService) {
        this.iLuaScriptService = iLuaScriptService;
    }

    @ApiOperation("开始Lua脚本测试 - start")
    @GetMapping("/test")
    public ResponseEntity<Boolean> start() {
        log.info("开始Lua脚本测试 - luaScriptTest");
        boolean b = this.iLuaScriptService.start();
        return ResponseEntity.ok(b);
    }

    @ApiOperation("暂停脚本解析执行 - pause")
    @GetMapping("/pause")
    public ResponseEntity<Boolean> pause(){
        log.info("暂停脚本解析执行 - pause");
        boolean b= this.iLuaScriptService.pause();
        return ResponseEntity.ok(b);
    }

    @ApiOperation("继续脚本解析执行 - resume")
    @GetMapping("/resume")
    public ResponseEntity<Boolean> resume() {
        log.info("继续脚本解析执行 - resume");
        boolean b = this.iLuaScriptService.resume();
        return ResponseEntity.ok(b);
    }

    @ApiOperation("停止脚本解析执行 - stop")
    @GetMapping("/stop")
    public ResponseEntity<Boolean> stop() {
        log.info("停止脚本解析执行 - stop");
        boolean b = this.iLuaScriptService.stop();
        return ResponseEntity.ok(b);
    }


    @ApiOperation("开始调试 - debugStart")
    @GetMapping("/debug-start")
    public ResponseEntity<Boolean> debugStart(){
        log.info("开始调试 - debugStart");
        boolean b = this.iLuaScriptService.debugStart();
        return ResponseEntity.ok(b);
    }


    @ApiOperation("停止调试 - debugStop")
    @GetMapping("/debug-stop")
    public ResponseEntity<Boolean> debugStop() {
        log.info("停止调试 - debugStop");
        boolean b = this.iLuaScriptService.debugStop();
        return ResponseEntity.ok(b);
    }

    @ApiOperation("暂停调试 - debugPause")
    @GetMapping("/debug-pause")
    public ResponseEntity<Boolean> debugPause() {
        log.info("暂停调试 - debugPause");
        boolean b = this.iLuaScriptService.debugPause();
        return ResponseEntity.ok(b);
    }

    @ApiOperation("继续调试 - debugResume")
    @GetMapping("/debug-resume")
    public ResponseEntity<Boolean> debugResume() {
        log.info("继续调试 - debugResume");
        boolean b = this.iLuaScriptService.debugResume();
        return ResponseEntity.ok(b);

    }
}
