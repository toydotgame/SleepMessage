package io.github.toydotgame.SleepMessage;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new SleepListener(), this);
		System.out.print("[Sleep Messages] Plugin loaded successfully!");
	}
}
