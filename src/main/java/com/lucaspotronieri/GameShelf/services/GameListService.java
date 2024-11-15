package com.lucaspotronieri.GameShelf.services;

import com.lucaspotronieri.GameShelf.dto.GameDTO;
import com.lucaspotronieri.GameShelf.dto.GameListDTO;
import com.lucaspotronieri.GameShelf.dto.GameMinDTO;
import com.lucaspotronieri.GameShelf.entities.Game;
import com.lucaspotronieri.GameShelf.entities.GameList;
import com.lucaspotronieri.GameShelf.repositories.GameListRepository;
import com.lucaspotronieri.GameShelf.repositories.GameRepository;
import org.aspectj.apache.bcel.classfile.LineNumberTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

}
