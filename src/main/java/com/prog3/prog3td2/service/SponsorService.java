package com.prog3.prog3td2.service;

import com.prog3.prog3td2.model.Sponsor;
import com.prog3.prog3td2.repository.SponsorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SponsorService {
  private final SponsorRepository repository;
  public List<Sponsor> findAll(){
    return repository.findAll();
  }
}
