package com.xiaoyoyodeworld.xiaoyoyoawa;

import com.xiaoyoyodeworld.xiaoyoyoawa.ItemGroups.ModItemroups;
import com.xiaoyoyodeworld.xiaoyoyoawa.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Xiaoyoyodeworld implements ModInitializer {
	public static final String MOD_ID = "xiaoyoyodeworld";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
        ModItems.registerItems();
        ModItemroups.registerModItemGroups();
		LOGGER.info("Hello Fabric world!");
	}
}