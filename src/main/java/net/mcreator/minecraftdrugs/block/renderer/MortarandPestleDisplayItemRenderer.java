package net.mcreator.minecraftdrugs.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.minecraftdrugs.block.model.MortarandPestleDisplayModel;
import net.mcreator.minecraftdrugs.block.display.MortarandPestleDisplayItem;

public class MortarandPestleDisplayItemRenderer extends GeoItemRenderer<MortarandPestleDisplayItem> {
	public MortarandPestleDisplayItemRenderer() {
		super(new MortarandPestleDisplayModel());
	}

	@Override
	public RenderType getRenderType(MortarandPestleDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}