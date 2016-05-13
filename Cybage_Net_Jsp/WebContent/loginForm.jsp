<%@page import="com.dao.LoginDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>loginForm</title>
</head>
<body>
<jsp:useBean id="userDto" class="com.dto.UserDto" scope="session"></jsp:useBean>
<jsp:useBean id="loginDao" class="com.dao.LoginDao" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="userDto"/>
${status}
<form action="#" method="post">
<table>
<tr>
<td>USERNAME :</td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td>PASSWORD :</td>
<td><input type="password" name="pass"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="LOGIN" name="btn"></td>
</tr>
</table>
</form>

<c:if test="${param.btn eq 'LOGIN'}">


<%
LoginDao lDao =(LoginDao) session.getAttribute("loginDao");
String result = lDao.getCheckUserCredintials(request.getParameter("name"), request.getParameter("pass"));

if(result.contains("f"))
{
	%>
	<c:set var="status" value="Invalid username or password" scope="session"></c:set>
	<c:redirect url="loginForm.jsp"></c:redirect>
	<%
}
else
{
	if(result.equals("U"))
	{
	%>
	<c:redirect url="user.jsp"></c:redirect>
	<%
	}
	if(result.equals("A"))
	{
	%>
	<c:redirect url="admin.jsp"></c:redirect>
	<%
	}
	
}

%>


</c:if>


</body>
</html>
