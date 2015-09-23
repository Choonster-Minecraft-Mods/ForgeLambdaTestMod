package com.choonster.forgelambdatestmod.client;

import com.choonster.forgelambdatestmod.ForgeLambdaTestMod;
import net.minecraft.block.Block;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ModModelManager {
	public static ModModelManager INSTANCE = new ModModelManager();

	private ModModelManager() {
	}

	public void registerAllModels() {
		registerBlockItemModel(ForgeLambdaTestMod.basicBlock);
	}

	private void registerBlockItemModel(Block block) {
		registerItemModel(Item.getItemFromBlock(block));
	}

	private void registerItemModel(Item item) {
		registerItemModel(item, Item.itemRegistry.getNameForObject(item).toString());
	}

	private void registerItemModel(Item item, String modelLocation) {
		final ModelResourceLocation fullModelLocation = new ModelResourceLocation(modelLocation, "inventory");
		ModelBakery.addVariantName(item, modelLocation); // Ensure the custom model is loaded and prevent the default model from being loaded
		ModelLoader.setCustomMeshDefinition(item, stack -> fullModelLocation);
	}
}
