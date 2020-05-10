package creativetools;

import creativetools.events.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class CreativeTools extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getConsoleSender().sendMessage("CreativeTools enabled!");
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new OnJoinEvent(), this);
        pm.registerEvents(new OnBlockBreak(), this);
        pm.registerEvents(new OnBlockPlace(), this);
        pm.registerEvents(new OnUse(), this);
        pm.registerEvents(new OnThrow(), this);
    }

    @Override
    public void onDisable() {
        Bukkit.getServer().getConsoleSender().sendMessage("CreativeTools disabled!");
    }
}
