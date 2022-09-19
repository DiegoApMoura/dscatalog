package com.spring.dscatalog.dto;

import java.io.Serializable;

import com.spring.dscatalog.entities.Category;

public class CategoryDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String Nome;
	
	public CategoryDTO() {}

	public CategoryDTO(Long id, String nome) {
		
		this.id = id;
		this.Nome = nome;
	}
	
	public CategoryDTO (Category entity) {
		this.id = entity.getId();
		this.Nome = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

}
