package com.msansim.robotswar.services.impl;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msansim.robotswar.domain.GameEntity;
import com.msansim.robotswar.repository.GameRepository;
import com.msansim.robotswar.services.GameService;

@Service
public class GameServiceImpl implements GameService {
	
	@Autowired
    private GameRepository gameRepository;

	@Override
	public String getPrueba() {
		return "Prueba";
	}

	@Override
	public GameEntity save(GameEntity game) {
		game.setHealthPlayer1(80);
		game.setHealthPlayer2(80);
		game.setNamePlayer1("Player 1");
		game.setNamePlayer2("Player 2");
		game.setDateAndTime(Instant.now());
		return gameRepository.saveAndFlush(game);
	}

	@Override
	public List<GameEntity> findAll() {
		return gameRepository.findAll();
	}

	@Override
	public void deleteAll() {
		gameRepository.deleteAll();
		
	}

}
