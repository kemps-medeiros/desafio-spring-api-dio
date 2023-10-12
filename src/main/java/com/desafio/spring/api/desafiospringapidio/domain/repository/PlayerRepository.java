package com.desafio.spring.api.desafiospringapidio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.spring.api.desafiospringapidio.domain.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Long>{
    
}
