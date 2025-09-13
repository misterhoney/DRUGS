package net.mcreator.minecraftdrugs.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.minecraftdrugs.block.display.MixingTableDisplayItem;

public class MixingTableDisplayModel extends GeoModel<MixingTableDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MixingTableDisplayItem animatable) {
		return ResourceLocation.parse("minecraft_drugs:animations/mixing_table.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MixingTableDisplayItem animatable) {
		return ResourceLocation.parse("minecraft_drugs:geo/mixing_table.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MixingTableDisplayItem entity) {
		return ResourceLocation.parse("minecraft_drugs:textures/block/mixing_table.png");
	}
}