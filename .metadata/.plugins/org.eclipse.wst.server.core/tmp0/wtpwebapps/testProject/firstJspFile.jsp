<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
public int sum(int a, int b){
	return a+b;
}
%>
<%
int i=1;
int b=2;
int a = i+b;
%>

<%int k = sum(10, 20); %>

<h3>The value of a is : <%=a %></h3>
<h3>The value of k is : <%=k %></h3>
<br/>

<%for(int j = 0; j<10; j++){
%>
	
	<b>The value of j is: <%=j %></b>
	<br/>


<% }%>

<p>The current Time and Date is : <%= new Date() %></p>


</body>
</html>