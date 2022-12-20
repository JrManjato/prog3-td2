package com.prog3.prog3td2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "play_against")
public class Match {
  @Id
  @GeneratedValue(strategy = IDENTITY)
  private int id;
  @ManyToOne
  @JoinColumn(name = "id_home")
  private Team home;
  @ManyToOne
  @JoinColumn(name = "id_opponent")
  private Team opponent;
  private LocalDateTime datetime;
  private String stadium;
}
