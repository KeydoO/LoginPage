<%--
  Created by IntelliJ IDEA.
  User: Xinyu Wei
  Date: 2023/3/3
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SignIn</title>
</head>
<body>
<div style="text-align: center">
  <form action="login" method="post" id="loginForm">
    姓名：<label for="uname"></label><input type="text" name="uname" id="uname" value="${messageModel.object.userName}"> <br>
    密码：<label for="upwd"></label><input type="password" name="upwd" id="upwd" value="${messageModel.object.userPwd}"> <br>
    <span id="msg" style="font-size: 12px; color: red">${messageModel.msg}</span> <br>
    <button type="button" id="loginBtn">登录</button>
    <button type="button">注册</button>
  </form>
</div>
</body>

<script type="text/javascript" src="http://code.jquery.com/jquery-3.4.1.js"></script>
<script type="text/javascript">
  $("#loginBtn").click(function () {
    var uname = $("#uname").val();
    var upwd = $("#upwd").val();
    if (isEmpty(uname)) {
      $("#msg").html("用户姓名不能为空");
      return;
    }
    if (isEmpty(upwd)) {
      $("#msg").html("用户密码不能为空");
      return;
    }
    $("#loginForm").submit();
  });
  
  function isEmpty(str) {
    return str == null || str.trim() === "";
  }
</script>

</html>
