<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Data</title>
</head>
<h2>update student</h2>
<body>
<form action="updateStudent" method="post">
    <table>
        <tr>
            <input type="hidden" name="id" value="${student.id}"/>
            <td>First Name</td>
            <td><input type="text" name="firstName" value="${student.firstName}"/></td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td><input type="text" name="lastName" value="${student.lastName}"/></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="text" name="email" value="${student.email}"/></td>
        </tr>
        <tr>
            <td>Course</td>
            <td><input type="text" name="course" value="${student.course}"/></td>
        </tr>
        <tr>
            <td>Fee</td>
            <td><input type="text" name="fee" value="${student.fee}"/></td>
        </tr>
        <tr>
            <td>Mobile</td>
            <td><input type="text" name="mobile" value="${student.mobile}"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Update"/></td>
        </tr>
    </table>
</form>


</body>
</html>