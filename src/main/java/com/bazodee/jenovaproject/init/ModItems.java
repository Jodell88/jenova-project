package com.bazodee.jenovaproject.init;

import com.bazodee.jenovaproject.Item.ItemJP;
import com.bazodee.jenovaproject.Item.ItemRawhide;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemJP rawhide = new ItemRawhide();

    public static void init()
    {
        GameRegistry.registerItem(rawhide, "Rawhide");
    }
}
