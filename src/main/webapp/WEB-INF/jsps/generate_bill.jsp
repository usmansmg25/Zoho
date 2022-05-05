<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GENERATE BILL</title>
</head>
<body>
<h2>GENERATE</h2>
<form action="generate" method="post">
   <pre>
    First Name<input type="text" name="firstName" value="${contact.firstName}"/>
    Last Name<input type="text" name="lastName" value="${contact.lastName}"/>
    Email<input type="email" name="email" value="${contact.email}"/>
    mobile <input type="mobile" name="mobile" value="${contact.mobile}"/>
    product Name<input type="text" name="productName">
    Amount Paid <input type="text" name="amount">
  <input type="submit" value="generateBill">
   </pre>
    
    
    
</form>
</body>
</html>