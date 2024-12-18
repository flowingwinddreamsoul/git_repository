package com.wujunyu.user.entity.dto;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.util.Date;

@Data
public class UserDto {

    private String name;

    private String age;

    private Integer pageIndex;

    private Integer pageSize;
}
