<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Store</title>
<link rel="stylesheet" href="$empStyle.css"/>
<style><%@include file="/css/storeStyle.css"%></style>
</head>
<body>
	<div class="header">
      <div class="logo">
        <a href="products/buyCar.jsp"><img src="./images/car.png" id="car" alt="Carrito"></a>
      </div>
      <nav>
        <ul>
          <li><form class="form" action="./ProductListServlet" method="post">
          	<a>
          			<input type="submit" value="Productos" style="background-color: #FF4520; color: white; border: 0px; cursor: pointer;"/> 
          	</a>
          </form></li>
          <li>
          <form action="./LogOutServlet" method="post">
          <a>
          <input type="submit" value="Cerrar Sesion" style="background-color: #FF4520; color: white; border: 0px; cursor: pointer;"/>
          </a>
          </form>
          </li>
        </ul>
      </nav>
	</div>
</body>
</html>