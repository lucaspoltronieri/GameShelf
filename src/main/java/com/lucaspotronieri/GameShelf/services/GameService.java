package com.lucaspotronieri.GameShelf.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucaspotronieri.GameShelf.dto.GameMinDTO;
import com.lucaspotronieri.GameShelf.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		var result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
		
	}

}
