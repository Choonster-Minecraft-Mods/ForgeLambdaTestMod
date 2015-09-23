package com.choonster.forgelambdatestmod.block;

import com.choonster.forgelambdatestmod.ForgeLambdaTestMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BasicBlock extends Block {
	public BasicBlock() {
		super(Material.rock);
		setUnlocalizedName("basicBlock");
		setCreativeTab(ForgeLambdaTestMod.creativeTab);
	}
}
