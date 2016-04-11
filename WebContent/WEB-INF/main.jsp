<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Board List</title>
</head>
<body>
<div class="navigation">
<strong>Home</strong> | 
<a href="http://localhost:8088/SpringMVCProject">Sign Out</a>
</div>
	<h1>Welcome, ${user.username}!</h1>
	<p>Select a board to view the topics</p>
	<ul>
		<c:forEach items="${availableBoards}" var="board"> 
		    <li><a href="boards/${board.boardID}"> ${board.boardName} </a></li>
		</c:forEach>
	</ul>
</body>
</html>