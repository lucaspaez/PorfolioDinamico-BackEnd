package com.apiportfolio.backend.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProyecto;
    @Basic
    private String nombreProyecto;
    private String descripciónProyecto;

    public Proyecto(int idProyecto, String nombreProyecto, String descripciónProyecto) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.descripciónProyecto = descripciónProyecto;
    }

    public Proyecto() {
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getDescripciónProyecto() {
        return descripciónProyecto;
    }

    public void setDescripciónProyecto(String descripciónProyecto) {
        this.descripciónProyecto = descripciónProyecto;
    }

    
}
