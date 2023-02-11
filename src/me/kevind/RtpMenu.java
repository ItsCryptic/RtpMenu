package me.kevind;

import me.kevind.menu.MenuRtp;
import org.bukkit.plugin.java.JavaPlugin;

public class RtpMenu extends JavaPlugin {
    private static MenuRtp menurtp;
    private static RtpMenu instance;

    public static RtpMenu getInstance() {
        return instance;
    }
    public static MenuRtp getMenuRtpGUI() {
        return menurtp;
    }
    public void onEnable() {
        instance = this;
        menurtp = new MenuRtp();
    }
    public void onDisable() {

    }
}
