package com.jlr.hexagonalarchitecture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlr.hexagonalarchitecture.model.entities.ChampionEntity;

public interface ChampionJpaRepository extends JpaRepository<ChampionEntity, Long>{

}
