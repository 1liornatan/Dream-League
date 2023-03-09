package com.example.dreamleague.logic.player.repo;

import com.example.dreamleague.logic.player.model.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Integer> {

    @Query(value = "SELECT first_name, last_name, team_name FROM players P JOIN teams T ON P.team_id = T.id", nativeQuery = true)
    List<PlayerEntity> getPlayers();
}
