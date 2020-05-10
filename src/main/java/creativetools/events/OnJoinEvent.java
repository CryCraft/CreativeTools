package creativetools.events;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnJoinEvent implements Listener {

    @EventHandler
    public void onJoinEvent(PlayerJoinEvent event) {
        event.getPlayer().setGameMode(GameMode.CREATIVE);
    }
}
