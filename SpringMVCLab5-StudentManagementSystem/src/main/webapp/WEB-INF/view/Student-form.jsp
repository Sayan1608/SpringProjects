<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/SpringMVCLab5-StudentManagementSystem/student/save" method="POST" >
	<input type="hidden" name="studentId" value="${Student.studentId}" /><br>
	<input type="text" name="studentName" value="${Student.studentName}" placeholder="Student Name"><br>
	<input type="text" name="department" value="${Student.department}" placeholder="Department"><br>
	<input type="text" name="country" value="${Student.country}" placeholder="Country"><br>
	<button type="submit" >Save</button>

		</form>

		<hr>
		<a href="/SpringMVCLab5-StudentManagementSystem/student/list">Back to Students List</a>
	
</body>
</html>