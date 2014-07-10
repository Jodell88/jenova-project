package com.bazodee.jenovaproject.init;

import com.bazodee.jenovaproject.block.BlockCopperOre;
import com.bazodee.jenovaproject.block.BlockJP;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{

    public static final BlockJP copperOre = new BlockCopperOre();

    public static void init()
    {
        GameRegistry.registerBlock(copperOre, "copperOre");
    }
}
