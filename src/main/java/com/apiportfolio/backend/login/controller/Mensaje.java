package com.apiportfolio.backend.login.controller;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Mensaje {

    private String Mensaje;

    public Mensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

}
