package com.msansim.robotswar.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.msansim.robotswar.domain.GameEntity;
import com.msansim.robotswat.rest.dto.GameDto;

@Mapper(componentModel = "spring")
public interface GameMapper {
	
	GameEntity toEntity(GameDto dto);
	GameDto toDto(GameEntity entity);
	List<GameDto> toDto(List<GameEntity> entity);
	

}
