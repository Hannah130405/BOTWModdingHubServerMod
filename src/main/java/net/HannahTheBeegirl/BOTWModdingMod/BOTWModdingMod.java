package net.HannahTheBeegirl.BOTWModdingMod;

import net.HannahTheBeegirl.BOTWModdingMod.block.ModBlocks;
import net.HannahTheBeegirl.BOTWModdingMod.item.ModItems;
import net.HannahTheBeegirl.BOTWModdingMod.painting.ModPaintings;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BOTWModdingMod implements ModInitializer {
	public static final String MOD_ID = "botw-modding-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModPaintings.registerPaintings();
	}
}
