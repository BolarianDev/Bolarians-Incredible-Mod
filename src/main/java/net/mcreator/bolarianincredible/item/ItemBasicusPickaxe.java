
package net.mcreator.bolarianincredible.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.bolarianincredible.ElementsBolariansIncredibleMod;

import java.util.Set;
import java.util.HashMap;

@ElementsBolariansIncredibleMod.ModElement.Tag
public class ItemBasicusPickaxe extends ElementsBolariansIncredibleMod.ModElement {
	@GameRegistry.ObjectHolder("bolarianincrediblemod:basicuspickaxe")
	public static final Item block = null;
	public ItemBasicusPickaxe(ElementsBolariansIncredibleMod instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("BASICUSPICKAXE", 3, 1164, 12f, 2f, 42)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 3);
				return ret.keySet();
			}
		}.setUnlocalizedName("basicuspickaxe").setRegistryName("basicuspickaxe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("bolarianincrediblemod:basicuspickaxe", "inventory"));
	}
}
