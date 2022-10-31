package com.apiportfolio.backend.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExperienciaLaboral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    private boolean actual;
    private String cargo;
    private String descripcion;
    private String anio;
    private String mes;
    private String dia;

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(int idExperiencia, boolean actual, String cargo, String descripcion, String anio, String mes, String dia) {
        this.id = idExperiencia;
        this.actual = actual;
        this.cargo = cargo;
        this.descripcion = descripcion;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActual() {
        return actual;
    }

    public void setActual(boolean actual) {
        this.actual = actual;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    
    
}
