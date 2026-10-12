package com.just1gaming321.bedrockvrmod.vr;

import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class VRMode {
    private static boolean isVRModeEnabled = false;

    @OnlyIn(Dist.CLIENT)
    public static void toggleVRMode() {
        isVRModeEnabled = !isVRModeEnabled;
        Minecraft.getInstance().options.setCameraType(isVRModeEnabled ? Minecraft.getInstance().options.getCameraType() : Minecraft.getInstance().options.getCameraType());
    }

    public static boolean isVRModeEnabled() {
        return isVRModeEnabled;
    }
}
