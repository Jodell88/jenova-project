package com.bazodee.jenovaproject.init;

import com.bazodee.jenovaproject.block.BlockChromiteOre;
import com.bazodee.jenovaproject.block.BlockCopperOre;
import com.bazodee.jenovaproject.block.BlockJP;
import com.bazodee.jenovaproject.block.BlockTinOre;
import com.bazodee.jenovaproject.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{

    public static final BlockJP copperOre = new BlockCopperOre();
    public static final BlockJP tinOre = new BlockTinOre();
    public static final BlockJP chromiteOre = new BlockChromiteOre();

    public static void init()
    {
        GameRegistry.registerBlock(copperOre, Names.Block.COPPER_ORE);
        GameRegistry.registerBlock(tinOre, Names.Block.TIN_ORE);
        GameRegistry.registerBlock(chromiteOre, Names.Block.CHROMITE_ORE);
    }
}
