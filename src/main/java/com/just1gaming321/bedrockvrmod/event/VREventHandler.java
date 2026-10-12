package com.just1gaming321.bedrockvrmod.event;

import com.just1gaming321.bedrockvrmod.vr.VRMode;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderLevelStageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class VREventHandler {
    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public void onRenderLevelStage(RenderLevelStageEvent event) {
        if (VRMode.isVRModeEnabled()) {
            VRHeadTracking.updateHeadTracking();
            // Handle VR-specific rendering
        }
    }
}
