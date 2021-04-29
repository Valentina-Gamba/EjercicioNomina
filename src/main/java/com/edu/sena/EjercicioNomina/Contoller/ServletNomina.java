package com.edu.sena.EjercicioNomina.Contoller;

import com.edu.sena.EjercicioNomina.Model.ModeloNomina;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ServletNomina", value = "/Servlet-Nomina")
public class ServletNomina extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        ModeloNomina Datos = new ModeloNomina();
        int Riesgo = 0;
        boolean Contrato = true;
        int Salud = 0;
        int Sueldo = 0;
        int Pension = 0;
        int Arl = 0;
        int Tdescuentos = 0;
        int Strasporte = 106454;
        int Tingresos = 0;

        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        int documento = Integer.parseInt(request.getParameter("documento"));
        int diastrabajados = Integer.parseInt(request.getParameter("dtrab"));
        String sueldo = request.getParameter("sueldo");

        Sueldo = Integer.parseInt(sueldo);
        if(Contrato == true){
            Salud = (int) (Sueldo * 4)/100;
            Pension = (int) (Sueldo * 4)/100;
            if(Riesgo == 1){
                Arl = (int) (Sueldo * 0.522)/100;
            }else {
                if(Riesgo == 2){
                    Arl = (int) (Sueldo * 1.044)/100;
                }else {
                    if(Riesgo == 3){
                        Arl = (int) (Sueldo * 2.436)/100;
                    }else {
                        if(Riesgo == 4){
                            Arl = (int) (Sueldo * 4.350)/100;
                        }else{
                            if(Riesgo == 5) {
                                Arl = (int) (Sueldo * 6.960) / 100;
                            }
                        }
                    }
                }
            }
            Tdescuentos = Salud + Pension + Arl ;
        }else{
            Salud = (int) ((Sueldo * 12.5)/100);
            Pension = (int) (Sueldo * 16)/100;
        }
        Tingresos = (Sueldo - Tdescuentos) + Strasporte;

        Datos.setNombre(nombre);
        Datos.setApellido(apellido);
        Datos.setDocumento(documento);
        Datos.setDias(diastrabajados);
        Datos.setSueldo(Sueldo);
        Datos.setArl(Arl);
        Datos.setPension(Pension);
        Datos.setSalud(Salud);
        Datos.setTdescuentos(Tdescuentos);
        Datos.setStrasporte(Strasporte);
        Datos.setTingresos(Tingresos);

        request.setAttribute("Datos", Datos);
        RequestDispatcher rd = request.getRequestDispatcher("Resultado.jsp");
        rd.forward(request, response);
    }
}