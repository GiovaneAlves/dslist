package com.giovaneAlves.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giovaneAlves.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long> {

}
