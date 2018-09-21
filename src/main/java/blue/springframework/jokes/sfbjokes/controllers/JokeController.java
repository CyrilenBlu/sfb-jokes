package blue.springframework.jokes.sfbjokes.controllers;

import blue.springframework.jokes.sfbjokes.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController
{
    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model)
    {
        model.addAttribute("jokeA",jokeService.getJoke());
        return "chucknorris";
    }

}
