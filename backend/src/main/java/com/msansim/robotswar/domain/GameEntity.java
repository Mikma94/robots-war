package com.msansim.robotswar.domain;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "game")
@SequenceGenerator(name = "seq", initialValue = 1, allocationSize = 20)
public class GameEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	private Long id;

	@Column(name = "health_player_1", nullable = false)
	@Min(0)
	@Max(80)
	private int healthPlayer1;

	@Column(name = "health_player_2", nullable = false)
	@Min(0)
	@Max(80)
	private int healthPlayer2;

	@Column(name = "name_player_1", nullable = false)
	private String namePlayer1;

	@Column(name = "name_player_2", nullable = false)
	private String namePlayer2;

	@Column(name = "date_and_time", nullable = false)
	private Instant dateAndTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getHealthPlayer1() {
		return healthPlayer1;
	}

	public void setHealthPlayer1(int healthPlayer1) {
		this.healthPlayer1 = healthPlayer1;
	}

	public int getHealthPlayer2() {
		return healthPlayer2;
	}

	public void setHealthPlayer2(int healthPlayer2) {
		this.healthPlayer2 = healthPlayer2;
	}

	public String getNamePlayer1() {
		return namePlayer1;
	}

	public void setNamePlayer1(String namePlayer1) {
		this.namePlayer1 = namePlayer1;
	}

	public String getNamePlayer2() {
		return namePlayer2;
	}

	public void setNamePlayer2(String namePlayer2) {
		this.namePlayer2 = namePlayer2;
	}

	public Instant getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(Instant dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

}
