package com.jlr.hexagonalarchitecture.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Business entity 
 * 
 * @author Jorge Leon
 *
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TM_CHAMPION")
public class ChampionEntity implements Serializable{
	
	private static final long serialVersionUID = 1784783188204105141L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CHAM")
	private Long id;
	@Column(name = "CHAM_NAME")
	private String name;
	@Column(name = "CHAM_CLASS")
	private String classChampion;

}
