package com.jlr.hexagonalarchitecture.ports.inbound;

import java.util.List;

import com.jlr.hexagonalarchitecture.model.entities.ChampionEntity;

/**
 * Primary Port
 * 
 * @author Jorge Leon
 *
 */
public interface IChampionService {
	
	List<ChampionEntity> findAll();
	ChampionEntity findById(Long id);
	ChampionEntity save(ChampionEntity champion);

}
