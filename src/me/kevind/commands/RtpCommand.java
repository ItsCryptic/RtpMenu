package me.kevind.commands;

import me.kevind.RtpMenu;
import me.kevind.menu.MenuRtp;
import me.kevind.utils.MessageUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RtpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("vrtp.rtp")) {
                player.openInventory(RtpMenu.getMenuRtpGUI().getInv());
            }else {
                MessageUtils.sendMessage(player, "&cYou do not have permission to use this command!");
            }
        }else {
            MessageUtils.sendMessage(sender, "&cYou must be a player to use this command!");
        }
        return false;
    }
}
