package com.apiportfolio.backend.service;

import com.apiportfolio.backend.model.ExperienciaLaboral;
import java.util.List;

/*
|   Esta interface declara los métodos a implementar en la
|   clase ExperienciaLaboralService
*/
public interface IExperienciaLaboralService {
    
    //Crea una nueva experiencia laboral, recibiendo un objeto ExperienciaLaboral
    public void crearExperienciaLaboral(ExperienciaLaboral experiencia);
    
    //Devuelve una lista de tipo Persona con las persona encontradas
    public List<ExperienciaLaboral> verExperienciaLaboral();
    
    //Borra una experiencia laboral recibiendo el id de la misma
    public void borrarExperiencia(int id);
    
    //Busca una experiencia laboral, recibiendo su id
    public ExperienciaLaboral buscarExperienciaLaboral(int id);
    
    //Actualiza los campos de una experiencia laboral
    public void actualizarExperienciaLaboral(ExperienciaLaboral experiencia);
    
}
