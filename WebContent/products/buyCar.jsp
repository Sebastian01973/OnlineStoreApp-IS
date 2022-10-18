<%@page import="controllers.Controller"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.ArrayList, models.ProductManager, models.Product, java.sql.Date, java.time.LocalDate" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Carrito de Compras</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<style><%@include file="/css/storeCopy.css"%></style>
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
			out.print("<h3>Productos Comprados: "+list.size()+"</h3>");%>
		</div>
		<table class="table table-striped table-bordered" id="table">
			<thead class="table-dark">
			<tr>
	            <th scope="col">Id</th>
	            <th scope="col">Nombre del producto</th>
	            <th scope="col">Presentación</th>
	            <th scope="col">Precio</th>
	            <th scope="col">Unidades Compradas</th>
	            <th scope="col">Eliminar</th>
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
			
			<form class="form" action="./FinishBuyServlet" method="get" >
				<button type="submit" id="btn-form" class="btn btn-success">Confirmar Pedido</button>
			</form>
			<div class="row">
			<h3>Detalles</h3>
			<% 
			String NumberInvoice = Controller.getStore().getInvoiceManager().getInvoiceTemp().getNumberInvoice();
			Date datetime = Date.valueOf(LocalDate.now());
			
			out.print("<h3>Numero de Factura: " +NumberInvoice+ " - Fecha: "+ datetime +"</h3>");
			double priceTotal = Controller.store.getInvoiceManager().getInvoiceTemp().calculateSubtotal();
			out.print("<br>");
			out.print("<h2>SubTotal: " +priceTotal+"</h2>");
			
			double priceTotalTotal = Controller.store.getInvoiceManager().getInvoiceTemp().calculatetotal();
			out.print("<br>");
			out.print("<h2>Total: " + priceTotalTotal +"</h2>");
			%>
			
			</div>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>