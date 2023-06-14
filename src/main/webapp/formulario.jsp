<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>formulario</title>
	</head>
	<body>
		<header>
			<nav>
				<ul>
					<li><a href="index.jsp">Inicio</a></li>
					<li><a href="contactojsp.jsp">Contacto</a></li>
					<li><a href="./capacitacion/crearCapacitacion.jsp">Crear Capacitación</a></li>
					<li><a href="./capacitacion/listarCapacitacion.jsp">Listar Capacitación</a></li>
					<li><a href="formulario.jsp">Formulario</a></li>
				</ul>
			</nav>
		</header>
		<section>
			<form action="registro" method="post">
			<label for="name">nombre:</label>
			<input type="text" name="name"/>
			<label for="lastname">apellido:</label>
			<input type="text" name="lastname"/>
			<label for="age">edad:</label>
			<input type="number" name="age"/>
			<label for="address">direccion:</label>
			<input type="text" name="address"/>
			<input type="submit" value="enviar">
			</form>
		</section>
	</body>
</html>