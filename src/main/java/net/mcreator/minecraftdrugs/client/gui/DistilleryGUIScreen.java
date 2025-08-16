package net.mcreator.minecraftdrugs.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.minecraftdrugs.world.inventory.DistilleryGUIMenu;
import net.mcreator.minecraftdrugs.procedures.TestProcedure;
import net.mcreator.minecraftdrugs.procedures.S9Procedure;
import net.mcreator.minecraftdrugs.procedures.S8Procedure;
import net.mcreator.minecraftdrugs.procedures.S7Procedure;
import net.mcreator.minecraftdrugs.procedures.S71Procedure;
import net.mcreator.minecraftdrugs.procedures.S70Procedure;
import net.mcreator.minecraftdrugs.procedures.S6Procedure;
import net.mcreator.minecraftdrugs.procedures.S69Procedure;
import net.mcreator.minecraftdrugs.procedures.S68Procedure;
import net.mcreator.minecraftdrugs.procedures.S67Procedure;
import net.mcreator.minecraftdrugs.procedures.S66Procedure;
import net.mcreator.minecraftdrugs.procedures.S65Procedure;
import net.mcreator.minecraftdrugs.procedures.S64Procedure;
import net.mcreator.minecraftdrugs.procedures.S63Procedure;
import net.mcreator.minecraftdrugs.procedures.S62Procedure;
import net.mcreator.minecraftdrugs.procedures.S61Procedure;
import net.mcreator.minecraftdrugs.procedures.S60Procedure;
import net.mcreator.minecraftdrugs.procedures.S5Procedure;
import net.mcreator.minecraftdrugs.procedures.S59Procedure;
import net.mcreator.minecraftdrugs.procedures.S58Procedure;
import net.mcreator.minecraftdrugs.procedures.S57Procedure;
import net.mcreator.minecraftdrugs.procedures.S56Procedure;
import net.mcreator.minecraftdrugs.procedures.S55Procedure;
import net.mcreator.minecraftdrugs.procedures.S54Procedure;
import net.mcreator.minecraftdrugs.procedures.S53Procedure;
import net.mcreator.minecraftdrugs.procedures.S52Procedure;
import net.mcreator.minecraftdrugs.procedures.S51Procedure;
import net.mcreator.minecraftdrugs.procedures.S50Procedure;
import net.mcreator.minecraftdrugs.procedures.S4Procedure;
import net.mcreator.minecraftdrugs.procedures.S49Procedure;
import net.mcreator.minecraftdrugs.procedures.S48Procedure;
import net.mcreator.minecraftdrugs.procedures.S47Procedure;
import net.mcreator.minecraftdrugs.procedures.S46Procedure;
import net.mcreator.minecraftdrugs.procedures.S45Procedure;
import net.mcreator.minecraftdrugs.procedures.S44Procedure;
import net.mcreator.minecraftdrugs.procedures.S43Procedure;
import net.mcreator.minecraftdrugs.procedures.S42Procedure;
import net.mcreator.minecraftdrugs.procedures.S41Procedure;
import net.mcreator.minecraftdrugs.procedures.S40Procedure;
import net.mcreator.minecraftdrugs.procedures.S3Procedure;
import net.mcreator.minecraftdrugs.procedures.S39Procedure;
import net.mcreator.minecraftdrugs.procedures.S38Procedure;
import net.mcreator.minecraftdrugs.procedures.S37Procedure;
import net.mcreator.minecraftdrugs.procedures.S36Procedure;
import net.mcreator.minecraftdrugs.procedures.S35Procedure;
import net.mcreator.minecraftdrugs.procedures.S34Procedure;
import net.mcreator.minecraftdrugs.procedures.S33Procedure;
import net.mcreator.minecraftdrugs.procedures.S32Procedure;
import net.mcreator.minecraftdrugs.procedures.S31Procedure;
import net.mcreator.minecraftdrugs.procedures.S30Procedure;
import net.mcreator.minecraftdrugs.procedures.S2Procedure;
import net.mcreator.minecraftdrugs.procedures.S29Procedure;
import net.mcreator.minecraftdrugs.procedures.S28Procedure;
import net.mcreator.minecraftdrugs.procedures.S27Procedure;
import net.mcreator.minecraftdrugs.procedures.S26Procedure;
import net.mcreator.minecraftdrugs.procedures.S25Procedure;
import net.mcreator.minecraftdrugs.procedures.S24Procedure;
import net.mcreator.minecraftdrugs.procedures.S23Procedure;
import net.mcreator.minecraftdrugs.procedures.S22Procedure;
import net.mcreator.minecraftdrugs.procedures.S21Procedure;
import net.mcreator.minecraftdrugs.procedures.S20Procedure;
import net.mcreator.minecraftdrugs.procedures.S19Procedure;
import net.mcreator.minecraftdrugs.procedures.S18Procedure;
import net.mcreator.minecraftdrugs.procedures.S17Procedure;
import net.mcreator.minecraftdrugs.procedures.S16Procedure;
import net.mcreator.minecraftdrugs.procedures.S15Procedure;
import net.mcreator.minecraftdrugs.procedures.S14Procedure;
import net.mcreator.minecraftdrugs.procedures.S13Procedure;
import net.mcreator.minecraftdrugs.procedures.S12Procedure;
import net.mcreator.minecraftdrugs.procedures.S11Procedure;
import net.mcreator.minecraftdrugs.procedures.S10Procedure;
import net.mcreator.minecraftdrugs.init.MinecraftDrugsModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class DistilleryGUIScreen extends AbstractContainerScreen<DistilleryGUIMenu> implements MinecraftDrugsModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;

	public DistilleryGUIScreen(DistilleryGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("minecraft_drugs:textures/screens/distillery_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/minecraf212r1uitest.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		if (TestProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss1.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss2.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss3.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss4.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss5.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss6.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss7.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S8Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss8.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S9Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss9.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S10Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss10.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S11Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss11.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S12Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss12.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S13Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss13.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S14Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss14.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S15Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss15.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S16Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss16.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S17Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss17.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S18Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss18.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S19Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss19.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S20Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss20.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S21Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss21.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S22Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss22.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S23Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss23.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S24Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss24.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S25Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss25.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S26Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss26.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S27Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss27.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S28Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss28.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S29Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss29.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S30Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss30.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S31Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss31.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S32Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss32.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S33Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss33.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S34Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss34.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S35Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss35.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S36Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss36.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S37Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss37.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S38Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss38.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S39Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss39.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S40Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss40.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S41Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss41.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S42Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss42.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S43Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss43.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S44Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss44.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S45Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss45.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S46Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss46.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S47Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss47.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S48Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss48.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S49Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss49.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S50Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss50.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S51Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss51.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S52Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss52.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S53Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss53.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S54Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss54.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S55Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss55.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S56Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss56.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S57Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss57.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S58Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss58.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S59Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss59.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S60Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss60.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S61Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss61.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S62Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss62.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S63Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss63.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S64Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss64.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S65Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss65.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S66Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss66.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S67Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss67.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S68Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss68.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S69Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss69.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S70Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss70.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		if (S71Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("minecraft_drugs:textures/screens/ss71.png"), this.leftPos + -1, this.topPos + 1, 0, 0, 180, 84, 180, 84);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
	}
}