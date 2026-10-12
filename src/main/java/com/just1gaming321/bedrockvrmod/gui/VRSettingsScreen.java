package com.just1gaming321.bedrockvrmod.gui;

import com.just1gaming321.bedrockvrmod.vr.VRSettings;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class VRSettingsScreen extends Screen {
    public VRSettingsScreen() {
        super(Component.literal("VR Settings"));
    }

    @Override
    protected void init() {
        addRenderableWidget(new VRModeToggleButton(width / 2 - 100, height / 2 - 50, 200, 20, button -> {}));
        // Existing code
    }

    @Override
    protected void init() {
        addRenderableWidget(Button.builder(Component.literal("Render Scale: " + VRSettings.getRenderScale()), button -> {
            // Handle render scale change
        }).bounds(width / 2 - 100, height / 2 - 30, 200, 20).build());

        addRenderableWidget(Button.builder(Component.literal("FOV: " + VRSettings.getFov()), button -> {
            // Handle FOV change
        }).bounds(width / 2 - 100, height / 2, 200, 20).build());
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
        renderBackground(guiGraphics);
        super.render(guiGraphics, mouseX, mouseY, partialTicks);
    }
}
