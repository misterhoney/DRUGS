/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftdrugs.init;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.minecraftdrugs.client.particle.Vape8pParticle;
import net.mcreator.minecraftdrugs.client.particle.Vape7pParticle;
import net.mcreator.minecraftdrugs.client.particle.Vape6pParticle;
import net.mcreator.minecraftdrugs.client.particle.Vape5pParticle;
import net.mcreator.minecraftdrugs.client.particle.Vape4pParticle;
import net.mcreator.minecraftdrugs.client.particle.Vape3pParticle;
import net.mcreator.minecraftdrugs.client.particle.Vape2pParticle;
import net.mcreator.minecraftdrugs.client.particle.Vape1pParticle;
import net.mcreator.minecraftdrugs.client.particle.MphetimenbreezeParticle;
import net.mcreator.minecraftdrugs.client.particle.MphetimenblazeParticle;
import net.mcreator.minecraftdrugs.client.particle.GlowBlowParticleParticle;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MinecraftDrugsModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(MinecraftDrugsModParticleTypes.GLOW_BLOW_PARTICLE.get(), GlowBlowParticleParticle::provider);
		event.registerSpriteSet(MinecraftDrugsModParticleTypes.VAPE_1P.get(), Vape1pParticle::provider);
		event.registerSpriteSet(MinecraftDrugsModParticleTypes.VAPE_2P.get(), Vape2pParticle::provider);
		event.registerSpriteSet(MinecraftDrugsModParticleTypes.VAPE_3P.get(), Vape3pParticle::provider);
		event.registerSpriteSet(MinecraftDrugsModParticleTypes.VAPE_4P.get(), Vape4pParticle::provider);
		event.registerSpriteSet(MinecraftDrugsModParticleTypes.VAPE_5P.get(), Vape5pParticle::provider);
		event.registerSpriteSet(MinecraftDrugsModParticleTypes.VAPE_6P.get(), Vape6pParticle::provider);
		event.registerSpriteSet(MinecraftDrugsModParticleTypes.VAPE_7P.get(), Vape7pParticle::provider);
		event.registerSpriteSet(MinecraftDrugsModParticleTypes.VAPE_8P.get(), Vape8pParticle::provider);
		event.registerSpriteSet(MinecraftDrugsModParticleTypes.MPHETIMENBREEZE.get(), MphetimenbreezeParticle::provider);
		event.registerSpriteSet(MinecraftDrugsModParticleTypes.MPHETIMENBLAZE.get(), MphetimenblazeParticle::provider);
	}
}