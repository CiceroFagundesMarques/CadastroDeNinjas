package com.circinho.CadastroDeNinjas.Ninjas;

import org.hibernate.annotations.ManyToAny;

import com.circinho.CadastroDeNinjas.Missoes.MissoesModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;


// Entity transforma uma classe em uma entidade (tabela) de banco de dados
@Entity  
@Table(name = "tb_cadastro")  // Nomeia a tabela no banco de dados
public class NinjaModel {
	
	// No ID precisa das anotações do JPA abaixo para criar o autoincremento do mesmo
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private int idade;
	
	// ManyToAny apenas um Ninja para para uma missão
	@ManyToAny
	@JoinColumn(name = "missoes_id") // Foring Key da tabela missoes
	private MissoesModel missoes;
	
	// Criar um construtor vazio
	public NinjaModel() {
		
	}
	
	// Criar um construtor com todos os campos
	public NinjaModel(String nome, String email, Integer idade) {
		
		this.nome = nome;
		this.email = email;
		this.idade = idade;		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
