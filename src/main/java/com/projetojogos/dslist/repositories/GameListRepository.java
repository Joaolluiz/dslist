package com.projetojogos.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojogos.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
