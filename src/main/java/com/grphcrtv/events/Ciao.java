package com.grphcrtv.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Ciao implements Listener {
    // Join event
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.setJoinMessage("§a§l[»]§r " + e.getPlayer().getDisplayName());
    }

    // Leave event
    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        e.setQuitMessage("§c§l[«]§r " + e.getPlayer().getDisplayName());
    }
}
