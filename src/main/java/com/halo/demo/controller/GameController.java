package com.halo.demo.controller;

import com.halo.demo.dto.TeacherDTO;
import com.halo.demo.model.Game;
import com.halo.demo.model.Game;
import com.halo.demo.model.Paper;
import com.halo.demo.model.Teacher;
import com.halo.demo.service.GameService;
import com.halo.demo.service.PaperService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @winner halo.
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
        gameService.addGame(game);
        HttpSession session = request.getSession();
        Integer type1 = (Integer) session.getAttribute("type");
        if(type1 == 2){                                       //2代表教师
            return "redirect:/teachergame";
        }
        return "redirect:/ManageGame";
    }

    @RequestMapping("/DoGamesUpdate")
    public String doGamesUpdate(@RequestParam("gno") Integer gno,
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
        gameService.updateGame(game);
        return "game_info";
    }
    @RequestMapping("/UpdateGame")
    public String updateGame(Map<String, Object> paramMap, HttpServletRequest httpServletRequest) {
        String gno = httpServletRequest.getParameter("gno");
        int gno_int = Integer.parseInt(gno);
        Game game = gameService.getGameByGno(gno_int);
        paramMap.put("updateGame", game);
        return "games_alter";
    }


    @RequestMapping("/DeleteGame")
    public String DeleteGame(HttpServletRequest httpServletRequest) {
        String gno = httpServletRequest.getParameter("gno");
        int gno_int = Integer.parseInt(gno);
        gameService.delGameByGno(gno_int);
        return "teacher_game";
    }

    @PostMapping("/SearchGames")
    public String SearchGames(HttpServletRequest httpServletRequest) {
        Game game = new Game();
        Integer gno = (httpServletRequest.getParameter("gno").equals("")) ? null : Integer.parseInt(httpServletRequest.getParameter("gno"));
        String gname = (httpServletRequest.getParameter("gname").equals("")) ? null : httpServletRequest.getParameter("gname");
        Integer winner = (httpServletRequest.getParameter("winner").equals("")) ? null : Integer.parseInt(httpServletRequest.getParameter("winner"));
        String type = (httpServletRequest.getParameter("type").equals("")) ? null : httpServletRequest.getParameter("type");
        String rank = (httpServletRequest.getParameter("rank").equals("")) ? null : httpServletRequest.getParameter("rank");
        game.setGno(gno);
        game.setGname(gname);
        game.setWinner(winner);
        game.setType(type);
        game.setRank(rank);
        List<Game> gamesByExample = gameService.getGameByExample(game);
        httpServletRequest.getSession().setAttribute("allGame", gamesByExample);
        return "forward:/GamesPage";
    }

    @RequestMapping("/GamesPage")
    public String gamesPage(HttpServletRequest httpServletRequest) {
        Object allGame = httpServletRequest.getSession().getAttribute("allGame");
        httpServletRequest.setAttribute("allGame", allGame);
        return "game_info";
    }
}