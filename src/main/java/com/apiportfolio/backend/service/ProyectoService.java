package com.apiportfolio.backend.service;

import com.apiportfolio.backend.model.Proyecto;
import com.apiportfolio.backend.repository.IProyectoRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectoService implements IProyectoService{

    @Autowired
    public IProyectoRepository proyRepo;
    
    @Override
    public void crearProyecto(Proyecto proyecto) {
        proyRepo.save(proyecto);
    }

    @Override
    public List<Proyecto> verProyectos() {
        return proyRepo.findAll();
    }

    @Override
    public void borrarProyecto(int id) {
        proyRepo.deleteById(id);
    }
        
    @Override
    public Proyecto buscarProyecto(int id) {
        return proyRepo.findById(id).orElse(null);
    }

    @Override
    public void actualizarProyecto(Proyecto proyecto) {
        proyRepo.save(proyecto);
    }
    
}
