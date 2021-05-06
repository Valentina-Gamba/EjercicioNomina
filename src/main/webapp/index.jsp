<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Ejercicio Nomina</title>
</head>
<body>
<h2 style="margin-left: 5%"><%= "Calcule su sueldo" %>
</h2>
<br>
<form style="margin-left: 5%" action="Servlet-Nomina" method="POST">
    <label for="nombre"><%= "Ingrese sus nombres"%></label>
    <br>
    <input type="text" name="nombre" id="nombre" required >
    <br><br>
    <label for="apellido"><%= "Ingrese sus apellidos"%></label>
    <br>
    <input type="text" name="apellido" id="apellido" required >
    <br><br>
    <label for="documento"><%= "Ingrese su Documento"%></label>
    <br>
    <input type="number" name="documento" id="documento" required >
    <br><br>
    <label for="dtrab"><%= "Ingrese loa Dias trabajados"%></label>
    <br>
    <input type="number" name="dtrab" id="dtrab" required >
    <br><br>
    <label for="sueldo"><%= "Ingrese su Sueldo mensual"%></label>
    <br>
    <input type="number" name="sueldo" id="sueldo" required >
    <br>
    <input type="submit" value="CALCULAR">
</form>
<br>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>