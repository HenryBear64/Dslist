package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Gamelist;

public class GameListDTO {

	public Long id;
	private String name;
	
	public GameListDTO () {
		
	}

	public GameListDTO(Gamelist entity) {
		
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}


	public String getName() {
		return name;
	}
	
	
}
