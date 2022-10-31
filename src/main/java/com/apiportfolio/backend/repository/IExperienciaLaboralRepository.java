package com.apiportfolio.backend.repository;

import com.apiportfolio.backend.model.ExperienciaLaboral;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaLaboralRepository extends JpaRepository<ExperienciaLaboral, Integer>{
    public Optional<ExperienciaLaboral> findByCargo (String cargo);
    public boolean existsByCargo(String cargo);
}
