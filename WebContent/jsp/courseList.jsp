<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" 
integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<title>Course List</title>
</head>
<body>
	<table class= "table table-hover table-striped">
		<thead class="">
		<tr>
			<th scope="col">Id</th>
			<th scope="col">Name</th>
		</tr>
		</thead>
		
		<tbody>
		<c:forEach var="course" items="${courseList}">
			<tr>
				<td>${course.id}</td>
				<td>${course.name}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<h1>${hole}</h1>
</body>
</html>