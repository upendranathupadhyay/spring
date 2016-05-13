<%@page import="com.dao.AdminDao"%>
<%@page import="com.dao.LoginDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<h1>Hello ${userBean.name}</h1>
<h3>${status}</h3>
<form action="#">
<input type="submit" name="addBook"  value ="ADD">&nbsp&nbsp&nbsp
<input type="submit" name="deleteBook"  value ="DELETE">&nbsp&nbsp&nbsp
<input type="submit" name="deleteBook"  formaction="LogoutServlet" value ="LOGOUT">
</form>
<%


LoginDao loginDao =(LoginDao) session.getAttribute("loginDao");
AdminDao adminDao = new AdminDao(loginDao.getCon());
session.setAttribute("adminDao", adminDao);
%>

<c:if test="${param.addBook eq 'ADD'}">
<h1>1</h1>


<h2>ENTER BOOK DETAILS</h2>
<form action="AddBookServlet" method="post">
<table>
<tr>
<td>
BOOK NAME :
</td>
<td>
<input type="text" name="bname">
</td>
</tr>

<tr>
<td>
BOOK AUTHOR :
</td>
<td>
<input type="text" name="bauthor">
</td>
</tr>

<tr>
<td>
BOOK Price :
</td>
<td>
<input type="text" name="bprice">
</td>
</tr>

<tr>
<td colspan="2">
<input type="submit" name="add">
</td>
</tr>

</table>
</form>
</c:if>

<c:if test="${param.deleteBook eq 'DELETE'}">
<h1>2</h1>
<form action="DeleteBookServlet" method="post">


<table>
<c:forEach items="${adminDao.books}" var="book">
<tr>
<td> <input type="checkbox" value="${book.bookId}" name="books"> </td>


<td> ${book.bookName} </td>


<td> ${book.bookAuthor} </td>
</tr>
</c:forEach>
<tr>
<td colspan="2"><input type="submit" value="DELETE BOOKS"></td>
</tr>
</table>
</form>



</c:if>

</body>
</html>