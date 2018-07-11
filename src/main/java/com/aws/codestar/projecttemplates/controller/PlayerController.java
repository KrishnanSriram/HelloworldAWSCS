package com.aws.codestar.projecttemplates.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

	@Autowired
	private PlayerDAO playerDAO;
	
	@GetMapping("/players")
	public List<Player> findAllPlayers() {
		return playerDAO.listPlayers();
	}
	
	@GetMapping("/players/{playerId}")
	public Player findPlayers(@PathVariable String playerId) {
		return playerDAO.findPlayer(playerId);
	}

}
