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
public class SponsorResponse {
  private Integer id;
  private List<String> teams;
  private String name;
}
