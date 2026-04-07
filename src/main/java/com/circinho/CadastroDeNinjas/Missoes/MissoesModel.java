package com.circinho.CadastroDeNinjas.Missoes;

import java.util.List;

import com.circinho.CadastroDeNinjas.Ninjas.NinjaModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String dificuldade;
	
	// @OneToMany uma missão para muitos ninjas
	@OneToMany(mappedBy = "missoes")
	private List<NinjaModel> ninja;
	

}
