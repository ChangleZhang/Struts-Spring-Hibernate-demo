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
    
    <title>My JSP 'Tags.jsp' starting page</title>
    
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
    <s:bean name="com.Person" id="p">
    	<s:param name="name" value="'challen'"/>
    	<s:param name="sex" value="'男'"></s:param>
    	<s:param name ="age" value="24"></s:param>
    </s:bean>
    姓名：<s:property value="#p.name"/>
    性别：<s:property value="#p.sex"/>
    年龄：<s:property value="#p.age"/><br>
    <s:debug/>
    
    <s:form>
    	<s:combobox label="booklist" labelposition="left" size ="20" maxlength="20" name="boooks" list="{'java1','java2','java3'}"/>
    	<s:bean name="com.BOokService" id="bs"/>
    	<s:combobox label="booklist" name="book" labelposition="lfet" list="#bs.books" listKey="name" listValue="name"/>
    </s:form>
    <br>
    <br>
    <s:select label="field you interested in" name="skillsArea" list="#{'js':'js','ajax':'ajax'}">
    	<s:optgroup label="java web" list="#{'jsp':'jsp','servlet':'servlet','javaben':'javabean' }" listKey="value" listValue="key">
    	</s:optgroup>
    	<s:optgroup label="java open stack" list="#{'ssh':'ssh','ssm':'ssm','hibernate':'hibernate' }" listKey="value" listValue="key">
    	</s:optgroup>
    </s:select>
    <br>
    <br>
    <h3>使用tree和treenode标签生成静态树</h3>
    
  </body>
</html>
