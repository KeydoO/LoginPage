package com.william.mapper;

import com.william.entity.User;

/**
 * @Author: Xinyu Wei
 * @Description: 用户接口类
 * @Date: Created on 2023/3/3
 * @Modified By:
 */
public interface UserMapper {
    public User queryUserByName(String userName);
}
