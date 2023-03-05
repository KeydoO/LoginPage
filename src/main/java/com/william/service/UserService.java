package com.william.service;

import com.william.entity.User;
import com.william.entity.vo.MessageModel;
import com.william.mapper.UserMapper;
import com.william.utils.GetSqlSession;
import com.william.utils.StringUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @Author: Xinyu Wei
 * @Description: 业务逻辑判断
 * @Date: Created on 2023/3/4
 * @Modified By:
 */
public class UserService {
    public MessageModel userLogin(String uname, String upwd) {
        MessageModel messageModel = new MessageModel();

        User u = new User();
        u.setUserName(uname);
        u.setUserPwd(upwd);
        messageModel.setObject(u);

        // 判断传入的数据是否为空，为空的话要进行回显
        if (StringUtil.isEmpty(uname) || StringUtil.isEmpty(upwd)) {
            messageModel.setCode(0);
            messageModel.setMsg("用户姓名和密码不能为空！");
            return messageModel;
        }

        // 调用mapper层从数据库中查找用户和对应的密码
        SqlSession session = GetSqlSession.createSqlSession();
        assert session != null;
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.queryUserByName(uname);
        // 没找到用户
        if (user == null) {
            messageModel.setCode(0);
            messageModel.setMsg("用户名不存在！");
            return messageModel;
        }
        // 用户密码不正确
        if (!upwd.equals(user.getUserPwd())) {
            messageModel.setCode(0);
            messageModel.setMsg("密码错误！");
            return messageModel;
        }
        // 登陆成功，将用户信息放入消息模型中
        messageModel.setObject(user);
        return messageModel;
    }
}
