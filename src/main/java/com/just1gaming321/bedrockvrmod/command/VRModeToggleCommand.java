package com.just1gaming321.bedrockvrmod.command;

import com.just1gaming321.bedrockvrmod.vr.VRMode;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;

public class VRModeToggleCommand {
    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("vrmode").executes(context -> {
            VRMode.toggleVRMode();
            context.getSource().sendSuccess(() -> Component.literal("VR Mode toggled."), true);
            return 1;
        }));
    }
}
