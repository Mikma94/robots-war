package com.msansim.robotswat.rest.dto;

import java.time.Instant;

public class GameDto {

	private Long id;
	private int healthRobot1;
	private int healthRobot2;
	private String nameRobot1;
	private String nameRobot2;
	private Boolean gameFinished;
	private Instant dateAndTime;

	public int getHealthRobot1() {
		return healthRobot1;
	}

	public void setHealthRobot1(int healthRobot1) {
		this.healthRobot1 = healthRobot1;
	}

	public int getHealthRobot2() {
		return healthRobot2;
	}

	public void setHealthRobot2(int healthRobot2) {
		this.healthRobot2 = healthRobot2;
	}

	public String getNameRobot1() {
		return nameRobot1;
	}

	public void setNameRobot1(String nameRobot1) {
		this.nameRobot1 = nameRobot1;
	}

	public String getNameRobot2() {
		return nameRobot2;
	}

	public void setNameRobot2(String nameRobot2) {
		this.nameRobot2 = nameRobot2;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
