package net.mcreator.projectmoira.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.projectmoira.ProjectMoiraMod;

import java.util.Map;

public class InvisBlockUpdateTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ProjectMoiraMod.LOGGER.warn("Failed to load dependency world for procedure InvisBlockUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ProjectMoiraMod.LOGGER.warn("Failed to load dependency x for procedure InvisBlockUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ProjectMoiraMod.LOGGER.warn("Failed to load dependency y for procedure InvisBlockUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ProjectMoiraMod.LOGGER.warn("Failed to load dependency z for procedure InvisBlockUpdateTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.WARPED_HYPHAE.getDefaultState(), 3);
	}
}
