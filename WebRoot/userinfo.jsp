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
    
    <title>My JSP 'userinfo.jsp' starting page</title>
    
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
   读取session中的信息，欢迎：<s:property value="#session.login"/> !<br>
   读取application中的信息，欢迎：<s:property value = "#application.login"/>!<br>
   if-else if-else的使用<br>
   <s:set name = "dengji" value="85"/>
   <s:if test="#dengji>=90">成绩优秀</s:if>
   <s:elseif test="#dengji>=80">成绩一般</s:elseif>
   <s:else>成绩不合格</s:else>
   <br>iterator的使用<br>
   <s:iterator value="{'val1','val2','val3'}" id="bookname" status="st">
   		<ul <s:if test="#st.odd"> style="color:red"</s:if>>
   			<li> <s:property value="bookname"/></li>
   		</ul>
   </s:iterator>
   <br>输出Map对象<br>
   <ul style="width:500px">
   		<li style="width:200px;float:left;">姓名</li><li style = "width:300px;float:left;">年龄</li>
   </ul>
   <s:iterator value="#{'aa':'20','bb':'21','cc':'22' }" status="st">
   		<ul <s:if test="#st.odd">style="background-color:wheat;width:500px;float:left;"</s:if>>
   			<li style="width:200px;float:left;"><s:property value="key"/></li>
   			<li style="width:300px;float:left;"><s:property value="value"/></li>
   		</ul>
   </s:iterator>
   <br>append标签的使用<br>
   <s:append id="newList">
   		<s:param value="{'val1','val2','val3'}"/>
   		<s:param value="{'val4','val5','val6'}"/>
   </s:append>
   <s:iterator value="#newList" status="st">
   	<ul <s:if test="#st.odd">style="background-color:wheat;width:500px;"</s:if>>
   		<li style="width:500px;"><s:property/></li>
   	</ul>
   </s:iterator>
   
   <br>接下来是sort方法的演示。<br>
   <s:bean id="mycomparator" name="com.MyComparator"/>
   <s:sort source="{'java333','java','java1','java22'}" comparator="#mycomparator">
   		<s:iterator status="st">
   		<li><s:property/></li>
   		</s:iterator>
   	</s:sort>
  </body>
</html>
