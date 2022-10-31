package com.apiportfolio.backend.service;

import com.apiportfolio.backend.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.apiportfolio.backend.repository.IPersonaRepository;
import javax.transaction.Transactional;

@Service
@Transactional
public class PersonaService implements IPersonaService{

    //Inyectamos dependencia de la interface IPersonaRepository que va a
    //ser utilizada para la coneccion con BD
    @Autowired
    public IPersonaRepository personaRepository;
    
    //Devuelve un listado con las personas guardadas
    @Override
    public List<Persona> verPersonas() {
        return personaRepository.findAll();
    }
    
    //Crea una nueva persona, pasando un objeto persona
    @Override
    public void crearPersona(Persona persona) {
        personaRepository.save(persona);
    }

    //Borra una persona, de la cual recibe el id
    @Override
    public void borrarPersona(Long id) {
        personaRepository.deleteById(id);
    }

    //Busca y devuelve una persona, de la cual recibe el id
    @Override
    public Persona buscarPersona(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    //Recibe un obejo persona, y actualiza sus campos en la BD
    //Si no lo encuentra o no existe, lo crea
    @Override
    public void actualizarPersona(Persona persona) {
        personaRepository.save(persona);
    }
    
}