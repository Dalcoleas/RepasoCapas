<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Contribuyentes</h2>
	<table>
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>NIT</th>
				<th>Importancia</th>
				<th>Fecha</th>
			</tr>
		</thead>
		<c:forEach items="${conti}" var="c">
			<tbody>
				<tr>
					<td>${c.sNombre}</td>
					<td>${c.sApellido}</td>
					<td>${c.sNit}</td>
					<td>${c.importancia.sImportancia}</td>
					<td>${c.fechaDelegate}</td>
				</tr>
			</tbody>
		</c:forEach>
	</table>
</body>
</html>