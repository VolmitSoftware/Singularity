package com.volmit.singularity.storage;

import lombok.Data;

import java.io.File;

public interface SingularityWorld {
    File getWorldFolder();

    default File getSingularityFolder()
    {
        return new File(getWorldFolder(), "singularity");
    }

    default File getRegionFolder()
    {
        return new File(getWorldFolder(), "region");
    }

    boolean isReal();
}
