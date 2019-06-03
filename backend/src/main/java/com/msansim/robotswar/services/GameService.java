package com.msansim.robotswar.services;

import java.util.List;

import com.msansim.robotswar.domain.GameEntity;

public interface GameService {
	
	public String getPrueba();
	
	public GameEntity save(GameEntity game);
	
	public List<GameEntity> findAll();
	
	public void deleteAll();

}
