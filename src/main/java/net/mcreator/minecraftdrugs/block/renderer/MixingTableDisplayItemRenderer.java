package net.mcreator.minecraftdrugs.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.minecraftdrugs.block.model.MixingTableDisplayModel;
import net.mcreator.minecraftdrugs.block.display.MixingTableDisplayItem;

public class MixingTableDisplayItemRenderer extends GeoItemRenderer<MixingTableDisplayItem> {
	public MixingTableDisplayItemRenderer() {
		super(new MixingTableDisplayModel());
	}

	@Override
	public RenderType getRenderType(MixingTableDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}