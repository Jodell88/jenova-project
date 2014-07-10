package com.bazodee.jenovaproject;

import com.bazodee.jenovaproject.handler.ConfigurationHandler;
import com.bazodee.jenovaproject.proxy.Proxy;
import com.bazodee.jenovaproject.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class JenovaProject
{
    @Mod.Instance(Reference.MOD_ID)
    public static JenovaProject instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static Proxy proxy;

    @Mod.EventHandler
    public void preInitialization(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
    }

    @Mod.EventHandler
    public void initialization(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInitialization(FMLPostInitializationEvent event)
    {

    }
}
