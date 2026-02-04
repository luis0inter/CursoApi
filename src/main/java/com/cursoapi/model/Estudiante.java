package com.cursoapi.model;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String matricula;
    private Integer edad;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMatricula() {
        return matricula;
    }

    public Integer getEdad() {
        return edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
