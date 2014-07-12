package com.bazodee.jenovaproject.Item;

import com.bazodee.jenovaproject.creativetab.CreativeTabJP;
import net.minecraft.item.ItemFood;

public class ItemFoodJP extends ItemFood
{
    public ItemFoodJP(int healAmount, float saturation, boolean wolfTreat)
    {
        super(healAmount, saturation, wolfTreat);
        this.setCreativeTab(CreativeTabJP.JP_TABS);
    }
}
