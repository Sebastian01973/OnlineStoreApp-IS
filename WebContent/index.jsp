<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type"
 	content="text/html; charset=UTF-8">
<title>A ver si ahorra</title>
<link rel="stylesheet" href="$empStyle.css"/>
<style><%@include file="/css/indexStyle.css"%></style>
</head>
<body>
	<div>
	<div class="header">
      <div class="logo">
        <img src="./images/logo.png" id="logo" alt="Main Logo">
      </div>
      <nav>
        <ul>
          <li><a href="users/loginUser.jsp">Iniciar Sesion</a></li>
          <li><a href="users/signUpUser.jsp">Registrarse</a></li>
        </ul>
      </nav>
    </div>
	<section class="main_header">
        <div class="containerH header_container">
            <div class="header_left">
                <h1>ENCUENTRA TUS PRODUCTOS RAPIDO Y SENCILLO.</h1>
                <p>Miles de productos alimenticios están aquí al alcance de todos.</p>
                <a href="users/loginUser.jsp" class="btnH btn-primary">Comienza a comprar</a>
            </div>
            <div class="header_right">
                <div class="header_right-image">
                    <img class="imgH" src="./images/index1.jpg" alt="logo">
                </div>
            </div>
        </div>
    </section>
    <section class="categories">
        <div class="containerC categories_container">
            <div class="categories_left">
                <h1>CATEGORIAS</h1>
                <p> Podrás buscar entre una gran variedad de categorías de alimentos que podras disfrutar en familia o con amigos.</p>  
            </div>
            <div class="categories_right">
                <article class="category">
                    <h5>Comida</h5>
                    <div class="category_icon">
                        <img src="./images/eat.png" alt="eat">
                    </div>
                </article>
                <article class="category">
                    <h5>Bebidas</h5>
                    <div class="category_icon">
                        <img src="./images/drink.png" alt="drink">
                    </div>
                </article>
                <article class="category">
                   <h5>Enlatados</h5>
                    <div class="category_icon-one">
                        <img src="./images/fries.png" alt="fries">
                    </div>
                </article>
            </div>
        </div>
    </section>  
	<footer class="footer">
      <div class="group1">
        <div class="box">
          <figure>
            <a href="#">
            	<img src="./images/supermarket.png" alt="Logo Psico">  
            </a>
          </figure>
        </div>
        <div class="box">
          <h2>SOBRE NOSOTROS</h2>
          <p>Queremos que cuentes con los mejores productos alimenticios.</p>
          <p>Si quieres ahorrar regístrate y compra los productos que mas necesites.</p>
        </div>
        <div class="box">
          <h2>SIGUENOS</h2>
          <div class="red-social">
          		<!-- To do... -->
          </div>
        </div>
      </div>
      <div class="grupo2">
        <small>&copy; 2022 <b>A ver si ahorra</b> - Todos los Derechos Reservados.</small>
      </div>
    </footer>

	</div>
</body>
</html>