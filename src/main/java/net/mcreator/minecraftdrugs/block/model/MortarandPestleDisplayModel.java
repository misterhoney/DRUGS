package net.mcreator.minecraftdrugs.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.minecraftdrugs.block.display.MortarandPestleDisplayItem;

public class MortarandPestleDisplayModel extends GeoModel<MortarandPestleDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MortarandPestleDisplayItem animatable) {
		return ResourceLocation.parse("minecraft_drugs:animations/mortarpestle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MortarandPestleDisplayItem animatable) {
		return ResourceLocation.parse("minecraft_drugs:geo/mortarpestle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MortarandPestleDisplayItem entity) {
		return ResourceLocation.parse("minecraft_drugs:textures/block/mortarpestle.texture.png");
	}
}