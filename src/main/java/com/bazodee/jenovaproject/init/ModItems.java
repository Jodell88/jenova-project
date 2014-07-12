package com.bazodee.jenovaproject.init;

import com.bazodee.jenovaproject.Item.*;
import com.bazodee.jenovaproject.reference.Names;
import com.bazodee.jenovaproject.utils.ArmorType;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemJP rawhide = new ItemRawhide();
    public static final ItemJP ingotTin = new ItemIngotTin();
    public static final ItemJP ingotCopper = new ItemIngotCopper();
    public static final ItemJP ingotChromium = new ItemIngotChromium();

    public static final ItemArmorJP bronzeHelm = new ItemArmorBronze(ArmorType.HELMET);
    public static final ItemArmorJP bronzeChest = new ItemArmorBronze(ArmorType.CHEST);
    public static final ItemArmorJP bronzeLegs = new ItemArmorBronze(ArmorType.LEGS);
    public static final ItemArmorJP bronzeBoots = new ItemArmorBronze(ArmorType.BOOTS);

    public static void init()
    {
        GameRegistry.registerItem(rawhide, "rawhide");
        GameRegistry.registerItem(ingotTin, "ingotTin");
        GameRegistry.registerItem(ingotCopper, "ingotCopper");
        GameRegistry.registerItem(ingotChromium, "ingotChromium");

        GameRegistry.registerItem(bronzeHelm, Names.Armor.BRONZE_HELM);
        GameRegistry.registerItem(bronzeChest, Names.Armor.BRONZE_CHEST);
        GameRegistry.registerItem(bronzeLegs, Names.Armor.BRONZE_LEGS);
        GameRegistry.registerItem(bronzeBoots, Names.Armor.BRONZE_BOOTS);
    }
}
