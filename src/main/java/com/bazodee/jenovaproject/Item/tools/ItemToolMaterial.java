package com.bazodee.jenovaproject.Item.tools;

import com.bazodee.jenovaproject.reference.Names;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ItemToolMaterial
{
    public static Item.ToolMaterial bronze = EnumHelper.addToolMaterial(Names.ToolsAndWeapons.BRONZE_TOOL, 2, 500, 6.0F, 2.0F, 14);
}