package com.lucaspotronieri.GameShelf.repositories;


import com.lucaspotronieri.GameShelf.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
