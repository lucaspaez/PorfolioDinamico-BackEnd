package com.apiportfolio.backend.controller;

import com.apiportfolio.backend.model.ExperienciaLaboral;
import com.apiportfolio.backend.service.IExperienciaLaboralService;
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
//@CrossOrigin(origins = "https://portfoliodinamicoargprog.firebaseapp.com/")
@CrossOrigin(origins = "**")
public class ExperienciaLaboralController {
    //Inyectamos la depencencia
    @Autowired
    private IExperienciaLaboralService experienciaService;
    
    //recibe la peticion de mostrar todas las experiencias cargadas, las devuelve en
    //una lista, la cual se devuelve al front como JSON
    @GetMapping("/ver/experiencias")
    @ResponseBody
    public List<ExperienciaLaboral> verExperiencias() {
        //return lista;
        return experienciaService.verExperienciaLaboral();
    }
    
    //Devuelde la experiencia de la cual recibe un id
    //Al front manda un JSON con los datos
    //@PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/ver/experiencia/{id}")
    @ResponseBody
    public ExperienciaLaboral buscarExperienciaLaboral(@PathVariable int id) {
        //return objeto Experiencia;
        return experienciaService.buscarExperienciaLaboral(id);
    }
    
    //Recibe un JSON y crea un persona a partir de sus campos pasandolo como
    //objeto de tipo ExperienciaLaoral
    //@PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("/nueva/experiencia")
    public void crearExperienciaLaboral(@RequestBody ExperienciaLaboral experiencia) {
        //listaPersonas.add(persona);
        experienciaService.crearExperienciaLaboral(experiencia);
    }
    
    

    //Recibiendo la variable id, elimina la Experiencia asociada
    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/experiencia/{id}")
    public void borrarExperienciaLaboral(@PathVariable int id) {
        experienciaService.borrarExperiencia(id);
    }

    //Actualiza una experiencia recibiendo los datos en un JSON, si esta no esta
    //entonces la crea
    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/actualiza/experiencia")
    public void actualizarExperienciaLaboral(@RequestBody ExperienciaLaboral experiencia) {
        experienciaService.actualizarExperienciaLaboral(experiencia);
    }
}
