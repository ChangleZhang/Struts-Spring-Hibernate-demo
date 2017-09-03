<%@ page language="java" import="java.util.*,member.Member,member.MemberDAO" pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'submit.jsp' starting page</title>
    
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
    <%
    	String username = request.getParameter("username");
    	String password = request.getParameter("password");
    	MemberDAO md = new MemberDAO();
    	Member m = new Member();
    	m.setUsername(username);
    	m.setPassword(password);
    	md.save(m);
    	out.print("注册成功<br>");
    	List l = null;
    	l = md.findByProperty("username",username);
    	Iterator i = l.iterator();
    	out.print("从数据库中加载类对象");
    	if(i.hasNext()){
    		m=(Member)i.next();
    		out.print("用户名："+m.getUsername()+"<br>");
    		out.print("密码"+m.getPassword()+"<br>");}
    	else{
    	out.print("数据库中不存在该用户!");
    	}
    %>
  </body>
</html>
