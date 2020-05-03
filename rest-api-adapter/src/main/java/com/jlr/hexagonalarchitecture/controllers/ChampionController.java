package com.jlr.hexagonalarchitecture.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jlr.hexagonalarchitecture.model.entities.ChampionEntity;
import com.jlr.hexagonalarchitecture.ports.inbound.IChampionService;

/**
 * Champion controller
 * Simple controller that lists and saves champions in the memory database
 * 
 * @author Jorge Leon
 *
 */
@RestController
public class ChampionController {

	private IChampionService championService;
	
	@Autowired
	public ChampionController(IChampionService championService) {
		this.championService = championService;
	}
	
	@GetMapping("/champion")
	public ResponseEntity<List<ChampionEntity>> findAll() {
		return new ResponseEntity<>(championService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/champion/{championId}")
	public ResponseEntity<ChampionEntity> findById(@PathVariable("championId") Long id) {
		return new ResponseEntity<>(championService.findById(id), HttpStatus.OK);
	}
	
	@PostMapping("/champion")
	public ResponseEntity<ChampionEntity> save(@RequestBody ChampionEntity champion) {
		return new ResponseEntity<>(championService.save(champion), HttpStatus.OK);
	}
	
}
