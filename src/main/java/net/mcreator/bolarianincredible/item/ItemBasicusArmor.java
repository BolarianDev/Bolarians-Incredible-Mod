
package net.mcreator.bolarianincredible.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.bolarianincredible.ElementsBolariansIncredibleMod;

@ElementsBolariansIncredibleMod.ModElement.Tag
public class ItemBasicusArmor extends ElementsBolariansIncredibleMod.ModElement {
	@GameRegistry.ObjectHolder("bolarianincrediblemod:basicusarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("bolarianincrediblemod:basicusarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("bolarianincrediblemod:basicusarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("bolarianincrediblemod:basicusarmorboots")
	public static final Item boots = null;
	public ItemBasicusArmor(ElementsBolariansIncredibleMod instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("BASICUSARMOR", "bolarianincrediblemod:basicus", 45, new int[]{6, 18, 15, 6}, 27,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("basicusarmorhelmet")
				.setRegistryName("basicusarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("basicusarmorbody")
				.setRegistryName("basicusarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("basicusarmorlegs")
				.setRegistryName("basicusarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("basicusarmorboots")
				.setRegistryName("basicusarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("bolarianincrediblemod:basicusarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("bolarianincrediblemod:basicusarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("bolarianincrediblemod:basicusarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("bolarianincrediblemod:basicusarmorboots", "inventory"));
	}
}
