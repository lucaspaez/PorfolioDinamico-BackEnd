package com.apiportfolio.backend.service;

import com.apiportfolio.backend.model.ExperienciaLaboral;
import com.apiportfolio.backend.repository.IExperienciaLaboralRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaLaboralService implements IExperienciaLaboralService{

    @Autowired
    public IExperienciaLaboralRepository expLabRepo;
    
    @Override
    public void crearExperienciaLaboral(ExperienciaLaboral experiencia) {
        expLabRepo.save(experiencia);
    }

    @Override
    public void borrarExperiencia(int id) {
        expLabRepo.deleteById(id);
    }

    @Override
    public ExperienciaLaboral buscarExperienciaLaboral(int id) {
        return expLabRepo.findById(id).orElse(null);
    }

    @Override
    public void actualizarExperienciaLaboral(ExperienciaLaboral experiencia) {
        expLabRepo.save(experiencia);
    }

    @Override
    public List<ExperienciaLaboral> verExperienciaLaboral() {
        return expLabRepo.findAll();
    }
    
}
