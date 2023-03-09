package com.example.dreamleague.logic.player.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "PlayerEntity")
@Getter
@Setter
@NoArgsConstructor
@Table(name = "players")
public class PlayerEntity {
    @Id
    @SequenceGenerator(name = "player_sequence", sequenceName = "player_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "player_sequence")
    @Column(name = "id", updatable = false)
    private Integer id;

    @Column(name = "first_name", updatable = false, nullable = false, columnDefinition = "text")
    private String firstName;

    @Column(name = "last_name", updatable = false, nullable = false, columnDefinition = "text")
    private String lastName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private TeamEntity team;

}
