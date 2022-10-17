<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.ArrayList, models.ProductManager, models.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Catalogo de productos</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<style><%@include file="/css/storeStyle.css"%></style>
</head>
<body>
	<div class="header">
      <nav>
        <ul>
        	<li><button class="btn btn-success">Realizar compra</button></li>
          	<li><a href="index.jsp">Cerrar Sesion</a></li>
        </ul>
      </nav>
	</div>
	<div class="container" style="padding:5px;">
		<div class="row">
			<h3>Lista de productos</h3>
			<% ArrayList<Product> list = (ArrayList<Product>)request.getSession().getAttribute("productList"); 
			out.print("<h3>Productos: "+list.size()+"</h3>");%>
		</div>
		<table class="table table-striped table-bordered" id="table">
			<thead class="table-dark">
			<tr>
	            <th scope="col">Id</th>
	            <th scope="col">Nombre del producto</th>
	            <th scope="col">Presentación</th>
	            <th scope="col">Precio</th>
	            <th scope="col">Unidades disponibles</th>
	            <th scope="col">Seleccionar</th>
	            <th scope="col">Unidades a comprar</th>
          	</tr>
			</thead>
			<c:forEach var="product" items="${productList}">
				<c:if test="${product.pro_units > 5}">
					<tr>
					<td><c:out value="${product.pro_id}"></c:out></td>
					<td><c:out value="${product.pro_name}"></c:out></td>
					<td><c:out value="${product.pro_measure}"></c:out></td>
					<td><c:out value="${product.pro_price}"></c:out></td>
					<td><c:out value="${product.pro_units}"></c:out></td>
					<td><input class="form-check-input mt-0" type="checkbox" value="${product.pro_id }"></td>
					<td><input type="number" min="0" max="${product.pro_units}" value="0"></td>
				</tr>
				</c:if>
			</c:forEach>
		</table>
	</div>
	<!-- JavaScript Bundle with Popper -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>