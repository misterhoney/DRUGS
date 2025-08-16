package net.mcreator.minecraftdrugs.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.minecraftdrugs.block.display.DistilleryDisplayItem;

public class DistilleryDisplayModel extends GeoModel<DistilleryDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DistilleryDisplayItem animatable) {
		return ResourceLocation.parse("minecraft_drugs:animations/distillery4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DistilleryDisplayItem animatable) {
		return ResourceLocation.parse("minecraft_drugs:geo/distillery4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DistilleryDisplayItem entity) {
		return ResourceLocation.parse("minecraft_drugs:textures/block/no_bottle.png");
	}
}