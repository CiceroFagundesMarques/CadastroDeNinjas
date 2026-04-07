package com.circinho.CadastroDeNinjas.Missoes;

import java.util.List;

import com.circinho.CadastroDeNinjas.Ninjas.NinjaModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor // Usando o lombok só colocar essa anotation para criar um constructor vazio
@AllArgsConstructor // Usando o lombok para criar um construtor com todos os campos
@Data  // Vai criar automaticamente todos os getter´s e setter´s com essa anotation do lombok
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
