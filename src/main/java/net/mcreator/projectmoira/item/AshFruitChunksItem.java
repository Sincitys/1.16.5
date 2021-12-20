
package net.mcreator.projectmoira.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.projectmoira.ProjectMoiraModElements;

@ProjectMoiraModElements.ModElement.Tag
public class AshFruitChunksItem extends ProjectMoiraModElements.ModElement {
	@ObjectHolder("project_moira:ash_fruit_chunks")
	public static final Item block = null;

	public AshFruitChunksItem(ProjectMoiraModElements instance) {
		super(instance, 56);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(20).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(8).saturation(0.8f)

							.build()));
			setRegistryName("ash_fruit_chunks");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 46;
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
