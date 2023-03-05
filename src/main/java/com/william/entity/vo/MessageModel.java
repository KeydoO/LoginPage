package com.william.entity.vo;

/**
 * @Author: Xinyu Wei
 * @Description: 消息模型对象，用来做数据响应（状态码，提示信息，回显数据）
 * @Date: Created on 2023/3/4
 * @Modified By:
 */
public class MessageModel {

    private Integer code = 1;  // (1成功，0失败)
    private String msg = "成功！";
    private Object object;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
