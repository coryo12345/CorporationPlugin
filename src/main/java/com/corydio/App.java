package com.corydio;

import org.bukkit.plugin.java.JavaPlugin;

import com.corydio.commands.CorporationBank;
import com.corydio.commands.CorporationCreate;

/**
 * Hello world!
 *
 */
public class App extends JavaPlugin {
    @Override
    public void onEnable() {
        // init global logger
        Console.initLogger(getLogger());

        // load data

        // init commands
        this.getCommand("corpcreate").setExecutor(new CorporationCreate());
        // corpjoin
        // corpleave
        this.getCommand("bank").setExecutor(new CorporationBank());

        Console.log("Corporations loaded!");
    }

    @Override
    public void onDisable() {
        // clean-up
        // here we would save all inventories
    }
}
