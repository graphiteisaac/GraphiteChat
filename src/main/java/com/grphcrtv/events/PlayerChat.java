package com.grphcrtv.events;

import com.grphcrtv.GrphChat;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.Objects;
import java.util.UUID;

public class PlayerChat implements Listener {
    private final GrphChat plugin;

    public PlayerChat(GrphChat plugin) {
        this.plugin = plugin;
    }

    // Player chat event
    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
        UUID uuid = p.getUniqueId();
        String msg = ChatColor.translateAlternateColorCodes('&', e.getMessage());

        if (Objects.requireNonNull(plugin.getConfig().getString(String.valueOf(uuid))).length() > 0) {
            e.setFormat(ChatColor.GOLD + "" + ChatColor.BOLD + "%s  " + ChatColor.GRAY + "%s");
        } else {
            e.setFormat(ChatColor.RED + "" + ChatColor.BOLD + "%s  " + ChatColor.GRAY + "%s");
        }

        e.setMessage(msg);
    }
}
