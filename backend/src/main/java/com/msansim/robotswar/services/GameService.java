package com.msansim.robotswar.services;

import java.util.List;

import com.msansim.robotswar.domain.GameEntity;

public interface GameService {
	
	public GameEntity save(GameEntity game);
	
	public GameEntity update(GameEntity game);
	
	public List<GameEntity> findAll();
	
	public void deleteAll();

}
