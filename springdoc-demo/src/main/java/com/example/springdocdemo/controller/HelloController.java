package com.example.springdocdemo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Tag(name = "Hello 接口", description = "一个简单的测试接口")
public class HelloController {

    @GetMapping("/hello")
    @Operation(summary = "问好接口", description = "返回 hello + 用户名")
    public String sayHello(@RequestParam(defaultValue = "World") String name) {
        return "Hello, " + name + "!";
    }
}
