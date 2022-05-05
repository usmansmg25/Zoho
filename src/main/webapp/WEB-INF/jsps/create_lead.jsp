<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CREATE | LEAD</title>
</head>
<body>
<h2>Create | lead</h2>
<form action="/savelead" method="post">
   <pre>
    First Name<input type="text" name="firstName"/>
    Last Name<input type="text" name="lastName"/>
    Email<input type="email" name="email"/>
    Lead Source
    <select name="leadSource">
  <option value="tv commercial">TV Commercial</option>
  <option value="radio">radio</option>
  <option value="news paper">news paper</option>
  <option value="online">online</option>
  
</select>
  mobile <input type="mobile" name="mobile"/>
  <input type="submit" value="save">
   </pre>
    
    
    
</form>
</body>
</html>