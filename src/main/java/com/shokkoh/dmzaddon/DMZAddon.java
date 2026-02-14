package com.shokkoh.dmzaddon;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(DMZAddon.MOD_ID)
public class DMZAddon {
    public static final String MOD_ID = "dmz_addon";
    public static final Logger LOGGER = LogManager.getLogger();

    public DMZAddon() {
        LOGGER.info("[DMZ-Addon] Addon files initialized successfully.");
    }
}