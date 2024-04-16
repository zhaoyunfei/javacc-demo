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

    @ApiOperation("Lua脚本测试 - luaScriptTest")
    @GetMapping("/test")
    public ResponseEntity<Boolean> luaScriptTest() {
        log.info("Lua脚本测试 - luaScriptTest");
        boolean b = this.iLuaScriptService.luaScriptTest();
        return ResponseEntity.ok(b);
    }
}
