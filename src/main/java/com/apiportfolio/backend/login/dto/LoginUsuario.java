package com.apiportfolio.backend.login.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginUsuario {
    
    @NotBlank
    private String nombreUsuario;
    @NotBlank
    private String password;
    
}
