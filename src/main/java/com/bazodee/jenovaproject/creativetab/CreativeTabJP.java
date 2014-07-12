package com.bazodee.jenovaproject.creativetab;

import com.bazodee.jenovaproject.init.ModItems;
import com.bazodee.jenovaproject.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabJP
{
    public static final CreativeTabs JP_TABS = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.ingotChromium;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Jenova Project";
        }
    };
}
