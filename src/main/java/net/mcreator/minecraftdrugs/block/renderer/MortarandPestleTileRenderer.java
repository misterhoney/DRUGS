package net.mcreator.minecraftdrugs.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.minecraftdrugs.block.model.MortarandPestleBlockModel;
import net.mcreator.minecraftdrugs.block.entity.MortarandPestleTileEntity;

public class MortarandPestleTileRenderer extends GeoBlockRenderer<MortarandPestleTileEntity> {
	public MortarandPestleTileRenderer() {
		super(new MortarandPestleBlockModel());
	}

	@Override
	public RenderType getRenderType(MortarandPestleTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}