package com.apiportfolio.backend.controller;

import com.apiportfolio.backend.model.AboutMe;
import com.apiportfolio.backend.service.IAboutMeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("portfolio")
//@CrossOrigin(origins = "http://127.0.0.1:4200")
@CrossOrigin(origins = "https://portfoliodinamicoargprog.firebaseapp.com/")
//@CrossOrigin(origins = "**")
public class AboutMeController {
    
    //Inyectamos la depencencia de AboutMeService
    @Autowired
    private IAboutMeService aboutMeService;
    
    //Devuelde la persona de la cual recibe un id
    //Al fron manda un JSON con los datos
    @GetMapping("/ver/aboutme/{id}")
    @ResponseBody
    public AboutMe buscarAboutMe(@PathVariable int id) {
        //return objeto Persona;
        return aboutMeService.buscarAboutMe(id);
    }
    
    //Actualiza una persona recibiendo los datos en un JSON, si esta no esta
    //entonces la crea
    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/actualiza/aboutme")
    public void actualizaAboutMe(@RequestBody AboutMe aboutMe) {
        aboutMeService.actualizarAboutMe(aboutMe);
    }
    
    
}
