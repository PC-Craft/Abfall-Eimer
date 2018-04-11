package de.pc_craft.abfall.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import de.pc_craft.abfall.commands.AbfallCommand;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		Bukkit.getServer().getConsoleSender().sendMessage("§6PC-Craft.DE-AbfallEimer wurde erfolgreich aktiviert!");
		getCommand("abfall").setExecutor(new AbfallCommand());
	}
	
	public void onDisable() {
		Bukkit.getServer().getConsoleSender().sendMessage("§cPC-Craft.DE-AbfallEimer wurde deaktiviert!");
	}
	


}
