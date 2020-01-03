package com.halo.demo.controller;

import com.halo.demo.model.Book;
import com.halo.demo.model.Game;
import com.halo.demo.model.Paper;
import com.halo.demo.service.GameService;
import com.halo.demo.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/12/1 19:28.
 */

@Controller
public class GameController {

    @Autowired
    private GameService gameService;

    /**
     * 查询所有的比赛信息
     */
    @RequestMapping("/ManageGame")
    public String gameInfo(HttpServletRequest request, Model model) {
        List<Game> games = gameService.getAllGame();
        request.getSession().setAttribute("allGame", games);
        model.addAttribute("allGame", games);
        return "game_info";
    }

    @RequestMapping("/teachergame")
    public String teachergame(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        Integer winner = (Integer) session.getAttribute("tno");
        List<Game> games = gameService.getGame(winner);
        request.getSession().setAttribute("allGame", games);
        model.addAttribute("allGame", games);
        return "teacher_game";
    }

    @RequestMapping("/GameAddAction")
    public String PapersAddAction(HttpServletRequest request, Model model) {
        return "teacher_game_add";
    }

    @RequestMapping("/DogamesAdd")
    public String dogamesAdd(@RequestParam("gno") Integer gno,
                              @RequestParam("gname") String gname,
                              @RequestParam("winner") Integer winner,
                              @RequestParam("type") String type,
                              @RequestParam("rank") String rank,
                              @RequestParam("rankno") Integer rankno, HttpServletRequest request) {

        Game game = new Game();
        game.setGno(gno);
        game.setGname(gname);
        game.setWinner(winner);
        game.setType(type);
        game.setRank(rank);
        game.setRankno(rankno);
        gameService.addgame(game);
        return "teacher_game";
    }

}