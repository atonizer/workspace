<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%!
public void jspInit(){
	String defaultName = getServletConfig().getInitParameter("defaultName");
	ServletContext context = getServletContext();
	context.setAttribute("defaultName", defaultName);
}

%>

<body>

<p>The InitParam value is : <%=getServletConfig().getInitParameter("defaultName") %></p>	
<br/>
<p>The ServletContext value is <%=getServletContext().getAttribute("defaultName") %></p>

</body>
</html>