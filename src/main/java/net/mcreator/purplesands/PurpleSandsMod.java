/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.mcreator.purplesands;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.purplesands.init.PurpleSandsModTabs;
import net.mcreator.purplesands.init.PurpleSandsModItems;
import net.mcreator.purplesands.init.PurpleSandsModFeatures;
import net.mcreator.purplesands.init.PurpleSandsModEntities;
import net.mcreator.purplesands.init.PurpleSandsModBlocks;
import net.mcreator.purplesands.init.PurpleSandsModBlockEntities;
import net.mcreator.purplesands.init.PurpleSandsModBiomes;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

@Mod("purple_sands")
public class PurpleSandsMod {
	public static final Logger LOGGER = LogManager.getLogger(PurpleSandsMod.class);
	public static final String MODID = "purple_sands";
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION,
			PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public PurpleSandsMod() {
		PurpleSandsModTabs.load();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		PurpleSandsModBlocks.REGISTRY.register(bus);
		PurpleSandsModItems.REGISTRY.register(bus);
		PurpleSandsModEntities.REGISTRY.register(bus);
		PurpleSandsModBlockEntities.REGISTRY.register(bus);
		PurpleSandsModFeatures.REGISTRY.register(bus);

		PurpleSandsModBiomes.REGISTRY.register(bus);

	}

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}
}
