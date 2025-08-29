package com.xiaoyoyodeworld.xiaoyoyoawa.ItemGroups;

import com.xiaoyoyodeworld.xiaoyoyoawa.Xiaoyoyodeworld;
import com.xiaoyoyodeworld.xiaoyoyoawa.item.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemroups {
    // 原版物品栏注册方法
//    public static final RegistryKey<ItemGroup> TUTORIAL_GROUP = register("tutorial_group");
//    private static RegistryKey<ItemGroup> register(String id) {
//        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(TutorialMod.MOD_ID, id));
//    }
//    public static void registerModItemGroups() {
//        Registry.register(Registries.ITEM_GROUP, TUTORIAL_GROUP,
//                ItemGroup.create(ItemGroup.Row.TOP, 7)
//                                .displayName(Text.translatable("itemGroup.tutorial_group"))
//                                        .icon(() -> new ItemStack(ModItems.ICE_ETHER))
//                        .entries((displayContext, entries) -> {
//                            entries.add(ModItems.ICE_ETHER);
//                        }).build());
//        TutorialMod.LOGGER.info("Registering Item Groups");
//    }
    // 利用返回值为ItemGroup，直接使用static final变量进行注册
    public static final ItemGroup TUTORIAL_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(Xiaoyoyodeworld.MOD_ID, "xiaoyoyodeworld"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.xiaoyoyodeworld"))
                    .icon(() -> new ItemStack(ModItems.YOYO))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.YOYO);
                        entries.add(ModItems.BLUE_YOYO);
                        entries.add(ModItems.YOYOSWORD);
                        entries.add(ModItems.BlUE_YOYO_HELMET);
                        entries.add(ModItems.BLUE_YOYO_CHESTPLATE);
                        entries.add(ModItems.BLUE_YOYO_LEGGINGS);
                        entries.add(ModItems.BLUE_YOYO_BOOTS);
                        entries.add(ModItems.YOYO_HELMET);
                        entries.add(ModItems.YOYO_CHESTPLATE);
                        entries.add(ModItems.YOYO_LEGGINGS);
                        entries.add(ModItems.YOYO_BOOTS);
                        entries.add(ModItems.DARGON_BONE);
                    }).build());
    // 初始化方法
    public static void registerModItemGroups() {
        Xiaoyoyodeworld.LOGGER.info("Registering Item Groups");
    }
}
