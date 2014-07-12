package com.bazodee.jenovaproject.Item.tools;

import com.bazodee.jenovaproject.creativetab.CreativeTabJP;
import com.bazodee.jenovaproject.reference.Names;
import com.bazodee.jenovaproject.reference.Reference;
import com.bazodee.jenovaproject.utils.NameHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemHoe;

public class ItemBronzeHoe extends ItemHoe
{
    public ItemBronzeHoe()
    {
        super(ItemToolMaterial.bronze);
        this.setUnlocalizedName(Names.ToolsAndWeapons.BRONZE_HOE);
        this.setCreativeTab(CreativeTabJP.JP_TABS);
    }

    @Override
    public String getUnlocalizedName()
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
