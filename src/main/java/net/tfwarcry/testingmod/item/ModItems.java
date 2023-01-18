package net.tfwarcry.testingmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tfwarcry.testingmod.TestingMod;

public class ModItems {
    public static final Item RAW_TANZANITE = registerItemMethod("raw_tanzanite",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));
        public static final Item TANZANITE = registerItemMethod("tanzanite",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));




    private static Item registerItemMethod(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TestingMod.MOD_ID,name), item);
    }
    public static void registerModItems(){
        TestingMod.LOGGER.debug("Registering mod items for " + TestingMod.MOD_ID);
    }
}
