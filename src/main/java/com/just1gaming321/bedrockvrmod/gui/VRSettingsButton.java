package com.just1gaming321.bedrockvrmod.gui;

import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;

public class VRSettingsButton extends Button {
    public VRSettingsButton(int x, int y, int width, int height, OnPress onPress) {
        super(x, y, width, height, Component.literal("VR Settings"), onPress, DEFAULT_NARRATION);
    }

    @Override
    public void onPress() {
        // Open VR settings screen
        super.onPress();
    }
}
