package org.minecraft.lesson;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class BigDig extends JavaPlugin {
	@Override
	public boolean onCommand(CommandSender sender, Command command, 
			String label,  String[] arguments){
		//check your command and send argument to calling method
		return true;
	}
	
	public void executeComand(CommandSender sender, String[] arguments){
		//parse radius
		
		//get location
		////loop through a square with sides twice as wide as radius
		
		//inside loop, find blocks within radius, and set type as air
		
		//play a sound after the dig is dug
	}
}
