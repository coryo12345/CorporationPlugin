package com.corydio.commands;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import com.corydio.Console;
import com.corydio.models.CorpData;
import com.corydio.models.Corporation;

public class CorporationBank implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            UUID playerId = player.getUniqueId();

            CorpData data = CorpData.getCorpData();
            Corporation corp = data.getCorporationForPlayer(playerId);
            if (corp == null) {
                return false;
            }

            Inventory corpBank = corp.getInventory();
            player.openInventory(corpBank);

            return true;
        }
        return false;
    }

}
