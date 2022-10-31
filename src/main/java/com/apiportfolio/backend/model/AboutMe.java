package com.apiportfolio.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AboutMe {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAboutMe;
    private String vivoEn;
    private String sitioWeb;
    private String profesion;
    private String trabajoComo;
    private String estudie;
    private String soy;
    private String imgPerfil;
    private String imgHero;
    private String descripcion;
    private String especialistaEn;
    private String facebook;
    private String instagram;
    private String linkedin;

    public AboutMe() {
    }

    public AboutMe(int idAboutMe, String vivoEn, String sitioWeb,
            String profesion, String trabajoComo, String estudie, String soy,
            String urlFotoPerfil, String urlFotoHero, String descripcion,
            String especialistaEn, String facebook, String instagram, String linkedin) {
        this.idAboutMe = idAboutMe;
        this.vivoEn = vivoEn;
        this.sitioWeb = sitioWeb;
        this.profesion = profesion;
        this.trabajoComo = trabajoComo;
        this.estudie = estudie;
        this.soy = soy;
        this.imgPerfil = urlFotoPerfil;
        this.imgHero = urlFotoHero;
        this.descripcion = descripcion;
        this.especialistaEn = especialistaEn;
        this.facebook = facebook;
        this.instagram = instagram;
        this.linkedin = linkedin;
    }

}
