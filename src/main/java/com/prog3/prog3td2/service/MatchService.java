package com.prog3.prog3td2.service;

import com.prog3.prog3td2.model.Match;
import com.prog3.prog3td2.repository.MatchRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MatchService {
  private final MatchRepository repository;

  public List<Match> findAll() {
    return repository.findAll();
  }
}
