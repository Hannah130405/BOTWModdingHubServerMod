package net.HannahTheBeegirl.BOTWModdingMod.painting;

import net.HannahTheBeegirl.BOTWModdingMod.BOTWModdingMod;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPaintings {
    public static final PaintingMotive SYNTHWAVE = registerPainting("synthwave", new PaintingMotive(16, 16));
    public static final PaintingMotive GAME = registerPainting("game", new PaintingMotive(80, 48));
    public static final PaintingMotive LOW = registerPainting("low", new PaintingMotive(48, 16));
    public static final PaintingMotive RULER = registerPainting("ruler", new PaintingMotive(48, 64));
    public static final PaintingMotive RULER2 = registerPainting("ruler2", new PaintingMotive(16, 32));
    public static final PaintingMotive EARTH = registerPainting("earth", new PaintingMotive(32, 32));
    public static final PaintingMotive FIRE = registerPainting("fire", new PaintingMotive(32, 32));
    public static final PaintingMotive WATER = registerPainting("water", new PaintingMotive(32, 32));
    public static final PaintingMotive WIND = registerPainting("wind", new PaintingMotive(32, 32));

    private static PaintingMotive registerPainting(String name, PaintingMotive paintingMotive){
        return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(BOTWModdingMod.MOD_ID, name), paintingMotive);
    }

    public static void registerPaintings() {
        BOTWModdingMod.LOGGER.info("Registering Mod Paintings - "+BOTWModdingMod.MOD_ID);
    }
}
