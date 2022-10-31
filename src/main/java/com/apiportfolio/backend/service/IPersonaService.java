package com.apiportfolio.backend.service;

import com.apiportfolio.backend.model.Persona;
import java.util.List;

/*
|   Esta interface declara los métodos a implementar en la
|   clase PersonaService
*/
public interface IPersonaService {
    
    //Devuelve una lista de tipo Persona con las persona encontradas
    public List<Persona> verPersonas();

    //Crea una nueva persona, recibiendo un objeto persona
    public void crearPersona(Persona persona);
    
    //Borra una persona recibiendo el id de la misma
    public void borrarPersona(Long id);
    
    //Busca una persona, recibiendo su id
    public Persona buscarPersona(Long id);
    
    //Actualiza los campos de una persona
    public void actualizarPersona(Persona persona);
    
}
