package com.just1gaming321.bedrockvrmod.keybind;

import com.just1gaming321.bedrockvrmod.vr.VRMode;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.client.settings.KeyModifier;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class VRModeToggleKeybind {
    private static final KeyMapping VR_MODE_TOGGLE_KEY = new KeyMapping("key.bedrockvrmod.vr_mode_toggle", KeyConflictContext.IN_GAME, KeyModifier.NONE, InputConstants.Type.KEYSYM, InputConstants.KEY_V, "key.category.bedrockvrmod");

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
        event.register(VR_MODE_TOGGLE_KEY);
    }

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event) {
        if (event.phase == TickEvent.Phase.END && VR_MODE_TOGGLE_KEY.consumeClick()) {
            VRMode.toggleVRMode();
        }
    }
}
