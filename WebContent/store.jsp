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
<div>
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
	
	<div class="sales">
	
  <div class="">
  <br>
    <img src="./images/descuento.png" style="width:100%">
  </div>
  </div>
  
  <div class="categorias">
  
  <h1>Comprar por categorias</h1>
  
  <div class="container">
            <a href="#">
            	<img src="./images/despensa.png" alt="despensa" width="170" height="170">  
            </a>
            <div class="desc">Despensa</div>
   </div>
    <div class="container">
            <a href="#">
            	<img src="./images/lacteos.png" alt="lacteos" width="170" height="170">  
            </a>
            <div class="desc">Derivados lácteos</div>
    </div>
    <div class="container">
            <a href="#">
            	<img src="./images/refrigerados.png" alt="refrigerados" width="170" height="170">  
            </a>
            <div class="desc">Refrigerados</div>
    </div>
    <div class="container">
            <a href="#">
            	<img src="./images/verduras.png" alt="verduras" width="170" height="170">  
            </a>
            <div class="desc">Frutas y verduras</div>
    </div>
  
  <div class="container">
            <a href="#">
            	<img src="./images/bebidas.png" alt="bebidas" width="170" height="170">  
            </a>
            <div class="desc">Bebidas</div>
   </div>
    <div class="container">
            <a href="#">
            	<img src="./images/Licores.png" alt="licores" width="170" height="170">  
            </a>
            <div class="desc">Licores</div>
    </div>
    <div class="container">
            <a href="#">
            	<img src="./images/panaderia.png" alt="panaderia" width="170" height="170">  
            </a>
            <div class="desc">Panaderia</div>
    </div>
    <div class="container">
            <a href="#">
            	<img src="./images/Aseo.png" alt="Aseo" width="170" height="170">  
            </a>
            <div class="desc">Aseo hogar</div>
    </div>
  
    </div>
      </div>
<br>

</body>
</html>