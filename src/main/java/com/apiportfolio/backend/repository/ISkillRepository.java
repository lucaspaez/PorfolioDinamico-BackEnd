package com.apiportfolio.backend.repository;

import com.apiportfolio.backend.model.Skill;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillRepository extends JpaRepository<Skill, Integer> {

    public Optional<Skill> findByTag(String tag);

    public boolean existsByTag(String tag);
}
