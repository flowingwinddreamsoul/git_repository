package com.wujunyu.user.entity.req;

import lombok.Data;

@Data
public class UserListReq {
    private Integer pageIndex;

    private Integer pageSize;
}
