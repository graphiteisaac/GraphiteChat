package com.grphcrtv.helpers;

import org.bukkit.ChatColor;

public class GetChatColour {

    public ChatColor GetChatColour(String argument) {
        ChatColor colour;

        switch (argument) {
            default:
            case "red":
                colour = ChatColor.RED;
                break;
            case "black":
                colour = ChatColor.BLACK;
                break;
            case "darkblue":
                colour = ChatColor.DARK_BLUE;
                break;
            case "darkgreen":
                colour = ChatColor.DARK_GREEN;
                break;
            case "darkaqua":
                colour = ChatColor.DARK_AQUA;
                break;
            case "darkred":
                colour = ChatColor.DARK_RED;
                break;
            case "darkpurple":
                colour = ChatColor.DARK_PURPLE;
                break;
            case "darkgrey":
                colour = ChatColor.DARK_GRAY;
                break;
            case "gold":
                colour = ChatColor.GOLD;
                break;
            case "grey":
                colour = ChatColor.GRAY;
                break;
            case "blue":
                colour = ChatColor.BLUE;
                break;
            case "green":
                colour = ChatColor.GREEN;
                break;
            case "aqua":
                colour = ChatColor.AQUA;
                break;
            case "purple":
                colour = ChatColor.LIGHT_PURPLE;
                break;
            case "yellow":
                colour = ChatColor.YELLOW;
                break;
            case "white":
                colour = ChatColor.WHITE;
                break;
        }

        return colour;
    }
}
