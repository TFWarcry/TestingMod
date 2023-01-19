package net.tfwarcry.testingmod.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.tfwarcry.testingmod.world.feature.ModPlacedFeatures;

public class ModOreGeneration {

    public static void generateOres(){
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.TANZANITE_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.NETHER_TANZANITE_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_BARRENS,BiomeKeys.END_HIGHLANDS, BiomeKeys.END_MIDLANDS, BiomeKeys.SMALL_END_ISLANDS),
                GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.END_TANZANITE_ORE_PLACED.getKey().get());

    }
}
