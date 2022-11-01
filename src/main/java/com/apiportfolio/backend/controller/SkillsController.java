package com.apiportfolio.backend.controller;

import com.apiportfolio.backend.model.Skill;
import com.apiportfolio.backend.service.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
public class SkillsController {
    
    //Inyectamos la depencencia
    @Autowired
    private ISkillService skillService;
    
    
    //recibe la peticion de mostrar todas las skills cargadas, las devuelve en
    //una lista, la cual se devuelve al front como JSON
    @GetMapping("/ver/skills")
    @ResponseBody
    public List<Skill> verSkills() {
        //return lista
        List<Skill> skills = skillService.verSkills();
        System.out.println(skills);
        return skillService.verSkills();
    }
    
    @GetMapping("/ver/skill/{id}")
    @ResponseBody
    public Skill buscarSkill(@PathVariable int id) {
        //return objeto Persona;
        return skillService.buscarSkill(id);
    }
    
    @PutMapping("/actualiza/skill")
    public void actualizaPersona(@RequestBody Skill skill) {
        skillService.actualizarSkill(skill);
    }
    
    @PostMapping("/nueva/skill")
    public void crearPersona(@RequestBody Skill skill) {
        //listaPersonas.add(persona);
        skillService.crearSkill(skill);
    }
    
    @DeleteMapping("/borrar/skill/{id}")
    public void borrarSkill(@PathVariable int id) {
        skillService.borrarSkill(id);
    }
}
