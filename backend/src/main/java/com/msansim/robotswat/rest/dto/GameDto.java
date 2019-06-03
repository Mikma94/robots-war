package com.msansim.robotswat.rest.dto;

import java.time.Instant;

public class GameDto {

	private Long id;
	private int healthPlayer1;
	private int healthPlayer2;
	private String namePlayer1;
	private String namePlayer2;
	private Boolean gameFinished;
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

	public Boolean getGameFinished() {
		return gameFinished;
	}

	public void setGameFinished(Boolean gameFinished) {
		this.gameFinished = gameFinished;
	}

	public Instant getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(Instant dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

}
