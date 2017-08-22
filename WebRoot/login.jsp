<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div style="margin:30px 50px 20px 50px;text-align:center">
    <div style="font-size:14px;font-weight:bold">用户登录</div>
    <div>
    <s:form action="checkLogin" namespace="/login">
    <s:textfield name="username" style="font-size:12px;width:120px" label="登录名称"/>
    <s:password name="password" style="font-size:12px;width:120px" label="登录密码"/>
    <s:submit value="登录"/>
    </s:form>
    </div>
    </div>
  </body>
</html>
