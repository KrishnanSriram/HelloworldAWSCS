package com.aws.codestar.projecttemplates.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PlayerDAO {
	private List<Player> players;
	
	public PlayerDAO() {
		this.players = new ArrayList<>();
	}
	
	public void addSamplePlayers() {
		if (this.players.size() <= 0) {
			Player p1 = new Player("1", "Krishnan", "Sriram", "krishnan.srm@gmail.com", "123-123-1234");
			Player p2 = new Player("2", "Anoop", "Joseph", "anoop.joseph@gmail.com", "123-123-1234");
			Player p3 = new Player("3", "Praveen", "Kumar", "praveen.kumar@gmail.com", "123-123-1234");
			Player p4 = new Player("4", "Amelia", "Derek", "amelia.derek@gmail.com", "123-123-1234");
			this.players.add(p1);
			this.players.add(p2);
			this.players.add(p3);
			this.players.add(p4);
		}
	}
	
	public List<Player> listPlayers() {
		this.addSamplePlayers();
		return this.players;
	}
	
	public Player findPlayer(String playerId) {
		for(Player player: this.players) {
			if(player.getPlayerId() == playerId) {
				return player;
			}
		}
		return null;
	}
}
