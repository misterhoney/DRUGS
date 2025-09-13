package net.mcreator.minecraftdrugs.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.minecraftdrugs.block.model.MixingTableBlockModel;
import net.mcreator.minecraftdrugs.block.entity.MixingTableTileEntity;

public class MixingTableTileRenderer extends GeoBlockRenderer<MixingTableTileEntity> {
	public MixingTableTileRenderer() {
		super(new MixingTableBlockModel());
	}

	@Override
	public RenderType getRenderType(MixingTableTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}