package net.mcreator.minecraftdrugs.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.minecraftdrugs.item.CopperBatteryDeadItem;

public class CopperBatteryDeadItemModel extends GeoModel<CopperBatteryDeadItem> {
	@Override
	public ResourceLocation getAnimationResource(CopperBatteryDeadItem animatable) {
		return ResourceLocation.parse("minecraft_drugs:animations/copperbattery.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CopperBatteryDeadItem animatable) {
		return ResourceLocation.parse("minecraft_drugs:geo/copperbattery.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CopperBatteryDeadItem animatable) {
		return ResourceLocation.parse("minecraft_drugs:textures/item/copper_batterydead.png");
	}
}