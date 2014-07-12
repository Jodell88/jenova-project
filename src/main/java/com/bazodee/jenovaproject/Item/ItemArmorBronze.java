package com.bazodee.jenovaproject.Item;

import com.bazodee.jenovaproject.reference.Names;
import com.bazodee.jenovaproject.reference.Textures;
import com.bazodee.jenovaproject.utils.ArmorType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

public class ItemArmorBronze extends ItemArmorJP
{
    public ItemArmorBronze(ArmorType armorType)
    {
        super(Names.Armor.BRONZE_ARMOR, bronzeArmorMaterial, armorType);
    }

    @Override
    public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot)
    {
        return null;
    }

    @Override
    public void damageArmor(EntityLivingBase entity, ItemStack armor, DamageSource source, int damage, int slot)
    {

    }

    @Override
    public String getArmorTexture(ItemStack itemStack, Entity entity, int armorSlot, String type)
    {
        if(itemStack.getItem() instanceof ItemArmorJP)
        {
            if(armorSlot == ArmorType.HELMET.ordinal() || armorSlot == ArmorType.CHEST.ordinal() || armorSlot == ArmorType.BOOTS.ordinal())
            {
                return Textures.BRONZE_ARMOR_LAYER1;
            }
            else if(armorSlot == ArmorType.LEGS.ordinal())
            {
                return Textures.BRONZE_ARMOR_LAYER2;
            }
        }
        return null;
    }
}
