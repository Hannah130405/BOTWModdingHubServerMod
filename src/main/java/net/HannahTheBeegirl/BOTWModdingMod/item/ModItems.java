package net.HannahTheBeegirl.BOTWModdingMod.item;

import net.HannahTheBeegirl.BOTWModdingMod.BOTWModdingMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //public static final Item GAMING_MONITOR = registerItem("gaming_monitor", new Item(new FabricItemSettings().group(ModItemGroup.DECORATION)));
    //public static final Item SUSHI_PLATE = registerItem("sushi_plate", new Item(new FabricItemSettings().group(ModItemGroup.DECORATION)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(BOTWModdingMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BOTWModdingMod.LOGGER.info("Registering Mod Items - "+BOTWModdingMod.MOD_ID);
    }
}
