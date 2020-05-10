package creativetools.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;

public class OnThrow implements Listener {
    @EventHandler
    public void onThrow(ProjectileLaunchEvent event) {
        if (!(event.getEntity().getShooter() instanceof Player)) return;
        Player player = (Player) event.getEntity().getShooter();
        if (!player.hasPermission("creativeTools.builder." + player.getWorld().getName())) {
            event.setCancelled(true);
        }
    }
}
