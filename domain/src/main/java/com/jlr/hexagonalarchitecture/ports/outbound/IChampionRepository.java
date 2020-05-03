package com.jlr.hexagonalarchitecture.ports.outbound;

import java.util.List;

import com.jlr.hexagonalarchitecture.model.entities.ChampionEntity;

/**
 * Secondary port
 * 
 * @author Jorge Leon
 *
 */
public interface IChampionRepository {

	List<ChampionEntity> findAll();
	ChampionEntity findById(Long id);
	ChampionEntity save(ChampionEntity champion);
}
