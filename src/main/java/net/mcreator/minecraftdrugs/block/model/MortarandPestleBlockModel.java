package net.mcreator.minecraftdrugs.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.minecraftdrugs.block.entity.MortarandPestleTileEntity;

public class MortarandPestleBlockModel extends GeoModel<MortarandPestleTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MortarandPestleTileEntity animatable) {
		return ResourceLocation.parse("minecraft_drugs:animations/mortarpestle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MortarandPestleTileEntity animatable) {
		return ResourceLocation.parse("minecraft_drugs:geo/mortarpestle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MortarandPestleTileEntity animatable) {
		return ResourceLocation.parse("minecraft_drugs:textures/block/mortarpestle.texture.png");
	}
}