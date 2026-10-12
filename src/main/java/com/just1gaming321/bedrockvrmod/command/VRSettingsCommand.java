package com.just1gaming321.bedrockvrmod.command;

import com.just1gaming321.bedrockvrmod.gui.VRSettingsScreen;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.client.Minecraft;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;

public class VRSettingsCommand {
    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("vrsettings").executes(context -> {
            Minecraft.getInstance().setScreen(new VRSettingsScreen());
            return 1;
        }));
    }
}
