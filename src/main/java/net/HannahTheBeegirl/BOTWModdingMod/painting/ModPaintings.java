package net.HannahTheBeegirl.BOTWModdingMod.painting;

import net.HannahTheBeegirl.BOTWModdingMod.BOTWModdingMod;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPaintings {
    public static final PaintingMotive SYNTHWAVE = registerPainting("synthwave", new PaintingMotive(16, 16));

    private static PaintingMotive registerPainting(String name, PaintingMotive paintingMotive){
        return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(BOTWModdingMod.MOD_ID, name), paintingMotive);
    }

    public static void registerPaintings() {
        BOTWModdingMod.LOGGER.info("Registering Mod Paintings - "+BOTWModdingMod.MOD_ID);
    }
}
