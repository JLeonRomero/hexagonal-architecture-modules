package com.jlr.hexagonalarchitecture.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jlr.hexagonalarchitecture.model.entities.ChampionEntity;
import com.jlr.hexagonalarchitecture.ports.inbound.IChampionService;
import com.jlr.hexagonalarchitecture.ports.outbound.IChampionRepository;

/**
 * Champion service
 * This class implements the primary port and injects the secondary port
 * 
 * @author Jorge Leon
 *
 */
@Service
public class ChampionServiceImpl implements IChampionService {

	private IChampionRepository championRepository;
	
	@Autowired
	public ChampionServiceImpl(IChampionRepository championRepository) {
		this.championRepository = championRepository;
	}
	
	@Override
	public List<ChampionEntity> findAll() {
		return championRepository.findAll();
	}

	@Override
	public ChampionEntity findById(Long id) {
		return championRepository.findById(id);
	}

	@Override
	public ChampionEntity save(ChampionEntity champion) {
		return championRepository.save(champion);
	}

}
