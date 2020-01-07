package com.halo.demo.mapper;

import com.halo.demo.model.Game;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameExtMapper {
    List<Game> getGamesByExample(Game game);
}