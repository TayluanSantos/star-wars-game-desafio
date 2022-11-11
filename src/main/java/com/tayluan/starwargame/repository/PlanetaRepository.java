package com.tayluan.starwargame.repository;

import com.tayluan.starwargame.model.Planeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface PlanetaRepository extends JpaRepository<Planeta, Long> {
    Optional<Planeta> findByNome(String nomeDoPlaneta);
}
