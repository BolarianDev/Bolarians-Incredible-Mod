
package net.mcreator.bolarianincredible.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.bolarianincredible.item.ItemBasicusGem;
import net.mcreator.bolarianincredible.block.BlockBasicusOre;
import net.mcreator.bolarianincredible.ElementsBolariansIncredibleMod;

@ElementsBolariansIncredibleMod.ModElement.Tag
public class RecipeBasicusOreSmelting extends ElementsBolariansIncredibleMod.ModElement {
	public RecipeBasicusOreSmelting(ElementsBolariansIncredibleMod instance) {
		super(instance, 7);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockBasicusOre.block, (int) (1)), new ItemStack(ItemBasicusGem.block, (int) (1)),
				2.0999999999999996F);
	}
}
