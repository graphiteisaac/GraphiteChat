package com.grphcrtv.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Ciao implements Listener {
    // Join event
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.setJoinMessage("§4§l[»]§r %s");
    }

    // Leave event
    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        e.setQuitMessage("§4§l[«]§r %s");
    }
}
