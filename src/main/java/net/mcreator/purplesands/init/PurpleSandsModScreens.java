
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purplesands.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.purplesands.client.gui.SandmanGUIScreen;
import net.mcreator.purplesands.client.gui.SandRefinerGUIScreen;
import net.mcreator.purplesands.client.gui.SandPitSacrificeScreen;
import net.mcreator.purplesands.client.gui.OrbCrafterGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PurpleSandsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(PurpleSandsModMenus.SAND_REFINER_GUI, SandRefinerGUIScreen::new);
			MenuScreens.register(PurpleSandsModMenus.ORB_CRAFTER_GUI, OrbCrafterGuiScreen::new);
			MenuScreens.register(PurpleSandsModMenus.SANDMAN_GUI, SandmanGUIScreen::new);
			MenuScreens.register(PurpleSandsModMenus.SAND_PIT_SACRIFICE, SandPitSacrificeScreen::new);
		});
	}
}
