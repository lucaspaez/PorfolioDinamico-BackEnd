package com.apiportfolio.backend.service;

import com.apiportfolio.backend.model.Proyecto;
import java.util.List;

public interface IProyectoService {

    public void crearProyecto(Proyecto proyecto);
    
    public List<Proyecto> verProyectos();
    
    public void borrarProyecto(int id);
    
    public Proyecto buscarProyecto(int id);
    
    public void actualizarProyecto(Proyecto proyecto);
    
}
