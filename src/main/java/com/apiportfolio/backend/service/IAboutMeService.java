package com.apiportfolio.backend.service;

import com.apiportfolio.backend.model.AboutMe;
import java.util.List;

public interface IAboutMeService {
    
    public void crearAboutMe(AboutMe aboutMe);
    
    public List<AboutMe> verAboutMe();
    
    public void borrarAboutMe(int id);
    
    public AboutMe buscarAboutMe(int id);
    
    public void actualizarAboutMe(AboutMe aboutMe);
    
}
