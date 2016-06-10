<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="Bisque">
<form:form method="POST" action="saveUser.do" modelAttribute="UserRegistration1" >
  <table width="100%" border="0">
		<tr>
		<td>
		<div class="form-control">
		<label>
	<p>	<form:errors path="email_id" class = "label error-label"></form:errors> </p>
		</p> User Name<form:input path="email_id" id="email_id"></form:input>
		</label>
		</div>
		</td>
		</tr>
		
		<tr>
		<td>
		<div class="form-control">
		<label>
		<p><form:errors path="password" class = "label error-label"></form:errors></p>
		</p> Password<form:password path="password" id="password" />
		</label>
		</div>
		</td>
		</tr>
			
		<tr>
		<td colspan="2"><input type="submit" value="Submit"/></td>
		</tr>
		</table>
	
</form:form>
</body>
</html>