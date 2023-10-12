package com.greatstuff.item;

import com.greatstuff.GreatStuffMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_TAN = registerItem("raw_tan" , new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(GreatStuffMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        GreatStuffMod.LOGGER.info("Registering items for" + GreatStuffMod.MOD_ID);

    }
}

