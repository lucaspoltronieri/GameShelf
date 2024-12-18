package com.lucaspotronieri.GameShelf.services;

import com.lucaspotronieri.GameShelf.dto.GameDTO;
import com.lucaspotronieri.GameShelf.dto.GameMinDTO;
import com.lucaspotronieri.GameShelf.entities.Game;
import com.lucaspotronieri.GameShelf.repositories.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        var result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        //Game result = gameRepository.findById(id).get();
        return new GameDTO(gameRepository.findById(id).get());
    }

}
