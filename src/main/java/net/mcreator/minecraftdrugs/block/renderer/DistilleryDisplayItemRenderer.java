package net.mcreator.minecraftdrugs.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.minecraftdrugs.block.model.DistilleryDisplayModel;
import net.mcreator.minecraftdrugs.block.display.DistilleryDisplayItem;

public class DistilleryDisplayItemRenderer extends GeoItemRenderer<DistilleryDisplayItem> {
	public DistilleryDisplayItemRenderer() {
		super(new DistilleryDisplayModel());
	}

	@Override
	public RenderType getRenderType(DistilleryDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}