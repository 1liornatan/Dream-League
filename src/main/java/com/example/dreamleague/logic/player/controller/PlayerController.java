package com.example.dreamleague.logic.player.controller;

import com.example.dreamleague.logic.player.model.PlayerEntity;
import com.example.dreamleague.logic.player.model.dto.PlayerDTO;
import com.example.dreamleague.logic.player.model.dto.PlayerListDTO;
import com.example.dreamleague.logic.player.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class PlayerController {

    private final PlayerService playerService;
    private ModelMapper modelMapper = new ModelMapper();

    @GetMapping("/players")
    public List<PlayerDTO> getPlayers() {
        List<PlayerEntity> players = playerService.getPlayers();
        List<PlayerDTO> playerDTOS = players
                .stream()
                .map(player -> modelMapper.map(player, PlayerDTO.class))
                .collect(Collectors.toList());

        return playerDTOS;
    }
}
