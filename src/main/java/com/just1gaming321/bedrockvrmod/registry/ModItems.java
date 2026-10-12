package com.just1gaming321.bedrockvrmod.registry;

import com.just1gaming321.bedrockvrmod.item.VRToggleItem;
import com.just1gaming321.bedrockvrmod.item.VRSettingsItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "bedrockvrmod");

    public static final RegistryObject<Item> VR_TOGGLE = ITEMS.register("vr_toggle", () -> new VRToggleItem(new Item.Properties()));
    public static final RegistryObject<Item> VR_SETTINGS = ITEMS.register("vr_settings", () -> new VRSettingsItem(new Item.Properties()));
}
