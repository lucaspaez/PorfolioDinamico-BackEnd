package com.apiportfolio.backend.service;

import com.apiportfolio.backend.model.Skill;
import com.apiportfolio.backend.repository.ISkillRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SkillService implements ISkillService{

    @Autowired
    public ISkillRepository skillRepo;
    
    @Override
    public void crearSkill(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public List<Skill> verSkills() {
        //System.out.println(skillRepo.findAll());
        return skillRepo.findAll();
    }

    @Override
    public void borrarSkill(int id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skill buscarSkill(int id) {
        return skillRepo.findById(id).orElse(null);
    }

    @Override
    public void actualizarSkill(Skill skill) {
        skillRepo.save(skill);
    }
    
}
