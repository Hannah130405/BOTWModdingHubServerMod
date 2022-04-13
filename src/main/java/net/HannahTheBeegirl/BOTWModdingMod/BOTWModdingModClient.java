package net.HannahTheBeegirl.BOTWModdingMod;

import net.HannahTheBeegirl.BOTWModdingMod.block.ModBlocks;
import net.HannahTheBeegirl.BOTWModdingMod.item.ModItems;
import net.HannahTheBeegirl.BOTWModdingMod.painting.ModPaintings;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BOTWModdingModClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GAMING_MONITOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FISH_TANK, RenderLayer.getTranslucent());
	}
}
