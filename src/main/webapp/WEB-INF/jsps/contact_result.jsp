<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h2>List of contact</h2>
  <table border="2">
    <tr>
    <th>Id</th>
    <th>First Name</th>
    <th>Last Name</th>
    <th>email</th>
    <th>Lead Source</th>
    <th>Mobile</th>
    <th>Billing</th>
    
    </tr>
    <c:forEach items="${contacts}" var="contacts">
    <tr>
    <td>${contacts.id}</td>
    <td><a href="getLeadById?id=${contacts.id}">${contacts.firstName}</a></td>
    <td>${contacts.lastName}</td>
    <td>${contacts.email}</td>
    <td>${contacts.leadSource}</td>
    <td>${contacts.mobile}</td>
    <td><a href="getContactbyid?id=${contacts.id}">Generate bill</a></td>
    
    </tr>
    
    </c:forEach>
    
  </table>
</body>
</html>