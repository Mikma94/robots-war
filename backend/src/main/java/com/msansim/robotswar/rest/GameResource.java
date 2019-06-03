package com.msansim.robotswar.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msansim.robotswar.domain.GameEntity;
import com.msansim.robotswar.mapper.GameMapper;
import com.msansim.robotswar.services.GameService;
import com.msansim.robotswat.rest.dto.GameDto;

@RestController
@RequestMapping("/api/game")
public class GameResource {
	
	@Autowired
	private GameService gameService;
	
	@Autowired
	private GameMapper gameMapper;
	
	@PostMapping
	public ResponseEntity<GameDto> createGame(@RequestBody GameDto gameDto) {
		GameEntity game = gameMapper.toEntity(gameDto);
		game = gameService.save(game);
		return new ResponseEntity<GameDto>(gameMapper.toDto(game), HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<GameDto> finishGame(@RequestBody GameDto gameDto) {
		GameEntity game = gameMapper.toEntity(gameDto);
		game = gameService.update(game);
		return new ResponseEntity<GameDto>(gameMapper.toDto(game), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<GameDto>> getAllGames() {
		List<GameEntity> games = gameService.findAll();
		return new ResponseEntity<List<GameDto>>(gameMapper.toDto(games), HttpStatus.OK);
	}
	
	@DeleteMapping
	public void removeAll() {
		gameService.deleteAll();
	}
}
