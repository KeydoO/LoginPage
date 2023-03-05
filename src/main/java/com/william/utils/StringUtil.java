package com.william.utils;

/**
 * @Author: Xinyu Wei
 * @Description: 字符串工具类
 * @Date: Created on 2023/3/4
 * @Modified By:
 */
public class StringUtil {

    public static boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }
}
