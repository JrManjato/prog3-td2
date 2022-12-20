package com.prog3.prog3td2.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class TeamResponse {
  private Integer id;
  private String name;
  private List<String> sponsors;
  private List<String> opponent;
  private List<PlayerResponse> players;
}
