
package net.mcreator.purplesands.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.purplesands.init.PurpleSandsModTabs;
import net.mcreator.purplesands.init.PurpleSandsModItems;

public abstract class PurpleArmorItem extends ArmorItem {
	public PurpleArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 35;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{5, 6, 8, 3}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 25;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PurpleSandsModItems.PURPLE_GEM));
			}

			@Override
			public String getName() {
				return "purple_armor";
			}

			@Override
			public float getToughness() {
				return 2.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		}, slot, properties);
	}

	public static class Helmet extends PurpleArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB));
			setRegistryName("purple_armor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "purple_sands:textures/models/armor/purple_layer_1.png";
		}
	}

	public static class Chestplate extends PurpleArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB));
			setRegistryName("purple_armor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "purple_sands:textures/models/armor/purple_layer_1.png";
		}
	}

	public static class Leggings extends PurpleArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB));
			setRegistryName("purple_armor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "purple_sands:textures/models/armor/purple_layer_2.png";
		}
	}

	public static class Boots extends PurpleArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(PurpleSandsModTabs.TAB_PURPLE_SANDS_TAB));
			setRegistryName("purple_armor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "purple_sands:textures/models/armor/purple_layer_1.png";
		}
	}
}
