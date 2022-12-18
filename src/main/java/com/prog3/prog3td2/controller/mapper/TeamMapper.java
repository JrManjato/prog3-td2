package com.prog3.prog3td2.controller.mapper;

import com.prog3.prog3td2.model.Sponsor;
import com.prog3.prog3td2.model.Team;
import com.prog3.prog3td2.response.TeamResponse;
import org.springframework.stereotype.Component;

@Component
public class TeamMapper {
  public TeamResponse toRest(Team team) {
    return TeamResponse.builder()
        .id(team.getId())
        .name(team.getName())
        .opponent(team.getOpponent() == null ? null : team.getOpponent().getName())
        .sponsors(team.getSponsors().stream().map(Sponsor::getName).toList())
        .build();
  }
}
