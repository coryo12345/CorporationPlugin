package com.corydio.models;

import java.io.Serializable;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class Corporation implements Serializable {
    private int memberCount;
    private Inventory inventory;
    private UUID id;
    private String name;

    public Corporation(String _name) {
        this.memberCount = 1;
        this.name = _name;
        this.inventory = Bukkit.createInventory(null, 54, "Bank of " + this.name);
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return this.id;
    }

    public Inventory getInventory() {
        return this.inventory;
    }

    public String getName() {
        return this.name;
    }
}
