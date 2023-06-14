package com.javaunit3.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
    @RequestMapping("/")
    public String getIndexPage() {

        return "index";
    }

    @RequestMapping("/bestMovie")
    public String getBestMoviePage(Model model) {
        model.addAttribute("BestMovie", bestMovieService.getBestMovie().getTitle());
        return "bestMovie";
    }

    @RequestMapping("/voteForBestMovieForm")
    public String voteForBestMovieFormPage() {
        return "voteForBestMovie";
    }

    @RequestMapping("/VoteForBestMovie")
    public String voteForBestMovie(HTTPServletRequest request, Model model) {
        String movieTitle = request.getParameter("movieTitle");
        model.addAttribute("BestMovieVote", movieTitle);
        return "VoteForBestMovie";
    }

}
