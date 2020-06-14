package com.grphcrtv.commands;

import com.grphcrtv.GrphChat;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class SetNameColour implements CommandExecutor {
    public Map<String, Object> configJson = new HashMap<>();
    private File configFile;
    private final GrphChat plugin;

    public SetNameColour(GrphChat plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            String pUuid = String.valueOf(p.getUniqueId());
            if (args.length > 0) {
                plugin.getConfig().set(pUuid, args[0]);
                p.sendMessage("Set " + pUuid + "'s colour to: " + args[0]);
            }
        }

        return true;
    }
}
