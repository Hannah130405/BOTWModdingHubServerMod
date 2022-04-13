package net.HannahTheBeegirl.BOTWModdingMod.block.enums;

import net.minecraft.util.StringIdentifiable;

public enum Wallpaper implements StringIdentifiable {
    DEFAULT("default"),
    ENDER("ender"),
    COMB("comb"),
    LINUX("linux"),
    ESCA("esca"),
    TUNER("tuner"),
    OFF("off");

    private final String name;
    private static Wallpaper[] values = values();

    private Wallpaper(String name) {
        this.name = name;
    }

    @Override
    public String asString() {
        return this.name;
    }

    public static Wallpaper next(Wallpaper old) {
        return values[(old.ordinal()+1)%values.length];
    }
}
