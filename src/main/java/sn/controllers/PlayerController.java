package sn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import sn.domain.Player;
import sn.persistence.PlayerRepository;
import javax.validation.Valid;

@Controller
public class PlayerController {

    @Autowired
    PlayerRepository playerRepository;

    @GetMapping("/")
    public String displayIndex(Model model){

        model.addAttribute("players", playerRepository.findAll());
        return "index";
    }

    @GetMapping("/addPlayer")
    public String addPlayer(Player player){
        return "add-player";
    }

    @PostMapping("/savePlayer")
    public String Player(@Valid Player player, BindingResult result, Model model){
        playerRepository.save(player);
        model.addAttribute("players", playerRepository.findAll());
        return  "index";
    }

    @GetMapping("/setPlayer/{id}")
    public String setPlayer(@PathVariable long id, Model model, Player player){
        model.addAttribute("editPlayer", playerRepository.findById(id).get());
        return "set-player";
    }

    @PostMapping("/settedPlayer/{id}")
    public String settedPlayer(@PathVariable long id, @Valid Player player, BindingResult result, Model model){
        player.setPlayerId(id);
        player.setTeam(playerRepository.findById(id).get().getTeam());
        playerRepository.save(player);
        model.addAttribute("players", playerRepository.findAll());

        return "index";
    }

    @PostMapping("/deletedPlayer/{id}")
    public String deletedPlayer(@PathVariable long id, Model model){

        playerRepository.deleteById(id);
        model.addAttribute("players", playerRepository.findAll());

        return "index";
    }
}
