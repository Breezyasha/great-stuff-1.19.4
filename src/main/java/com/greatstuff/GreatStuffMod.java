package com.greatstuff;

import com.greatstuff.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreatStuffMod implements ModInitializer {
    public static final String MOD_ID = "greatstuffmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("greatstuff");

    @Override
    public void onInitialize() {

        ModItems.registerModItems();
    }
}