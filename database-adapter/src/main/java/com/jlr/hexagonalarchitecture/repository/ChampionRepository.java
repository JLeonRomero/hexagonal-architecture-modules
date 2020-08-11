package com.jlr.hexagonalarchitecture.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jlr.hexagonalarchitecture.model.entities.ChampionEntity;
import com.jlr.hexagonalarchitecture.ports.outbound.IChampionRepository;

/**
 * Champion repository
 * Secondary adapter that implements the secondary port
 * 
 * @author Jorge Leon
 *
 */
@Repository
public class ChampionRepository implements IChampionRepository {
	
	private ChampionJpaRepository jpaRepository;
	
	@Autowired
	public ChampionRepository(ChampionJpaRepository jpaRepository) {
		this.jpaRepository = jpaRepository;
	}

	@Override
	public List<ChampionEntity> findAll() {
		return jpaRepository.findAll();
	}

	@Override
	public ChampionEntity findById(Long id) {
		return jpaRepository.findById(id).orElse(new ChampionEntity());
	}

	@Override
	public ChampionEntity save(ChampionEntity champion) {
		return jpaRepository.save(champion);
	}

}
