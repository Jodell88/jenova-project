package com.bazodee.jenovaproject.Item;

import com.bazodee.jenovaproject.creativetab.CreativeTabJP;
import com.bazodee.jenovaproject.reference.Reference;
import com.bazodee.jenovaproject.utils.NameHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemFoodJP extends ItemFood
{
    public ItemFoodJP(int healAmount, float saturation, boolean wolfTreat)
    {
        super(healAmount, saturation, wolfTreat);
        this.setCreativeTab(CreativeTabJP.JP_TABS);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID + ":", NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID + ":", NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
}
