package com.grphcrtv.helpers;

import org.bukkit.entity.Player;

public class MessageUtilities {
    public static void SuccessMessage (Player p, String message) {
        p.sendMessage("§8[§agrphChat§8] §e" + message);
    }

    public static void ErrorMessage (Player p, String message) {
        p.sendMessage("§8[§cgrphChat§8] §e" + message);
    }
}
