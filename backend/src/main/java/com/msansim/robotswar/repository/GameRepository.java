package com.msansim.robotswar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msansim.robotswar.domain.GameEntity;

public interface GameRepository extends JpaRepository<GameEntity, Long> {

}
