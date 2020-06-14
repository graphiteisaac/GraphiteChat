package com.grphcrtv.commands;

import com.grphcrtv.GrphChat;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Test implements CommandExecutor {
    private final GrphChat plugin;

    public Test(GrphChat plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;

            p.sendMessage("§a[grphChat] §7Hey there buddy");

            return true;
        } else {
            return false;
        }
    }
}
