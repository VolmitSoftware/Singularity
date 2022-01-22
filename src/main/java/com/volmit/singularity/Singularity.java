package com.volmit.singularity;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class Singularity extends JavaPlugin {
    public static Singularity instance;

    @Override
    public void onEnable()
    {
        instance = this;
    }

    @Override
    public void onDisable()
    {

    }

    public static File file(String path)
    {
        File f = new File(instance.getDataFolder(), path);
        f.getParentFile().mkdirs();
        return f;
    }

    public static File folder(String path)
    {
        File f = new File(instance.getDataFolder(), path);
        f.mkdirs();
        return f;
    }

    public static void info(String message)
    {
        instance.getLogger().info(message);
    }

    public static void warn(String message)
    {
        instance.getLogger().warning(message);
    }

    public static void error(String message)
    {
        instance.getLogger().severe(message);
    }
}
