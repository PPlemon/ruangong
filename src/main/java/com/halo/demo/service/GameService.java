package com.halo.demo.service;

import com.halo.demo.mapper.GameMapper;
import com.halo.demo.mapper.PaperMapper;
import com.halo.demo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/12/1 19:30.
 */

@Service
public class GameService {

    @Autowired
    private GameMapper gameMapper;

    public Game getGameByGno(int gno_int) {
        Game game = gameMapper.selectByPrimaryKey(gno_int);
        return game;
    }


    public List<Game> getAllGame() {
        GameExample gameExample = new GameExample();
        List<Game> games = gameMapper.selectByExample(gameExample);
        return games;
    }

    public List<Game> getGame(Integer winner) {
        GameExample gameExample = new GameExample();
        GameExample.Criteria criteria2 = gameExample.createCriteria();
        criteria2.andWinnerEqualTo(winner);
        List<Game> games = gameMapper.selectByExample(gameExample);
        return games;
    }

    public Game addGame(Game game) {
        gameMapper.insert(game);
        return null;
    }

    public void updateGame(Game game) {
        if (game.getGno() != null) {
            GameExample gameExample = new GameExample();
            gameExample.createCriteria().andGnoEqualTo(game.getGno());
            List<Game> games = gameMapper.selectByExample(gameExample);
            // 插入用户信息
            if (games.size() != 0) {
                gameMapper.updateByExampleSelective(game, gameExample);
            }
        }
    }

        public void delGameByGno ( int gno){
            {
                gameMapper.deleteByPrimaryKey(gno);
            }
        }
    }

