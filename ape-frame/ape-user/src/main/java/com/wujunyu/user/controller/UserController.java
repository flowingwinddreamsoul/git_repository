package com.wujunyu.user.controller;

import com.wujunyu.bean.Result;
import com.wujunyu.user.entity.dto.UserDto;
import com.wujunyu.user.entity.req.UserListReq;
import com.wujunyu.user.entity.req.UserReq;
import com.wujunyu.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public Result addUser(@RequestBody UserReq userReq) {
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userReq, userDto);
        return Result.ok(userService.addUser(userDto));
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id) {
        return Result.ok(userService.delete(id));
    }

    @GetMapping("/getPage")
    public Result getUserPage(@RequestBody UserListReq userListReq) {
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userListReq, userDto);
        return Result.ok(userService.getUserPage(userDto));
    }
}
