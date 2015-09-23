package com.choonster.forgelambdatestmod;

import com.choonster.forgelambdatestmod.block.BasicBlock;
import com.choonster.forgelambdatestmod.proxy.IProxy;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = ForgeLambdaTestMod.MODID, version = ForgeLambdaTestMod.VERSION)
public class ForgeLambdaTestMod {
	public static final String MODID = "forgelambdatestmod";
	public static final String VERSION = "${version}";

	@SidedProxy(clientSide = "com.choonster.forgelambdatestmod.proxy.ClientProxy", serverSide = "com.choonster.forgelambdatestmod.proxy.ServerProxy")
	public static IProxy proxy;

	public static CreativeTabs creativeTab = new CreativeTabs(MODID) {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(basicBlock);
		}
	};

	public static Block basicBlock;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		basicBlock = new BasicBlock();
		GameRegistry.registerBlock(basicBlock, "basicBlock");

		proxy.preInit();
	}
}
