package com.discdelight.discdelight.core.util;

import com.discdelight.discdelight.Constants;
import com.discdelight.discdelight.DiscDelight;
import com.discdelight.discdelight.DiscDelightForge;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> MUSIC_DISC = tag("music_disc");
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Constants.MOD_ID, name));
        }
    }
}
