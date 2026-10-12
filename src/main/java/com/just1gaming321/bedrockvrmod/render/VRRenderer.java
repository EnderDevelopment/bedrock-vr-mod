package com.just1gaming321.bedrockvrmod.render;

import com.just1gaming321.bedrockvrmod.vr.VRMode;
import com.just1gaming321.bedrockvrmod.vr.VRSettings;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class VRRenderer {
    public static void render(float partialTicks) {
        if (VRMode.isVRModeEnabled()) {
            Minecraft mc = Minecraft.getInstance();
            float renderScale = VRSettings.getRenderScale();
            float fov = VRSettings.getFov();

            // Set up stereoscopic rendering
            RenderSystem.clearColor(0.0F, 0.0F, 0.0F, 1.0F);
            RenderSystem.clear(GL30.GL_COLOR_BUFFER_BIT | GL30.GL_DEPTH_BUFFER_BIT, Minecraft.ON_OSX);

            // Left eye rendering
            GlStateManager._viewport(0, 0, mc.getWindow().getWidth() / 2, mc.getWindow().getHeight());
            mc.gameRenderer.render(partialTicks, 0L, true);

            // Right eye rendering
            GlStateManager._viewport(mc.getWindow().getWidth() / 2, 0, mc.getWindow().getWidth() / 2, mc.getWindow().getHeight());
            mc.gameRenderer.render(partialTicks, 0L, true);
        }
    }
}
