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
    	out.print("ע��ɹ�<br>");
    	List l = null;
    	l = md.findByProperty("username",username);
    	Iterator i = l.iterator();
    	out.print("�����ݿ��м��������");
    	if(i.hasNext()){
    		m=(Member)i.next();
    		out.print("�û�����"+m.getUsername()+"<br>");
    		out.print("����"+m.getPassword()+"<br>");}
    	else{
    	out.print("���ݿ��в����ڸ��û�!");
    	}
    %>
  </body>
</html>
