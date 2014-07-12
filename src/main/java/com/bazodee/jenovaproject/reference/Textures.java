package com.bazodee.jenovaproject.reference;

import net.minecraft.util.ResourceLocation;

public class Textures
{
    public static final String RESOURCE_PREFIX = Reference.MOD_ID + ":";

    /**
     *  Armor Textures. Layer1 contains Helm, Chest and Boots. Layer2 contains legs
     */
    public static final String ARMOR_RESOURCE_LOCATION = RESOURCE_PREFIX + "textures/models/armor/";
    public static final String BRONZE_ARMOR_LAYER1 = ARMOR_RESOURCE_LOCATION + "bronze_layer1.png";
    public static final String BRONZE_ARMOR_LAYER2 = ARMOR_RESOURCE_LOCATION + "bronze_layer2.png";

    private static ResourceLocation getResourceLocation(String location)
    {
        return new ResourceLocation(Reference.MOD_ID, location);
    }
}
