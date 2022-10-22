package org.by1337.spawnerfix.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.by1337.spawnerfix.utils.ConsoleWrite;

public class SpawnerListeners implements Listener {

    @EventHandler
    public void explode(EntityExplodeEvent e){
        e.blockList().removeIf(b -> b.getType() == Material.SPAWNER);
   }

    @EventHandler
    public void onChange(EntityChangeBlockEvent e) {
        if (e.getBlock().getType() == Material.SPAWNER)
            e.setCancelled(true);
    }
}