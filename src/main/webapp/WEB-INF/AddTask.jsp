<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Task</title>
</head>
<body>
<form action="AddTask" method="post">
Task:
<input type="text" name="task" /><br/>
Date:
<input type="text" name="date" /><br/>
<input type="submit" name="submit" value="Add Task" />
</form>
</body>
</html>