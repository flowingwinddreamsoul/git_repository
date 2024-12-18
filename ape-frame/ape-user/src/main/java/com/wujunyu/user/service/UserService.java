package com.wujunyu.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wujunyu.entity.PageResult;
import com.wujunyu.user.entity.dto.UserDto;
import com.wujunyu.user.entity.po.UserPo;


public interface UserService  {
    int addUser(UserDto userDto);

    int delete(Long id);

    PageResult<UserPo> getUserPage(UserDto userDto);
}
