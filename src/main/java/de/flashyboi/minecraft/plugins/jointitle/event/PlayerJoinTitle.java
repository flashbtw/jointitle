package de.flashyboi.minecraft.plugins.jointitle.event;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static org.bukkit.Sound.ENTITY_PLAYER_LEVELUP;

public class PlayerJoinTitle implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent ev) {
        Player player = ev.getPlayer();
        Location location = player.getLocation();
        String playername = player.getName();
        Sound bling = ENTITY_PLAYER_LEVELUP;
        player.sendTitle(ChatColor.AQUA+"Willkommen "+ChatColor.RED+playername, ChatColor.AQUA+"auf MistoryMC!",30,40,30);
        player.playSound(location,bling,100,100);
    }
}
