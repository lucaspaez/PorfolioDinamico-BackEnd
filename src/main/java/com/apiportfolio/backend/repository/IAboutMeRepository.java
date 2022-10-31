package com.apiportfolio.backend.repository;

import com.apiportfolio.backend.model.AboutMe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAboutMeRepository extends JpaRepository<AboutMe, Integer>{

}
