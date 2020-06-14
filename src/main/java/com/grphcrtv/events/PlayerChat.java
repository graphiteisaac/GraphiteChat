package com.grphcrtv.events;

import com.grphcrtv.GrphChat;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
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

    private String GetChatColour(String argument) {
        String colour;

        switch (argument) {
            default:
            case "red":
//                colour = ChatColor.RED;
                colour = "§4";
                break;
            case "black":
//                colour = ChatColor.BLACK;
                colour = "§0";
                break;
            case "darkblue":
//                colour = ChatColor.DARK_BLUE;
                colour = "§1";
                break;
            case "darkgreen":
//                colour = ChatColor.DARK_GREEN;
                colour = "§2";
                break;
            case "darkaqua":
//                colour = ChatColor.DARK_AQUA;
                colour = "§3";
                break;
            case "darkred":
//                colour = ChatColor.DARK_RED;
                colour = "§4";
                break;
            case "darkpurple":
//                colour = ChatColor.DARK_PURPLE;
                colour = "§5";
                break;
            case "darkgrey":
//                colour = ChatColor.DARK_GRAY;
                colour = "§8";
                break;
            case "gold":
//                colour = ChatColor.GOLD;
                colour = "§6";
                break;
            case "grey":
//                colour = ChatColor.GRAY;
                colour = "§7";
                break;
            case "blue":
//                colour = ChatColor.BLUE;
                colour = "§9";
                break;
            case "green":
//                colour = ChatColor.GREEN;
                colour = "§a";
                break;
            case "aqua":
//                colour = ChatColor.AQUA;
                colour = "§b";
                break;
            case "purple":
//                colour = ChatColor.LIGHT_PURPLE;
                colour = "§c";
                break;
            case "yellow":
//                colour = ChatColor.YELLOW;
                colour = "§d";
                break;
            case "white":
//                colour = ChatColor.WHITE;
                colour = "§e";
                break;
        }

        return colour;
    }

    // Player chat event
    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
        String msg = ChatColor.translateAlternateColorCodes('&', e.getMessage());
        String colourCode = plugin.getConfig().getString("colours[" + p.getUniqueId() + "]");

        if (colourCode != null) {
            e.setFormat(colourCode + "%s  " + ChatColor.WHITE + "%s");
        } else {
            e.setFormat(ChatColor.GRAY + "%s  " + ChatColor.WHITE + "%s");
        }

        e.setMessage(msg);
    }
}
