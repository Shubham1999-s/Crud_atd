<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Student</title>
</head>
<h2>All Student data</h2>
<body>
 <table>
             <tr>
                 <th>FirstName</th>
                 <th>LastName</th>
                 <th>Email</th>
                 <th>Course</th>
                 <th>Fee</th>
                 <th>Mobile</th>
                 <th>Update</th>
                 <th>Delete</th>
             </tr>
               <c:forEach var = "students" items="${students}">
				<tr>
					<td>${students.firstName}</td>
					<td>${students.lastName}</td>
					<td>${students.email}</td>
					<td>${students.course}</td>
					<td>${students.fee}</td>
					<td>${students.mobile}</td>
					<td><a href="update?id=${students.id}">update</a></td>
					<td><a href="delete?id=${students.id}">delete</a></td>
			   </tr>
		     </c:forEach>
     </table>

</body>
</html>