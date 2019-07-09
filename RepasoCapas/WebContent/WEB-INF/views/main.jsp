<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Repaso Capas</title>
</head>
<style>
	body{
		text-align: center;
	}
</style>
<body>
	<h1>${message}</h1>
	
	<form action="${pageContext.request.contextPath}/add" method="post">
		<input name="nombre" id="nombre" type="text" placeholder="Ingrese su nombre">
		
		<input name="apellido" id="apellido" type="text" placeholder="Ingrese su apellido">
		
		<input name = "nit" id="nit" type="text" placeholder="Ingrese su NIT">
		
		<p>Importancia: </p>
		<select name = "importancia">
			<c:forEach items="${importancia}" var = "impo">
				<option value="${impo.cImportancia}">${impo.sImportancia}</option>
			</c:forEach>
		</select><br><br>
		
		<input type="submit" value="Guardar"><br><br>
		
		<button type="button" onclick="location.href='${pageContext.request.contextPath}/verContribuyentes'"> Ver Contribuyentes</button>
		
	</form>

</body>
</html>