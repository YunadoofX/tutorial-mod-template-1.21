package net.yunadoofx.tutorialmod.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.yunadoofx.tutorialmod.TutorialMod;

public class ModItems {
    public static final Item SUPER_AMETHYST = registerItem(name: "super_amethyst", new Item(new Item.Settings()));

//6:22

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
}

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);
    }


}
