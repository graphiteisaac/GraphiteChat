package com.grphcrtv.commands;

import com.grphcrtv.GrphChat;
import com.grphcrtv.helpers.MessageUtilities;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.grphcrtv.helpers.ColourUtilities.GetChatColour;

public class SetNameColour implements TabExecutor {
    public Map<String, Object> configJson = new HashMap<>();
    private File configFile;
    private final GrphChat plugin;

    public SetNameColour(GrphChat plugin) {
        this.plugin = plugin;
    }

    public static boolean check(String[] arr, String toCheckValue) {
        for (String element : arr) {
            if (element.equalsIgnoreCase(toCheckValue)) return true;
        }
        return false;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            String pUuid = String.valueOf(p.getUniqueId());
            if (args.length > 0) {
                // Set config
                if (check(new String[] { "red", "black", "darkblue", "darkgreen", "darkaqua", "darkred", "darkpurple", "darkgrey", "gold", "grey", "blue", "green", "aqua", "purple", "yellow", "white" }, args[0])) {
                    plugin.getConfig().set("colours[" + pUuid + "]", GetChatColour(args[0]));
                    MessageUtilities.SuccessMessage(p, "Set your name colour to " + GetChatColour(args[0]) + args[0]);
                } else if (args[0].equalsIgnoreCase("reset")) {
                    plugin.getConfig().set("colours[" + pUuid + "]", null);
                    MessageUtilities.SuccessMessage(p, "Name colour reset");
                } else {
                    MessageUtilities.ErrorMessage(p, "Please only use a valid colour name.");
                }
            } else {
                MessageUtilities.ErrorMessage(p, "Please enter a colour name.");
            }

            plugin.saveConfig();
        }

        return true;
    }

    public List<String> onTabComplete(CommandSender sender, Command cmd, String alias, String[] args) {
        if (args.length == 1) {
            return Arrays.asList("reset", "red", "black", "darkblue", "darkgreen", "darkaqua", "darkred", "darkpurple", "darkgrey", "gold", "grey", "blue", "green", "aqua", "purple", "yellow", "white");
        }

        return null;
    }
}
