package com.example.dreamleague.logic.player.service;

import com.example.dreamleague.logic.player.model.PlayerEntity;
import com.example.dreamleague.logic.player.repo.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerService {
    private final PlayerRepository playerRepository;

    public List<PlayerEntity> getPlayers() {
        return playerRepository.findAll();
    }

}
