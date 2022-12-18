package com.prog3.prog3td2.controller.mapper;

import com.prog3.prog3td2.model.Match;
import com.prog3.prog3td2.response.MatchResponse;
import org.springframework.stereotype.Component;

@Component
public class MatchMapper {
  public MatchResponse toRest(Match match) {
    return MatchResponse.builder()
        .id(match.getId())
        .datetime(match.getDatetime())
        .stadium(match.getStadium())
        .teamHome(match.getHome().getName())
        .teamOpponent(match.getOpponent().getName())
        .build();
  }
}
