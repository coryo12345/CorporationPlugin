package com.corydio;

import org.bukkit.plugin.java.JavaPlugin;

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

        // init commands
        this.getCommand("corpcreate").setExecutor(new CorporationCreate());

        Console.log("Corporations loaded!");
    }

    @Override
    public void onDisable() {
        // clean-up
        // here we would save all inventories
    }
}
