package com.just1gaming321.bedrockvrmod.gui;

import com.just1gaming321.bedrockvrmod.vr.VRMode;
import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;

public class VRModeToggleButton extends Button {
    public VRModeToggleButton(int x, int y, int width, int height, OnPress onPress) {
        super(x, y, width, height, Component.literal("Toggle VR Mode"), onPress, DEFAULT_NARRATION);
    }

    @Override
    public void onPress() {
        VRMode.toggleVRMode();
        super.onPress();
    }
}
