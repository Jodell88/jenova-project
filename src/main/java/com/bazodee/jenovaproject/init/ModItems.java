package com.bazodee.jenovaproject.init;

import com.bazodee.jenovaproject.Item.*;
import com.bazodee.jenovaproject.Item.tools.ItemBronzeAxe;
import com.bazodee.jenovaproject.Item.tools.ItemBronzeHoe;
import com.bazodee.jenovaproject.Item.tools.ItemBronzePickaxe;
import com.bazodee.jenovaproject.Item.tools.ItemBronzeShovel;
import com.bazodee.jenovaproject.reference.Names;
import com.bazodee.jenovaproject.utils.ArmorType;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemJP rawhide = new ItemRawhide();
    public static final ItemJP ingotTin = new ItemIngotTin();
    public static final ItemJP ingotCopper = new ItemIngotCopper();
    public static final ItemJP ingotChromium = new ItemIngotChromium();
    public static final ItemFoodJP cookedEggs = new ItemCookedEggs();

    public static final ItemArmorJP bronzeHelm = new ItemArmorBronze(ArmorType.HELMET);
    public static final ItemArmorJP bronzeChest = new ItemArmorBronze(ArmorType.CHEST);
    public static final ItemArmorJP bronzeLegs = new ItemArmorBronze(ArmorType.LEGS);
    public static final ItemArmorJP bronzeBoots = new ItemArmorBronze(ArmorType.BOOTS);

    public static final ItemBronzePickaxe bronzePickaxe = new ItemBronzePickaxe();
    public static final ItemBronzeAxe bronzeAxe = new ItemBronzeAxe();
    public static final ItemBronzeShovel bronzeShovel = new ItemBronzeShovel();
    public static final ItemBronzeHoe bronzeHoe = new ItemBronzeHoe();

    public static void init()
    {
        GameRegistry.registerItem(rawhide, Names.Item.RAWHIDE);
        GameRegistry.registerItem(ingotTin, Names.Item.INGOT_TIN);
        GameRegistry.registerItem(ingotCopper, Names.Item.INGOT_COPPER);
        GameRegistry.registerItem(ingotChromium, Names.Item.INGOT_CHROMIUM);
        GameRegistry.registerItem(cookedEggs, Names.Item.COOKED_EGG);

        GameRegistry.registerItem(bronzeHelm, Names.Armor.BRONZE_HELM);
        GameRegistry.registerItem(bronzeChest, Names.Armor.BRONZE_CHEST);
        GameRegistry.registerItem(bronzeLegs, Names.Armor.BRONZE_LEGS);
        GameRegistry.registerItem(bronzeBoots, Names.Armor.BRONZE_BOOTS);

        GameRegistry.registerItem(bronzePickaxe, Names.ToolsAndWeapons.BRONZE_PICKAXE);
        GameRegistry.registerItem(bronzeAxe, Names.ToolsAndWeapons.BRONZE_AXE);
        GameRegistry.registerItem(bronzeShovel, Names.ToolsAndWeapons.BRONZE_SHOVEL);
        GameRegistry.registerItem(bronzeHoe, Names.ToolsAndWeapons.BRONZE_HOE);
    }
}
