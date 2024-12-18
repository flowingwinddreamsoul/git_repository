package com.wujunyu.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private RedisTemplate redisTemplate;
    @GetMapping("/test")
    public String test() {
        return "Holle World!";
    }

    @GetMapping("/testRedis")
    public String testRedis() {
        redisTemplate.opsForValue().set("name", "jichi");
        redisTemplate.opsForValue().set(" name2", "鸡翅");
        return "Holle World!";
    }
}
