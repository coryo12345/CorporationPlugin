package com.corydio.commands;

import java.util.UUID;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.corydio.models.CorpData;

public class CorporationCreate implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length < 1)
            return false;
        String name = args[0];

        if (sender instanceof Player) {
            Player player = (Player) sender;
            UUID playerId = player.getUniqueId();

            CorpData corpData = CorpData.getCorpData();
            corpData.addPlayerToNewCorporation(playerId, name);

            return true;
        }
        return false;
    }

}
