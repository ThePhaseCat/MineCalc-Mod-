package com.minecalc;

import com.minecalc.event.KeyInputHandler;
import net.fabricmc.api.ClientModInitializer;

public class MineCalcClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        KeyInputHandler.register();
    }
}
