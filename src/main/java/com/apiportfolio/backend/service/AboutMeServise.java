package com.apiportfolio.backend.service;

import com.apiportfolio.backend.model.AboutMe;
import com.apiportfolio.backend.repository.IAboutMeRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AboutMeServise implements IAboutMeService{

    @Autowired
    public IAboutMeRepository aboutMeRepository;
    
    @Override
    public void crearAboutMe(AboutMe aboutMe) {
        aboutMeRepository.save(aboutMe);
    }

    @Override
    public List<AboutMe> verAboutMe() {
        return aboutMeRepository.findAll();
    }

    @Override
    public void borrarAboutMe(int id) {
        aboutMeRepository.deleteById(id);
    }

    @Override
    public AboutMe buscarAboutMe(int id) {
        return aboutMeRepository.findById(id).orElse(null);
    }

    @Override
    public void actualizarAboutMe(AboutMe aboutMe) {
        aboutMeRepository.save(aboutMe);
    }
    
}
