package com.xiaoyoyodeworld.xiaoyoyoawa.item;

import com.xiaoyoyodeworld.xiaoyoyoawa.Xiaoyoyodeworld;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item YOYOSWORD = ModregisterITEMS("yoyo_sword",
            new SwordItem(
                    ToolMaterials.NETHERITE, new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 1000000000, -2.4F))
            ));
    public static final Item DARGON_BONE  = ModregisterITEMS("dargon_bone", new Item(new Item.Settings()));
    public static final Item YOYO_HELMET = ModregisterITEMS("yoyo_helmet", new ArmorItem(ModArmorMaterials.YOYO, ArmorItem.Type.HELMET,
            new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));
    public static final Item YOYO_CHESTPLATE = ModregisterITEMS("yoyo_chestplate", new ArmorItem(ModArmorMaterials.YOYO, ArmorItem.Type.CHESTPLATE,
            new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));
    public static final Item YOYO_LEGGINGS = ModregisterITEMS("yoyo_leggings", new ArmorItem(ModArmorMaterials.YOYO, ArmorItem.Type.LEGGINGS,
            new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));
    public static final Item YOYO_BOOTS = ModregisterITEMS("yoyo_boots", new ArmorItem(ModArmorMaterials.YOYO, ArmorItem.Type.BOOTS,
            new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));
    public static final Item BlUE_YOYO_HELMET = ModregisterITEMS("blue_yoyo_helmet", new ArmorItem(ModArmorMaterials.YOYOBLUE, ArmorItem.Type.HELMET,
            new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));
    public static final Item BLUE_YOYO_CHESTPLATE = ModregisterITEMS("blue_yoyo_chestplate", new ArmorItem(ModArmorMaterials.YOYOBLUE, ArmorItem.Type.CHESTPLATE,
            new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));
    public static final Item BLUE_YOYO_LEGGINGS = ModregisterITEMS("blue_yoyo_leggings", new ArmorItem(ModArmorMaterials.YOYOBLUE, ArmorItem.Type.LEGGINGS,
            new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));
    public static final Item BLUE_YOYO_BOOTS = ModregisterITEMS("blue_yoyo_boots", new ArmorItem(ModArmorMaterials.YOYOBLUE, ArmorItem.Type.BOOTS,
            new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));
    public static final Item YOYO =  ModregisterITEMS("yoyo", new Item(new Item.Settings()));
    public static final Item BLUE_YOYO = ModregisterITEMS("blue_yoyo", new Item(new Item.Settings()));
    public static Item ModregisterITEMS(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Xiaoyoyodeworld.MOD_ID, id), item);
    }
    public static void registerItems(){
        Xiaoyoyodeworld.LOGGER.info("register items" + Xiaoyoyodeworld.MOD_ID);
    }

}
