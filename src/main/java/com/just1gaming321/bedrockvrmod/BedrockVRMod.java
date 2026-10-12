package com.just1gaming321.bedrockvrmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("bedrockvrmod")
public class BedrockVRMod {
    private static final Logger LOGGER = LogManager.getLogger();

    public BedrockVRMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftForge.EVENT_BUS.register(new VREventHandler());
        MinecraftForge.EVENT_BUS.register(new VRInputHandler());
        MinecraftForge.EVENT_BUS.register(new VRModeToggleKeybind());
        MinecraftForge.EVENT_BUS.register(new VRSettingsKeybind());
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Bedrock VR Mod is setting up.");
        if (Minecraft.getInstance().isSameThread()) {
            Minecraft.getInstance().execute(() -> {
                VRPerformanceOptimizer.optimizePerformance();
                VRInterface.setupVRInterface();
                VRRenderer.render(0.0f);
            });
        }
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            VRModeToggleCommand.register(dispatcher);
            VRSettingsCommand.register(dispatcher);
        });
    }
}
