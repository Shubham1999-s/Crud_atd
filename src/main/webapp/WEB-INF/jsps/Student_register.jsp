<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Student Registration</title>
</head>
<h2>Student Data</h2>
<body>
<form action="saveStudent" method="post">
  <table>
    <tr>
      <td>First Name</td>
      <td><input type="text" name="firstName"></td>
    </tr>
    <tr>
      <td>Last Name</td>
      <td><input type="text" name="lastName"></td>
    </tr>
    <tr>
      <td>Email</td>
      <td><input type="text" name="email"></td>
    </tr>
    <tr>
      <td>Course</td>
      <td><input type="text" name="course"></td>
    </tr>
    <tr>
      <td>Fee</td>
      <td><input type="text" name="fee"></td>
    </tr>
    <tr>
      <td>Mobile</td>
      <td><input type="text" name="mobile"></td>
    </tr>
    <tr>
      <td colspan="2"><input type="submit" value="Save"></td>
    </tr>
  </table>
</form>
${msg}






</body>
</html>