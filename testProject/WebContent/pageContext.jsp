<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String name = request.getParameter("name");
if(name !=null){
	pageContext.setAttribute("PCname", name);
	session.setAttribute("Sname", name);
	application.setAttribute("Aname", name);
}
%>

<br/>
<p>Request Object <%=name %></p>

<br/>
<p>Session Object <%=session.getAttribute("Sname") %></p>

<br/>
<p>Application Object <%=application.getAttribute("Aname") %></p>

<br/>
<p>PageContext Object <%=pageContext.getAttribute("PCname") %></p>



</body>
</html>