package net.HannahTheBeegirl.BOTWModdingMod.item;

import net.HannahTheBeegirl.BOTWModdingMod.BOTWModdingMod;
import net.HannahTheBeegirl.BOTWModdingMod.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup DECORATION = FabricItemGroupBuilder.build(new Identifier(BOTWModdingMod.MOD_ID, "decoration"),
            () -> new ItemStack(ModBlocks.SUSHI_PLATE.asItem()));
}
