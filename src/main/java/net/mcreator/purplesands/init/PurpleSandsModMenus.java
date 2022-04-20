
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purplesands.init;

import net.minecraftforge.fmllegacy.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.purplesands.world.inventory.SandRefinerGUIMenu;
import net.mcreator.purplesands.world.inventory.OrbCrafterGuiMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PurpleSandsModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<SandRefinerGUIMenu> SAND_REFINER_GUI = register("sand_refiner_gui",
			(id, inv, extraData) -> new SandRefinerGUIMenu(id, inv, extraData));
	public static final MenuType<OrbCrafterGuiMenu> ORB_CRAFTER_GUI = register("orb_crafter_gui",
			(id, inv, extraData) -> new OrbCrafterGuiMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
