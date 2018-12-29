<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<c:url value="/admin/updateproduct" var="url"></c:url>
<form:form action="${url }" modelAttribute="product">
<pre>
<form:hidden path="id"/>
Enter Productname : <form:input path="productname"/><%--product.getPname() --%>
Enter description : <form:input path="description"/><%--product.getDescription() --%>
Enter price       : <form:input path="price"/>      <%--product.getPrice() --%>
Enter quantity    : <form:input path="quantity"/>   <%--product.getQuantity() --%>
<input type="submit" value="Update Product">
<%--once you enter the data in the input fields, it will call the setter methods
and set the values for all the properties --%>
</pre>

</form:form>
</div>

</body>
</html>