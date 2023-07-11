package com.projetojogos.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojogos.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
