package net.tfwarcry.testingmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.tfwarcry.testingmod.TestingMod;
import net.tfwarcry.testingmod.item.ModItemGroup;

public class ModBlocks {
    public static final Block TANZANITE_BLOCK = registerBlock("tanzanite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.TANZANITE);
    public static final Block TANZANITE_ORE = registerBlock("tanzanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
            UniformIntProvider.create(3,7)), ModItemGroup.TANZANITE);

    public static final Block DEEP_TANZANITE_ORE = registerBlock ("deep_tanzanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(5f).requiresTool(),
            UniformIntProvider.create(3,7)), ModItemGroup.TANZANITE);

    public static final Block END_TANZANITE_ORE = registerBlock ("end_tanzanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool(),
                    UniformIntProvider.create(3,7)), ModItemGroup.TANZANITE);
    public static final Block NETHER_TANZANITE_ORE = registerBlock ("nether_tanzanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool(),
                    UniformIntProvider.create(3,7)), ModItemGroup.TANZANITE);



    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name,block,tab);
        return Registry.register(Registry.BLOCK,new Identifier(TestingMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(TestingMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));

    }

     public static void registerModBlocks(){
         TestingMod.LOGGER.debug("Registering ModBlocks for mod " + TestingMod.MOD_ID);
     }
}
