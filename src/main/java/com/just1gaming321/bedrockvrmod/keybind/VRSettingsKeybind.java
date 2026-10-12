package com.just1gaming321.bedrockvrmod.keybind;

import com.just1gaming321.bedrockvrmod.gui.VRSettingsScreen;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.client.settings.KeyModifier;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class VRSettingsKeybind {
    private static final KeyMapping VR_SETTINGS_KEY = new KeyMapping("key.bedrockvrmod.vr_settings", KeyConflictContext.IN_GAME, KeyModifier.NONE, InputConstants.Type.KEYSYM, InputConstants.KEY_B, "key.category.bedrockvrmod");

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
        event.register(VR_SETTINGS_KEY);
    }

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event) {
        if (event.phase == TickEvent.Phase.END && VR_SETTINGS_KEY.consumeClick()) {
            Minecraft.getInstance().setScreen(new VRSettingsScreen());
        }
    }
}
