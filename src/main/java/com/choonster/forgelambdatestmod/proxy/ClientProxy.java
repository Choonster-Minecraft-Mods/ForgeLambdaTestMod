package com.choonster.forgelambdatestmod.proxy;

import com.choonster.forgelambdatestmod.client.ModModelManager;

public class ClientProxy implements IProxy {
	@Override
	public void preInit() {
		ModModelManager.INSTANCE.registerAllModels();
	}
}
