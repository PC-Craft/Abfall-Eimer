package de.pc_craft.abfall.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class AbfallCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player p = (Player) sender;
			if(p.hasPermission("pccraft.abfall")) {
				if(args.length == 0) {
					
					Inventory inv = Bukkit.createInventory(null, 9 * 3, "§6§lAbfall-Eimer");
					p.openInventory(inv);
					p.sendMessage("§bDu hast den Abfall-Eimer geöffnet!");
					
				} else
					p.sendMessage("§cBitte benutze §6/abfall§c!");
			} else
				p.sendMessage("§cDazu hast du keine Rechte!");
		}
		
		return false;
	}
	
	

}
