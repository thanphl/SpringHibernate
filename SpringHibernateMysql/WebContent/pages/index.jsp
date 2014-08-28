<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="add.htm" commandName="user">
		<table>
			<tr>
				<td>Nickname:</td>
				<td><form:input path="nickname" /> ${error}</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Register"></td>
		</table>
	</form:form>
	<c:if test="${fn:length(userinfo) > 0}">
		<table cellpadding="5">
			<tr class="even">
				<th>id</th>
				<th>nickname</th>
			</tr>
			<c:forEach items="${userinfo}" var="user" varStatus="status">
				<tr>
					<td>${user.u_id}</td>
					<td>${user.nickname}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>