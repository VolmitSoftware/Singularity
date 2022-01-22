package com.volmit.singularity.storage;

import org.bukkit.World;

import java.io.File;

public class RealSingularityService extends IOSingularityService
{
    private final World world;

    public RealSingularityService(World world)
    {
        super(world.getWorldFolder());
        this.world = world;
    }

    @Override
    public boolean isReal() {
        return true;
    }
}
