<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.ArrayList, models.ProductManager, models.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<style><%@include file="/css/storeStyle.css"%></style>
</head>
<body>
	<div class="header">
      <nav>
        <ul>
          	<li><a href="../index.jsp">Cerrar Sesion</a></li>
        </ul>
      </nav>
	</div>
	<div class="container" style="padding:5px;">
		<div class="row">
			<h3>Lista de productos comprados</h3>
			<% ArrayList<Product> list = (ArrayList<Product>)request.getSession().getAttribute("productListBuy"); 
			out.print("<h3>Productos: "+list.size()+"</h3>");%>
		</div>
		<table class="table table-striped table-bordered" id="table">
			<thead class="table-dark">
			<tr>
	            <th scope="col">Id</th>
	            <th scope="col">Nombre del producto</th>
	            <th scope="col">Presentación</th>
	            <th scope="col">Precio</th>
	            <th scope="col">Unidades Compradas</th>
	            <th scope="col">SubTotal</th>
          	</tr>
			</thead>
			<c:forEach var="product" items="${productListBuy}">
				<tr>
				<td><c:out value="${product.pro_id}"></c:out></td>
				<td><c:out value="${product.pro_name}"></c:out></td>
				<td><c:out value="${product.pro_measure}"></c:out></td>
				<td><c:out value="${product.pro_price}"></c:out></td>
				<td><c:out value="${product.pro_units}"></c:out></td>
				</tr>
			</c:forEach>
			</table>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>