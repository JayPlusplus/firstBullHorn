<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2> Log in to join our site </h2>
<form action = "LoginServlet" method="post"> 
 Email: <input type = "text" name = "email" id = "email"></input><br/>
 Password<input type = "password" name = "password" id = "password"></input><br/>
 <input type="reset" value="Reset"></input>
 <input type="submit" value="Log In"></input>
 </form>
 
</body>