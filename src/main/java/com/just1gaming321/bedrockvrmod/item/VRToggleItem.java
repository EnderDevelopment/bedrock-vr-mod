package com.just1gaming321.bedrockvrmod.item;

import net.minecraft.world.item.Item;

public class VRToggleItem extends Item {
    public VRToggleItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (level.isClientSide) {
            VRMode.toggleVRMode();
        }
        return InteractionResultHolder.sidedSuccess(player.getItemInHand(hand), level.isClientSide);
    }
}
