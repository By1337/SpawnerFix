package org.by1337.spawnerfix;

import org.bukkit.plugin.java.JavaPlugin;
import org.by1337.spawnerfix.Listeners.SpawnerListeners;
import org.by1337.spawnerfix.utils.ConsoleWrite;

public final class Spawnerfix extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new SpawnerListeners(), this);
        ConsoleWrite.log("&fSpawnerFix Has been &aenable");
        ConsoleWrite.log("&fauthor &d", getDescription().getAuthors().get(0) );

    }

    @Override
    public void onDisable() {
        ConsoleWrite.log("&eHas been disabled!");

    }
}
