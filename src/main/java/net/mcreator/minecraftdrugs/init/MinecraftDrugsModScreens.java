/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftdrugs.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.minecraftdrugs.client.gui.MotarScreen;
import net.mcreator.minecraftdrugs.client.gui.MixingtableguiScreen;
import net.mcreator.minecraftdrugs.client.gui.DistilleryGUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MinecraftDrugsModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(MinecraftDrugsModMenus.DISTILLERY_GUI.get(), DistilleryGUIScreen::new);
		event.register(MinecraftDrugsModMenus.MOTAR.get(), MotarScreen::new);
		event.register(MinecraftDrugsModMenus.MIXINGTABLEGUI.get(), MixingtableguiScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}