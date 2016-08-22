<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*,edu.javalearn.jsp.tagdemo.Student"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
	// just create some sample data
	List<Student> data = new ArrayList<>();

	data.add(new Student("John", "Doe", false));
	data.add(new Student("Andrei", "Chikatilo", true));
	data.add(new Student("Jane", "Doe", false));

	pageContext.setAttribute("myStudemts", data);
%>
<body>

	<table border="1">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Gold Customer</th>
		</tr>
		<c:forEach var="tempStudent" items="${myStudemts}">
			<tr>
				<td>${tempStudent.firstName}</td>
				<td>${tempStudent.lastName}</td>
				<td>
					<c:if test="${tempStudent.goldCustomer}">
						Specisl Discount
					</c:if>
					<c:if test="${not tempStudent.goldCustomer}">
						-
					</c:if>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>