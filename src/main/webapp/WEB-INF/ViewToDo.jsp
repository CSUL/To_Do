<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>GuestBook</title>
</head>
<body>
<table border="2">
<tr><th>Task</th><th>Date</th><th>Done</th>
</tr>
<c:forEach items="${toDoList}" var="toDo" varStatus="status">
<tr>
<c:if test="${toDo.complete}">
 <td><strike>${toDo.task}</strike></td>
</c:if>
<c:if test="${not toDo.complete}"> 
 <td>${toDo.task }</td>
</c:if> 

<td>${toDo.date }</td>
<td><a href="TaskDone?id=${status.index}">X</a></td>
</tr>
</c:forEach>
<tr><td><form action="AddTask" method ="post"> <input type = 'text' name = 'task'/></td><td><button >Add</button></form><td></tr>
</table>

</body>
</html>