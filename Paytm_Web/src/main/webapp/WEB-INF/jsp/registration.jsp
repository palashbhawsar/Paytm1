<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>insert title</title>
</head>
<body bgcolor="AliceBlue ">

<form:form method="POST" action="saveRegistration.do"
		modelAttribute="UserRegistration">
		<table width="100%" border="0">
			
			
			<tr>
			<td>
			<div class="form-control">	
			<label>
		<h2>First Name</h2> 
	<p>	<form:errors path="first_name" class = "label error-label"></form:errors></p>
		<form:input path="first_name" placeholder="Enter first name" id="first_name" />
			</label>
			</div>
			</td>
			</tr>

			<tr>
			<td>
			<div class="form-control">
			<label>
			<h2>Last Name</h2>
	<p>		<form:errors path="last_name" class = "label error-label"></form:errors></p>
		    <form:input path="last_name" placeholder="Enter Last Name" id="last_name" />
			</label>
			</div>
			</td>
			</tr>
			
		
			<tr>
			<td>
			<div class="form-control">
			<label>
			<h2>Mobile No</h2>
		<p>	<form:errors path="mobile_no" class = "label error-label"></form:errors></p>
			<form:input path="mobile_no" placeholder="Enter Mobile Number" id="mobile_no" />
			</label>
			</div>
			</td>
			</tr>
			
			<tr>
			<td>
			<div class="form-control">
		<label>
			<h2>Email Id</h2>
			<p>	<form:errors path="email_id" class = "label error-label"></form:errors> </p>
			 <form:input path="email_id" placeholder="Enter email id" id="email_id" />
			</label>
			</div>
			</tr>
			
			<tr>
			<td>
			<div class="form-control">
			<label>
			<h2>Password</h2>
            <p><form:errors path="password" class = "label error-label"></form:errors></p>
			<form:password path="password" placeholder="Enter password" id="password" />
			</label>
			</div>
			</td>
			</tr>
			
			<tr>
			<td>
			<div class="form-control">
			<label>
			<h2>Address</h2>
	<p><form:errors path="address" class = "label error-label"></form:errors></p>
			<form:input path="address" placeholder="Enter address" id="address" />
			</label>
			</div>
			</td>
			</tr>
			
			<tr>
			<td><input type="submit" value="Registration"></td>
			</tr>
		    </table>
	        </form:form>
</body>
</html>