package com.lucaspotronieri.GameShelf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucaspotronieri.GameShelf.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
