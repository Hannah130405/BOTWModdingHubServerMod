package net.HannahTheBeegirl.BOTWModdingMod.block;

import net.HannahTheBeegirl.BOTWModdingMod.BOTWModdingMod;
import net.HannahTheBeegirl.BOTWModdingMod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block GAMING_MONITOR = registerBlock("gaming_monitor",
            new DecorationBlock(FabricBlockSettings.of(Material.METAL).luminance(3).strength(1f).nonOpaque()), ModItemGroup.DECORATION);
    public static final Block SUSHI_PLATE = registerBlock("sushi_plate",
            new SushiPlateHitbox(FabricBlockSettings.of(Material.GLASS).strength(0.5f).nonOpaque()), ModItemGroup.DECORATION);
    public static final Block FISH_TANK = registerBlock("fish_tank",
            new DecorationBlock(FabricBlockSettings.of(Material.GLASS).strength(0.5f).nonOpaque()), ModItemGroup.DECORATION);

    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(BOTWModdingMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(BOTWModdingMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        BOTWModdingMod.LOGGER.info("Registering Mod Blocks - "+BOTWModdingMod.MOD_ID);
    }
}
