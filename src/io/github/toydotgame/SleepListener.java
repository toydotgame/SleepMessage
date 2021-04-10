package io.github.toydotgame;

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
		Bukkit.broadcastMessage(playerNameString + " slept in a bed.");
	}
}
