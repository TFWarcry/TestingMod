package net.tfwarcry.testingmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tfwarcry.testingmod.TestingMod;
import net.tfwarcry.testingmod.item.custom.EightBallItem;
import net.tfwarcry.testingmod.item.custom.SmitingSwordItem;

public class ModItems {
    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));
        public static final Item TANZANITE = registerItem("tanzanite",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));

        public static final Item TANZANITE_PICKAXE =  registerItem("tanzanite_pickaxe", new PickaxeItem(ModToolMaterial.TANZANITE, 7, 2f,
                new FabricItemSettings().group(ModItemGroup.TANZANITE).maxCount(1)));

        public static final Item EIGHT_BALL = registerItem("eight_ball",
                new EightBallItem(new FabricItemSettings().group(ModItemGroup.TANZANITE).maxCount(1)));
        public static final Item SMITING_SWORD = registerItem("smiting_sword",
                new SmitingSwordItem(ModToolMaterial.TANZANITE, 7, 2f, new FabricItemSettings().group(ModItemGroup.TANZANITE).maxCount(1)));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TestingMod.MOD_ID,name), item);
    }
    public static void registerModItems(){
        TestingMod.LOGGER.debug("Registering mod items for " + TestingMod.MOD_ID);
    }
}
