package com.william.controller;

import com.william.entity.vo.MessageModel;
import com.william.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: Xinyu Wei
 * @Description:
 * @Date: Created on 2023/3/4
 * @Modified By:
 */

@WebServlet("/login")
public class UserServlet extends HttpServlet {

    private UserService userService = new UserService();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("uname");
        String upwd = request.getParameter("upwd");

        MessageModel messageModel = userService.userLogin(uname, upwd);
        if (messageModel.getCode() == 1) {
            request.getSession().setAttribute("user", messageModel.getObject());
            response.sendRedirect("index.jsp");
        } else {
            request.setAttribute("messageModel", messageModel);
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
