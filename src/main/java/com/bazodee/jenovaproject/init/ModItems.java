package com.bazodee.jenovaproject.init;

import com.bazodee.jenovaproject.Item.ItemIngotCopper;
import com.bazodee.jenovaproject.Item.ItemIngotTin;
import com.bazodee.jenovaproject.Item.ItemJP;
import com.bazodee.jenovaproject.Item.ItemRawhide;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemJP rawhide = new ItemRawhide();
    public static final ItemJP ingotTin = new ItemIngotTin();
    public static final ItemJP ingotCopper = new ItemIngotCopper();

    public static void init()
    {
        GameRegistry.registerItem(rawhide, "rawhide");
        GameRegistry.registerItem(ingotTin, "ingotTin");
        GameRegistry.registerItem(ingotCopper, "ingotCopper");
    }
}
