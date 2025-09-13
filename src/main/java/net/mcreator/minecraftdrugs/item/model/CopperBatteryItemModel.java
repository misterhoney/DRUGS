package net.mcreator.minecraftdrugs.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.minecraftdrugs.item.CopperBatteryItem;

public class CopperBatteryItemModel extends GeoModel<CopperBatteryItem> {
	@Override
	public ResourceLocation getAnimationResource(CopperBatteryItem animatable) {
		return ResourceLocation.parse("minecraft_drugs:animations/copperbattery.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CopperBatteryItem animatable) {
		return ResourceLocation.parse("minecraft_drugs:geo/copperbattery.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CopperBatteryItem animatable) {
		return ResourceLocation.parse("minecraft_drugs:textures/item/copper_battery.png");
	}
}