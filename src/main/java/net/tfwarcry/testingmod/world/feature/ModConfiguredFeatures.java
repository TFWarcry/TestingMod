package net.tfwarcry.testingmod.world.feature;

import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.tfwarcry.testingmod.TestingMod;
import net.tfwarcry.testingmod.block.ModBlocks;


import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_TANZANITE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TANZANITE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEP_TANZANITE_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> NETHER_TANZANITE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.NETHER_TANZANITE_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> END_TANZANITE_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.END_TANZANITE_ORE.getDefaultState()));


    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TANZANITE_ORE =
            ConfiguredFeatures.register("tanzanite_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_TANZANITE_ORES, 11));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_TANZANITE_ORE =
            ConfiguredFeatures.register("nether_tanzanite_ore", Feature.ORE, new OreFeatureConfig(NETHER_TANZANITE_ORES, 8));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_TANZANITE_ORE =
            ConfiguredFeatures.register("end_tanzanite_ore", Feature.ORE, new OreFeatureConfig(END_TANZANITE_ORES, 11));



    public static void registerConfiguredFeatures(){

        TestingMod.LOGGER.debug("Registering the ModConfigFeatures for " + TestingMod.MOD_ID);
    }
}
