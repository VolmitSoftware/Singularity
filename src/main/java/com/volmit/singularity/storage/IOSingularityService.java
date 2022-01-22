package com.volmit.singularity.storage;

import org.bukkit.World;

import java.io.File;

public class IOSingularityService implements SingularityWorld
{
    private final File worldFolder;

    public IOSingularityService(File worldFolder)
    {
        this.worldFolder = worldFolder;
    }

    @Override
    public File getWorldFolder() {
        return worldFolder;
    }

    @Override
    public boolean isReal() {
        return false;
    }
}
