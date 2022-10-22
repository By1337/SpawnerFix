package org.by1337.spawnerfix.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;

public class ConsoleWrite {

    private static final ConsoleCommandSender SENDER = Bukkit.getConsoleSender();
    private static final String PREFIX = "&7[&2SpawnerFix&7]";
    private ConsoleWrite() { }

    @SafeVarargs
    public static <T> void log(T... messages) {
        SENDER.sendMessage(colored(compressArgs(messages) ) );
    }

    private static String colored(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    @SafeVarargs
    private static <T> String compressArgs(T... args) {
        StringBuilder builder = new StringBuilder(PREFIX);

        for (T arg : args)
            builder.append(" ").append(arg);

        return builder.toString().trim();
    }
}
