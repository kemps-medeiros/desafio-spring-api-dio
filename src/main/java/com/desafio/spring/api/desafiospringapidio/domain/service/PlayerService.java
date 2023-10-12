package com.desafio.spring.api.desafiospringapidio.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.spring.api.desafiospringapidio.domain.model.Player;
import com.desafio.spring.api.desafiospringapidio.domain.repository.PlayerRepository;

@Service
public class PlayerService {
        @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Optional<Player> getPlayerById(Long id) {
        return playerRepository.findById(id);
    }

    public Player createPlayer(Player player) {
        return playerRepository.save(player);
    }

    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }

    public Player updatePlayer(Long id, Player updatedPlayer) {
        if (playerRepository.existsById(id)) {
            updatedPlayer.setId(id);
            return playerRepository.save(updatedPlayer);
        }
        return null;
    }
}
