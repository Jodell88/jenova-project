package com.bazodee.jenovaproject.block;

import com.bazodee.jenovaproject.creativetab.CreativeTabJP;
import com.bazodee.jenovaproject.reference.Reference;
import com.bazodee.jenovaproject.utils.NameHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockJP extends Block
{
    public BlockJP(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabJP.JP_TABS);
    }

    public BlockJP()
    {
        super(Material.rock);
        this.setHarvestLevel("pickaxe", 2);
        this.setResistance(5.0f);
        this.setHardness(3.0f);
        this.setStepSound(soundTypePiston);
        this.setCreativeTab(CreativeTabJP.JP_TABS);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID + ":", NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
}
