
package net.mcreator.bolarianincredible.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.bolarianincredible.procedure.ProcedureEvilateesFoodFoodEaten;
import net.mcreator.bolarianincredible.ElementsBolariansIncredibleMod;

@ElementsBolariansIncredibleMod.ModElement.Tag
public class ItemEvilateesFood extends ElementsBolariansIncredibleMod.ModElement {
	@GameRegistry.ObjectHolder("bolarianincrediblemod:evilateesfood")
	public static final Item block = null;
	public ItemEvilateesFood(ElementsBolariansIncredibleMod instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("bolarianincrediblemod:evilateesfood", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(7, 1.6f, false);
			setUnlocalizedName("evilateesfood");
			setRegistryName("evilateesfood");
			setCreativeTab(CreativeTabs.FOOD);
			setMaxStackSize(16);
		}

		@Override
		public int getMaxItemUseDuration(ItemStack stack) {
			return 48;
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}

		@Override
		protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
			super.onFoodEaten(itemStack, world, entity);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureEvilateesFoodFoodEaten.executeProcedure($_dependencies);
			}
		}
	}
}
