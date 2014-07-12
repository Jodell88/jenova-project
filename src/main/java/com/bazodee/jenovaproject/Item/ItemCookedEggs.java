package com.bazodee.jenovaproject.Item;

import com.bazodee.jenovaproject.reference.Names;

public class ItemCookedEggs extends ItemFoodJP
{
    public ItemCookedEggs()
    {
        super(1, 0.5f, false);
        this.setUnlocalizedName(Names.Item.COOKED_EGG);
    }
}
