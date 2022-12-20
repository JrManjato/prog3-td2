package com.prog3.prog3td2.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class MatchResponse {
  private Integer id;
  private TeamResponse teamHome;
  private TeamResponse teamOpponent;
  private LocalDateTime datetime;
}
