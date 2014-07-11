package com.bazodee.jenovaproject.Item.armor;

import com.bazodee.jenovaproject.reference.Names;
import com.bazodee.jenovaproject.utils.ArmorType;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.common.util.EnumHelper;

public abstract class ItemArmorJP extends ItemArmor implements ISpecialArmor
{
    protected static ArmorMaterial ArmorMaterialBronze = EnumHelper.addArmorMaterial(Names.Armor.BRONZE_ARMOR, 20, new int[]{2, 6, 5, 2}, 9);

    public ItemArmorJP(String armorName, ArmorMaterial armorMaterial, ArmorType armorType)
    {
        super(armorMaterial, 1, armorType.ordinal());
        this.setUnlocalizedName(armorName);
    }
}
