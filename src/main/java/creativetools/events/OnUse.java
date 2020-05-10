package creativetools.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class OnUse implements Listener {
    @EventHandler
    public void onUseItem(PlayerInteractEvent event) {
        if (!event.getPlayer().hasPermission("creativeTools.builder." + event.getPlayer().getWorld().getName())) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onInteractEntity(PlayerInteractEntityEvent event) {
        if (!event.getPlayer().hasPermission("creativeTools.builder." + event.getPlayer().getWorld().getName())) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onInteractAtEntity(PlayerInteractAtEntityEvent event) {
        if (!event.getPlayer().hasPermission("creativeTools.builder." + event.getPlayer().getWorld().getName())) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void entityDamageEntity(EntityDamageByEntityEvent event) {
        event.setCancelled(true);
    }
}
