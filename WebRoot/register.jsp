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
    
    <title>My JSP 'register.jsp' starting page</title>
    
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
	<h3><s:text name="UserRegister"/></h3>
	<s:form action="register" method="post" namespace="/register">
		<s:textfield name="username" key="UserName"/>
		<s:password name="password" key="PassWord"/>
		<s:textfield name="name" key="Name"/>
		<s:textfield name="nic" key="NickName"/>
		<s:textfield name="sex" key="Sex"/>
		<s:textfield name="age" key="Age"/>
		<s:textfield name="email" key="Email"/>
		<s:textfield name="phone" key="Phone"/>
		<s:textfield name="selfshow" key="brief.introduction"/>
		
		<s:submit key="Register"/>
	</s:form>
  </body>
</html>
