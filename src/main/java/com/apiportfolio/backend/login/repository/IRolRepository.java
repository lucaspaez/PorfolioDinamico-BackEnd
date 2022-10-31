package com.apiportfolio.backend.login.repository;

import com.apiportfolio.backend.login.entity.Rol;
import com.apiportfolio.backend.login.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
