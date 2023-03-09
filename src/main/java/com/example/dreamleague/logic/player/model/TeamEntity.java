package com.example.dreamleague.logic.player.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "TeamEntity")
@Getter
@Setter
@NoArgsConstructor
@Table(name = "teams")
public class TeamEntity {

    @Id
    @SequenceGenerator(name = "team_sequence", sequenceName = "team_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "team_sequence")
    private Integer id;

    @Column(name = "team_name", updatable = false, nullable = false, columnDefinition = "text")
    private String teamName;

}
