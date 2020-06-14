package com.grphcrtv;

import com.grphcrtv.commands.SetNameColour;
import com.grphcrtv.events.Ciao;
import com.grphcrtv.events.PlayerChat;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class GrphChat extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Config file
        saveDefaultConfig();

        // Plugin startup logic
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(this, this);
        pm.registerEvents(new PlayerChat(this), this);
        pm.registerEvents(new Ciao(), this);

        Objects.requireNonNull(getCommand("namecolour")).setExecutor(new SetNameColour(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Disabling Graphite Chat");
    }
}
