package com.example.dreamleague.logic.player.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PlayerListDTO {
    private List<PlayerDTO> playerList;
}
