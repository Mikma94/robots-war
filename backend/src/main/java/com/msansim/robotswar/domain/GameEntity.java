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

	@Column(name = "health_robot_1", nullable = false)
	@Min(0)
	@Max(80)
	private int healthRobot1;

	@Column(name = "health_robot_2", nullable = false)
	@Min(0)
	@Max(80)
	private int healthRobot2;

	@Column(name = "name_robot_1", nullable = false)
	private String nameRobot1;

	@Column(name = "name_robot_2", nullable = false)
	private String nameRobot2;

	@Column(name = "game_finished")
	private Boolean gameFinished;

	@Column(name = "date_and_time", nullable = false)
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
