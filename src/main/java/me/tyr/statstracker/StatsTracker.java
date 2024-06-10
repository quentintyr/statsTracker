package me.tyr.statstracker;

import org.bukkit.plugin.java.JavaPlugin;

import java.sql.SQLOutput;

public final class StatsTracker extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("StatsTracker has been enabled!");

    }

    @Override
    public void onDisable() {
        System.out.println("StatsTracker has been disabled!");
    }
}
