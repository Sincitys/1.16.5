
package net.mcreator.projectmoira.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.projectmoira.ProjectMoiraModElements;

@ProjectMoiraModElements.ModElement.Tag
public class DagrumSwordItem extends ProjectMoiraModElements.ModElement {
	@ObjectHolder("project_moira:dagrum_sword")
	public static final Item block = null;

	public DagrumSwordItem(ProjectMoiraModElements instance) {
		super(instance, 63);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("dagrum_sword"));
	}
}
