package com.just1gaming321.bedrockvrmod.item;

import net.minecraft.world.item.Item;

public class VRSettingsItem extends Item {
    public VRSettingsItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (level.isClientSide) {
            Minecraft.getInstance().setScreen(new VRSettingsScreen());
        }
        return InteractionResultHolder.sidedSuccess(player.getItemInHand(hand), level.isClientSide);
    }
}
