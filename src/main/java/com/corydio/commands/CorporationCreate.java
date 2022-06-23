package com.corydio.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import com.corydio.Console;

public class CorporationCreate implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            Console.log(player.toString());
            Console.log(player.getUniqueId().toString());

            Inventory inv = Bukkit.createInventory(null, 9, "test");

            player.openInventory(inv);

            return true;
        }
        return false;
    }

}
