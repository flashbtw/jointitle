package de.flashyboi.minecraft.plugins.jointitle;

import de.flashyboi.minecraft.plugins.jointitle.event.PlayerJoinTitle;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class JoinTitle extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getServer().getConsoleSender().sendMessage("[JoinTitle] Enabled");
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerJoinTitle(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
