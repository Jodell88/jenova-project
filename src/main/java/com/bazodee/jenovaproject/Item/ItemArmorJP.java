package com.bazodee.jenovaproject.Item;

import com.bazodee.jenovaproject.reference.Names;
import com.bazodee.jenovaproject.reference.Textures;
import com.bazodee.jenovaproject.utils.ArmorType;
import com.bazodee.jenovaproject.utils.NameHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.common.util.EnumHelper;

public abstract class ItemArmorJP extends ItemArmor implements ISpecialArmor
{
    protected static ArmorMaterial bronzeArmorMaterial = EnumHelper.addArmorMaterial(Names.Armor.BRONZE_ARMOR, 20, new int[]{2, 6, 5, 2}, 9);

    public ItemArmorJP(String armorName, ArmorMaterial armorMaterial, ArmorType armorType)
    {
        super(armorMaterial, 1, armorType.ordinal());
        this.setUnlocalizedName(armorName);
        this.setTextureName(String.format("%s%s%s", Textures.RESOURCE_PREFIX, armorName, getArmorTypeName(this.armorType)));
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s%s", Textures.RESOURCE_PREFIX, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()), getArmorTypeName(this.armorType));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s%s", Textures.RESOURCE_PREFIX, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName(itemStack)), getArmorTypeName(itemStack.getItem()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getArmorTypeName(Item item)
    {
        if(item instanceof ItemArmor)
        {
            ItemArmor itemArmor = (ItemArmor) item;
            return getArmorTypeName(itemArmor.armorType);
        }
        return "";
    }

    protected String getArmorTypeName(int slot)
    {
        if(slot == 0)
            return "Helm";

        else if(slot == 1)
            return "Chest";

        else if(slot == 2)
            return "Legs";

        else
            return "Boots";
    }

    @Override
    public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot)
    {
        return this.getArmorMaterial().getDamageReductionAmount(slot);
    }
}