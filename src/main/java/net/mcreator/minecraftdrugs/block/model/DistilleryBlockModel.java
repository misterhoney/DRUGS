package net.mcreator.minecraftdrugs.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.minecraftdrugs.block.entity.DistilleryTileEntity;

public class DistilleryBlockModel extends GeoModel<DistilleryTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DistilleryTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return ResourceLocation.parse("minecraft_drugs:animations/distillery4.animation.json");
		if (blockstate == 2)
			return ResourceLocation.parse("minecraft_drugs:animations/distillery4.animation.json");
		return ResourceLocation.parse("minecraft_drugs:animations/distillery4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DistilleryTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return ResourceLocation.parse("minecraft_drugs:geo/distillery4.geo.json");
		if (blockstate == 2)
			return ResourceLocation.parse("minecraft_drugs:geo/distillery4.geo.json");
		return ResourceLocation.parse("minecraft_drugs:geo/distillery4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DistilleryTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return ResourceLocation.parse("minecraft_drugs:textures/block/distillery_on_magma.png");
		if (blockstate == 2)
			return ResourceLocation.parse("minecraft_drugs:textures/block/distillery_off.png");
		return ResourceLocation.parse("minecraft_drugs:textures/block/no_bottle.png");
	}
}