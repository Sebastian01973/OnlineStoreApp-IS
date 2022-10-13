<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro A ver si ahorra</title>
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
            <img src="../images/register.jpg" alt="">
        </div>
        <div class="container-login">
            <form class="form">
            <div class="nameCompany">
                <h2>A ver si ahorra</h2>
            </div>
            <div class="textForm">
            	<br>
                <h2>Registrese en A ver si ahorra  y empiece a comprar produtcos de todo el país</h2>
                <h3>Registro de cuenta</h3>
            </div>
            <div class="input">
                <label for="name">Nombre Completo </label>
                <input placeholder="Ingresar nombre" type="text" name="us_name" required>
            </div>
            <div class="input">
                <label for="nick">Nombre usuario</label>
                <input placeholder="Nombre de usuario" type="text" name="us_nick" required>
            </div>
            <div class="input">
                <label for="address">Dirección</label>
                <input placeholder="ingresar Dirección" type="text" name="us_address" required>
            </div>
            <div class="input">
                <label for="address">Contraseña</label>
                <input placeholder="ingresar Contraseña" type="password" name="us_password" required>
            </div>
            <div class="input">
                <label for="gender">Genero</label>
                <select name="gender">
                        <option value="M">Masculino</option>
                        <option value="F">Femenino</option>
                        <option value="O">Otro</option>
                    </select>
            </div>
            <div class="input">
                <input type="submit" value="Registrar cuenta">
            </div>
        </form>
        </div>    
</div>
</body>
</html>