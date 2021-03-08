package com.company;

import sun.security.util.Password;

public class Username {
    //ATRIBUTOS
    private String Nombre_usuario=" ";
    private String Password, Direccion, Telefono, DNI, Nacionalidad;

    //CONSTRUCTORES
    public Username(String Nombre_usuario, String Password ){
        this.Nombre_usuario= Nombre_usuario; this.Password= Password;
    }

    public String getNombre_usuario(){
        return Nombre_usuario;
    }

    public void setNombre_usuario( String Nombre_usuario){
        this.Nombre_usuario= Nombre_usuario;
    }

    public String getPassword(){

        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
       this.Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        this.Telefono = telefono;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.Nacionalidad = nacionalidad;
    }
}
