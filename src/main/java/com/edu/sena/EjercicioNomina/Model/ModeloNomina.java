package com.edu.sena.EjercicioNomina.Model;

public class ModeloNomina {

    private String nombre;
    private String apellido;
    private int documento;
    private int dtrabajados;
    private int sueldo;
    private int salud;
    private int Arl;
    private int pension;
    private int Tdescuentos;
    private int Strasporte;
    private int Tingresos;


    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public void setApellido(String Apellido){
        this.apellido = Apellido;
    }

    public void setDocumento(int Documento){
        this.documento = Documento;
    }

    public void setDias(int Dias){
        this.dtrabajados = Dias;
    }

    public void setSueldo(int Sueldo){
        this.sueldo = Sueldo;
    }

    public void setArl(int Arl){
        this.Arl = Arl;
    }

    public void setPension(int Pension){
        this.pension = Pension;
    }

    public void setSalud(int Salud){
        this.salud = Salud;
    }

    public void setTdescuentos(int Tdescuentos){
        this.Tdescuentos = Tdescuentos;
    }

    public void setStrasporte(int Strasporte){
        this.Strasporte = Strasporte;
    }

    public void setTingresos(int Tingresos){
        this.Tingresos = Tingresos;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public int getDocumento(){
        return this.documento;
    }

    public int getArl(){
        return this.Arl;
    }

    public int getSalud(){
        return this.salud;
    }

    public int getPension(){
        return this.pension;
    }

    public int getTdescuentos(){
        return this.Tdescuentos;
    }

    public int getStrasporte(){
        return this.Strasporte;
    }

    public int getTingresos(){
        return this.Tingresos;
    }
}