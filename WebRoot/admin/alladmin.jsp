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
    
    <title>My JSP 'alladmin.jsp' starting page</title>
    
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
    <script type="text/javascript">
    	function del(){
    		if(!confirm('您确定要删除吗？')){return false;}
    		var qx=${qx};
    		if(qx!=2){
    			alert("您的权限不够！");return false;
    		}
    	}
    	function update(){
    		var qx=${qx};
    		if(qx!=2){
    			alert("您的权限不够！");return false;
    		}
    	}
    </script>
    <ul>
    	<li><s:text name="UserName"/></li>
    	<li><s:text name="PassWord"/></li>
    	<li><s:text name="Name"/></li>
    	<li><s:text name="qx"/></li>
    	<li><s:text name="Update"/></li>
    	<li><s:text name="Delete"/></li>
    </ul>
    <s:iterator value="list">
    <ul onmouseover="this.className='highlight'" onmouseout="this.className=''">
    	<li><s:property value="username"/></li>
    	<li><s:property value="password"/></li>
    	<li><s:property value="name"/></li>
    	<li><s:property value="qx"/></li>
    	<li><s:a href="findadmin.action?id=${id}" onclick=" return update();"><s:textname="Update"/></s:a></li>
    	
    </ul>
    </s:iterator>
  </body>
</html>
