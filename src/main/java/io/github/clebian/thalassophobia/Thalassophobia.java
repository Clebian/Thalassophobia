package io.github.clebian.thalassophobia;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(Thalassophobia.MODID)
public class Thalassophobia {
	public static final String MODID = "thalassophobia";
	
	public Thalassophobia(){
		MinecraftForge.EVENT_BUS.register(this);
	}
}
