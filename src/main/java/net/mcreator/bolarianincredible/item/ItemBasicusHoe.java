
package net.mcreator.bolarianincredible.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.bolarianincredible.ElementsBolariansIncredibleMod;

import java.util.Set;
import java.util.HashMap;

@ElementsBolariansIncredibleMod.ModElement.Tag
public class ItemBasicusHoe extends ElementsBolariansIncredibleMod.ModElement {
	@GameRegistry.ObjectHolder("bolarianincrediblemod:basicushoe")
	public static final Item block = null;
	public ItemBasicusHoe(ElementsBolariansIncredibleMod instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("BASICUSHOE", 6, 1164, 12f, 0f, 42)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 6);
				return ret.keySet();
			}
		}.setUnlocalizedName("basicushoe").setRegistryName("basicushoe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("bolarianincrediblemod:basicushoe", "inventory"));
	}
}
