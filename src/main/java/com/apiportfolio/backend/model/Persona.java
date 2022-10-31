package com.apiportfolio.backend.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idpersona;

    private String nombre;
    private String apellido;
    private String dni;
    private String fechaNac;
    private String edad;
    private String email;

    public Persona() {
    }

    public Persona(Long idpersona, String nombre, String apellido, String dni, String fechaNac, String edad, String email) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.edad = edad;
        this.email = email;
    }
}
