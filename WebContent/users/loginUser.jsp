<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login A ver si Ahorra</title>
<link rel="stylesheet" href="$empStyle.css"/>
<style><%@include file="/css/loginStyle.css"%></style>

</head>
<body>
<div class="header">
      <div class="logo">
        <a href="../index.jsp"><img src="../images/logo.png" id="logo" alt="Main Logo"></a>
      </div>
      <nav>
        <ul>
          <li><a href="loginUser.jsp">Iniciar Sesion</a></li>
          <li><a href="signUpUser.jsp">Registrarse</a></li>
        </ul>
      </nav>
</div>
<div class="containerLogIn">
        <div class="img-form">
            <img src="../images/login.jpg" alt="">
        </div>
        <div class="container-login">
            <form class="form" action="../loginUserServlet" method="post">
            <div class="nameCompany">
                <h2>A ver si ahorra</h2>
            </div>
            <div class="textForm">
                <h2>Comience a comprar con un clic,<br> Explora productos</h2>
                <h3>Iniciar sesion</h3>
            </div>
            <div class="input">
                <label for="usuario">Usuario</label>
                <input placeholder="Ingresar Usuario" type="text" name="us_nick" required>
            </div>
            <div class="input">
                <label for="password">Contraseña</label>
                <input placeholder="Ingresar contraseña" type="password" name="us_password" required>
            </div>
            <div class="input">
                <input type="submit" value="Ingresar">
            </div>
            <div class="separator">
                <h3> - O - </h3>
            </div>
            <div class="input" id="registater">
                <input type="submit" value="Registrate">
            </div>
        </form>
        </div>    
</div>
</body>
</html>