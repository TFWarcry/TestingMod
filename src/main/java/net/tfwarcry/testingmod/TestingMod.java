package net.tfwarcry.testingmod;

import net.fabricmc.api.ModInitializer;
import net.tfwarcry.testingmod.block.ModBlocks;
import net.tfwarcry.testingmod.item.ModItems;
import net.tfwarcry.testingmod.world.feature.ModConfiguredFeatures;
import net.tfwarcry.testingmod.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestingMod implements ModInitializer {
	public static final String MOD_ID = "testingmod";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();


		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModOreGeneration.generateOres();
	}
}
