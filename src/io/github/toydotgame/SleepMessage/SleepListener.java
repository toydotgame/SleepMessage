package io.github.toydotgame.SleepMessage;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class SleepListener implements Listener {
	@EventHandler
	public void onPlayerSleep(PlayerBedEnterEvent bedEnterEvent) {
		Player player = bedEnterEvent.getPlayer();
		String playerNameString = player.getName();
		
		for(Player iteratePlayer : Bukkit.getServer().getOnlinePlayers()) {
			if(iteratePlayer != player) {
				iteratePlayer.sendMessage(playerNameString + " is sleeping in a bed. To skip to dawn, all players need to sleep in beds at the same time.");
			} else if(iteratePlayer == player) {
				player.sendMessage("You are sleeping in a bed. To skip to dawn, all players need to sleep in beds at the same time.");
			}
		}
	}
}
