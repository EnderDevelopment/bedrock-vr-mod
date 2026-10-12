package com.just1gaming321.bedrockvrmod.input;

import com.just1gaming321.bedrockvrmod.vr.VRMode;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class VRInputHandler {
    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public void onKeyInput(InputEvent.Key event) {
        if (VRMode.isVRModeEnabled()) {
            // Handle VR-specific input
        }
    }
}
