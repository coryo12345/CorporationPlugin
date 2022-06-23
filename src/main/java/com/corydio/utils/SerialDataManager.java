package com.corydio.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import org.bukkit.util.io.BukkitObjectInputStream;
import org.bukkit.util.io.BukkitObjectOutputStream;

public class SerialDataManager {

    private final String filePath;

    public SerialDataManager(String _filePath) {
        this.filePath = _filePath;
    }

    /**
     * saveData
     * writes all inventories to file
     * 
     * @param filePath path to write
     * @return boolean success
     */
    public boolean saveData(Serializable data) {
        try {
            BukkitObjectOutputStream out = new BukkitObjectOutputStream(
                    new GZIPOutputStream(new FileOutputStream(this.filePath)));
            out.writeObject(data);
            out.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * loadData
     * loads all corporation inv data from file
     * 
     * @param filePath path to read
     * @return boolean success
     */
    public Serializable loadData() {
        try {
            BukkitObjectInputStream in = new BukkitObjectInputStream(
                    new GZIPInputStream(new FileInputStream(this.filePath)));
            Serializable data = (Serializable) in.readObject();
            in.close();
            return data;
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
