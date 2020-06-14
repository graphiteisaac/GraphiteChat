package com.grphcrtv;

import com.grphcrtv.commands.Test;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class GrphChat extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(this, this);

        Objects.requireNonNull(getCommand("test")).setExecutor(new Test(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Disabling Graphite Chat");
    }
}
