package net.mcreator.minecraftdrugs.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.minecraftdrugs.block.entity.MixingTableTileEntity;

public class MixingTableBlockModel extends GeoModel<MixingTableTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MixingTableTileEntity animatable) {
		return ResourceLocation.parse("minecraft_drugs:animations/mixing_table.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MixingTableTileEntity animatable) {
		return ResourceLocation.parse("minecraft_drugs:geo/mixing_table.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MixingTableTileEntity animatable) {
		return ResourceLocation.parse("minecraft_drugs:textures/block/mixing_table.png");
	}
}