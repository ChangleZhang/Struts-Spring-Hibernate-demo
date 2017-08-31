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
    
    <title>My JSP 'selectinfo.jsp' starting page</title>
    
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
	<s:text name="show.info"/>
	<s:form action="update" method="post">
		<s:textfield name="username" key="UserName" value="${users.username}" readonly="true"/>
		<s:textfield name="password" key="PassWord" value="${users.password}"/>
		<s:textfield name="name" key="Name" value="${users.name }"/>
		<s:textfield name="nic" key="NickName" value="${users.nic }"/>
		<s:textfield name="sex" key="Sex" value="${users.sex }"/>
		<s:textfield name="age" key="Age" value="${users.age }"/>
		<s:textfield name="email" key="Email" value="${users.email }"/>
		<s:textfield name="phone" key="Phone" value="${users.phone }"/>
		<s:textfield name="selfshow" key="brief.introduction" value="${users.SelfShow }"/>
		<s:hidden name="id" value="${users.id }"/>
		<s:submit key="Update"/>
	</s:form>
  </body>
</html>
