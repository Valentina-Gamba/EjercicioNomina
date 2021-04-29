<%--
  Created by IntelliJ IDEA.
  User: Hp
  Date: 28/04/2021
  Time: 10:33 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ page import="com.edu.sena.EjercicioNomina.Model.ModeloNomina" %>
  <head>
    <title>Resultado Nomina</title>
  </head>
  <body>
  <h1><%= "Resultado Sueldo"%></h1>
  <%  ModeloNomina Datos=( ModeloNomina) request.getAttribute("Datos");%>
  <table style="border: 1px solid black">
      <thead>
      <tr>
          <th colspan="3">Usuario</th>
          <th>Descuentos</th>
          <th>Ingresos</th>

      </tr>
      <tr>
          <th>Apellidos</th>
          <th>Nombres</th>
          <th>Documento</th>
          <th>ARL</th>
          <th>Salud</th>
          <th>Pension</th>
          <th>Total Descuentos</th>
          <th>Subsidio Transporte</th>
          <th>Total Ingresos</th>

      </tr>
      </thead>
      <tbody>
      <tr>
          <td><%= Datos.getNombre() %></td>
          <td><%= Datos.getApellido()%></td>
          <td><%= Datos.getDocumento()%></td>
          <td><%= Datos.getArl() %></td>
          <td><%= Datos.getSalud()%></td>
          <td><%= Datos.getPension()%></td>
          <td><%= Datos.getTdescuentos()%></td>
          <td><%= Datos.getStrasporte()%></td>
          <td><%= Datos.getTingresos()%></td>

      </tr>
      </tbody>
  </table>
  </body>
</html>
