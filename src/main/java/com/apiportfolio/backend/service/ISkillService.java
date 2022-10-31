package com.apiportfolio.backend.service;

import com.apiportfolio.backend.model.Skill;
import java.util.List;

public interface ISkillService {
    
    //Crea una nueva tag de skill, recibiendo un objeto skill
    public void crearSkill(Skill skill);
    
    //Devuelve una lista de tipo Skill con las skill encontradas
    public List<Skill> verSkills();
    
    //Borra una skill recibiendo el id de la misma
    public void borrarSkill(int id);
    
    //Busca una skill, recibiendo su id
    public Skill buscarSkill(int id);
    
    //Actualiza los campos de una Skill
    public void actualizarSkill(Skill skill);
    
}
