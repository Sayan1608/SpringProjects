<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="container mt-3">

		<h1>Add Student Form</h1>
		<a href="showFormForAdd" class="btn btn-primary"> Add Student </a><br>
		<br>
		<div class="row">

			<table class="table table-hover" border="2px">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Name</th>
						<th scope="col">Country</th>
						<th scope="col">Department</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="std" items="${Students}">
						<tr>
							<td class="table-plus">${std.studentId}</td>
							<td>${std.studentName}</td>
							<td>${std.country}</td>
							<td>${std.department}</td>
							<td>
								<!-- Add "update" button/link --> <a
								href="/SpringMVCLab5-StudentManagementSystem/student/showFormForUpdate?studentId=${std.studentId}">Update
							</a>
							</td>
							<td>
								<!-- Add "delete" button/link --> <a
								href="/SpringMVCLab5-StudentManagementSystem/student/delete?studentId=${std.studentId}">
									Delete </a>

							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>