package com.discdelight.discdelight;

import com.discdelight.discdelight.core.registry.ModItems;
import com.discdelight.discdelight.core.registry.ModCreativeModTabs;
import com.discdelight.discdelight.core.sound.ModSounds;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class DiscDelightForge {

    public DiscDelightForge() {
        DiscDelight.init();

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(bus);
        ModCreativeModTabs.register(bus);
        ModSounds.register(bus);

    }
}
