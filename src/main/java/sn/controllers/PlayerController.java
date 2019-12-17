package sn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import sn.domain.Player;
import sn.persistence.PlayerRepository;

import javax.validation.Valid;

@Controller
public class PlayerController {

    @Autowired
    PlayerRepository playerRepository;

    @GetMapping("/addPlayer")
    public String addPlayer(Player player){
        return "addPlayer";
    }

    @PostMapping("/savePlayer")
    public String Player(@Valid Player player, BindingResult result, Model model){
        playerRepository.save(player);
        model.addAttribute("players", playerRepository.findAll());
        return  "index";
    }
}
