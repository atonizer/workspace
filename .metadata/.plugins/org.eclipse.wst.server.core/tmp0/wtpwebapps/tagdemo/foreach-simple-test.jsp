<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
	// create some sample data. normally provided by MVC
	String[] cities = {"Delhi", "London", "New York", "Moscow", "Mumbai"};

	pageContext.setAttribute("myCities", cities);

%>
<body>

	<c:forEach var="tempCity" items="${myCities}">
		${tempCity} <br/>
	</c:forEach>

</body>
</html>