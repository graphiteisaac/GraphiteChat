package com.grphcrtv.helpers;

public class ColourUtilities {

    public static String GetChatColour(String colour) {
        switch (colour.toUpperCase()) {
            case "BLACK":
                return "§0";
            case "DARKBLUE":
                return "§1";
            case "DARKGREEN":
                return "§2";
            case "DARKAQUA":
                return "§3";
            case "DARKRED":
                return "§4";
            case "DARKPURPLE":
                return "§5";
            case "DARKGREY":
                return "§8";
            case "GOLD":
                return "§6";
            case "GREY":
                return "§7";
            case "BLUE":
                return "§9";
            case "GREEN":
                return "§a";
            default:
            case "AQUA":
                return "§b";
            case "RED":
                return "§c";
            case "PURPLE":
                return "§d";
            case "YELLOW":
                return "§e";
            case "WHITE":
                return "§f";
        }
    }
}
