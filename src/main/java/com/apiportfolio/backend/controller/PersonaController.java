package com.apiportfolio.backend.controller;

import com.apiportfolio.backend.model.Persona;
import com.apiportfolio.backend.service.IAboutMeService;
import com.apiportfolio.backend.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/portfolio")
//@CrossOrigin(origins = "http://127.0.0.1:4200")
//@CrossOrigin(origins = "https://portfoliodinamicoargprog.web.app")
@CrossOrigin(origins = "**")
public class PersonaController {

    //Inyectamos la depencencia de PersonaService
    @Autowired
    private IPersonaService personaService;
    
    /*
    List <Persona> listaPersonas = new ArrayList();
    
    @GetMapping ("/hola/{nombre}/{apellido}/{edad}")
    public String decirHola(@PathVariable String nombre,
                            @PathVariable String apellido,
                            @PathVariable int edad){
        return "Hola " + nombre + " " + apellido + " de edad: " + edad;
    }
    
    @GetMapping ("/chau")
    public String decirChau(@RequestParam String nombre,
                            @RequestParam String apellido,
                            @RequestParam int edad){
    
        return "Chau " + nombre + " " + apellido + " de edad: " + edad;
        
    }
     */

    //Recibe un JSON y crea un persona a partir de sus campos pasandolo como
    //objeto de tipo Persona
    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/nueva/persona")
    public void crearPersona(@RequestBody Persona persona) {
        //listaPersonas.add(persona);
        personaService.crearPersona(persona);
    }

    //recibe la peticion de mostrar todas las personas cargadas, las devuelve en
    //una lista, la cual se devuelve al front como JSON
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas() {
        //return listaPersonas;
        return personaService.verPersonas();
    }

    //Recibiendo la variable id, elimina la Persona asociada
    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/persona/{id}")
    public void borrarPersona(@PathVariable Long id) {
        personaService.borrarPersona(id);
    }

    //Actualiza una persona recibiendo los datos en un JSON, si esta no esta
    //entonces la crea
    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/actualiza/persona")
    public void actualizaPersona(@RequestBody Persona persona) {
        personaService.actualizarPersona(persona);
    }
    
    //Devuelde la persona de la cual recibe un id
    //Al fron manda un JSON con los datos
    @GetMapping("/ver/persona/{id}")
    @ResponseBody
    public Persona buscarPersona(@PathVariable Long id) {
        //return objeto Persona;
        return personaService.buscarPersona(id);
    }
}
