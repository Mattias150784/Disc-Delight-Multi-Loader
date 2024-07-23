package com.discdelight.discdelight.core.registry;

import com.discdelight.discdelight.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DISC_DELIGHT = CREATIVE_MODE_TABS.register("disc_delight",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TAKING_FLIGHT.get()))
                    .title(Component.translatable("creativetab.disc_delight"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.A_THOUSAND_TIMES.get());
                        pOutput.accept(ModItems.AWAKEN.get());
                        pOutput.accept(ModItems.BEAUTIFUL_PIANO.get());
                        pOutput.accept(ModItems.BLUE_WAVES.get());
                        pOutput.accept(ModItems.BUSINESS_GROOVE.get());
                        pOutput.accept(ModItems.CLASSICAL_ROYAL.get());
                        pOutput.accept(ModItems.CLASSICAL_VIOLIN.get());
                        pOutput.accept(ModItems.CONGO_SQUARE.get());
                        pOutput.accept(ModItems.FUR_ELISE.get());
                        pOutput.accept(ModItems.LADIES_NIGHT.get());
                        pOutput.accept(ModItems.SALOON_PIANO.get());
                        pOutput.accept(ModItems.SEPERATION.get());
                        pOutput.accept(ModItems.SHIP_RAID.get());
                        pOutput.accept(ModItems.SHOOTING_STARS.get());
                        pOutput.accept(ModItems.SOFT_RUSH.get());
                        pOutput.accept(ModItems.TAKING_FLIGHT.get());
                        pOutput.accept(ModItems.THE_PRELUDE.get());
                        pOutput.accept(ModItems.WALTZ_IN_A_MIRROR.get());
                        pOutput.accept(ModItems.WAYS_OF_THE_WIZARD.get());
                        pOutput.accept(ModItems.WHIMSICAL_MOOD.get());
                        pOutput.accept(ModItems.ADVENTURES_IN_THE_SEA.get());
                        pOutput.accept(ModItems.ARISTOCRAT.get());
                        pOutput.accept(ModItems.BETRAYAL.get());
                        pOutput.accept(ModItems.DREAMSCAPE_ODYSSEY.get());
                        pOutput.accept(ModItems.EUROPE_TRAVEL.get());
                        pOutput.accept(ModItems.MEDIEVAL_MUSIC.get());
                        pOutput.accept(ModItems.RAGTIME_PIANO.get());
                        pOutput.accept(ModItems.TRAVELED_FAR_AND_WIDE.get());
                        pOutput.accept(ModItems.VERDANT.get());
                        pOutput.accept(ModItems.WESTERN_IN_GROOVE.get());
                        pOutput.accept(ModItems.ACOUSTIC_GUITAR.get());
                        pOutput.accept(ModItems.ANTHEM_PIANO.get());
                        pOutput.accept(ModItems.AVE_MARIA.get());
                        pOutput.accept(ModItems.CRYSTAL_SOUL.get());
                        pOutput.accept(ModItems.CZERNY_ETUDE.get());
                        pOutput.accept(ModItems.HOPEFUL_PIANO.get());
                        pOutput.accept(ModItems.I_HAD_A_DREAM_ABOUT_YOU.get());
                        pOutput.accept(ModItems.JAZZ_PIANO.get());
                        pOutput.accept(ModItems.PATH.get());
                        pOutput.accept(ModItems.SNOWDROPS.get());
                        pOutput.accept(ModItems.WHIMSICAL_PAGANS.get());
                        pOutput.accept(ModItems.BACK_TO_DAWN_CITY.get());
                        pOutput.accept(ModItems.CHRISTMAS_CAROL.get());
                        pOutput.accept(ModItems.DANCING_UNDER_STARS.get());
                        pOutput.accept(ModItems.ENDLESS_HORIZONS.get());
                        pOutput.accept(ModItems.IN_MY_ARMS.get());
                        pOutput.accept(ModItems.ISLAND_BREEZE.get());
                        pOutput.accept(ModItems.REACH_BEYOND.get());
                        pOutput.accept(ModItems.RUN_AWAY_WITH_ME.get());
                        pOutput.accept(ModItems.LOVE_RUN.get());
                        pOutput.accept(ModItems.LOTUS_SKY.get());
                        pOutput.accept(ModItems.SWEET_SERENADE.get());


                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> YOUTUBERS_MUSIC_DISC = CREATIVE_MODE_TABS.register("youtubers_music_disc",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TUNDRA.get()))
                    .title(Component.translatable("creativetab.youtubers_music_disc"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SPECIAL_MASHUP.get());
                        pOutput.accept(ModItems.ALIVE.get());
                        pOutput.accept(ModItems.BAD_OMEN.get());
                        pOutput.accept(ModItems.BELOW.get());
                        pOutput.accept(ModItems.BONUS_LEVEL.get());
                        pOutput.accept(ModItems.BREEZE.get());
                        pOutput.accept(ModItems.BRUTE.get());
                        pOutput.accept(ModItems.CASCADE.get());
                        pOutput.accept(ModItems.CELEBRATION.get());
                        pOutput.accept(ModItems.COMET.get());
                        pOutput.accept(ModItems.FOREST.get());
                        pOutput.accept(ModItems.GILDED.get());
                        pOutput.accept(ModItems.GLIDE.get());
                        pOutput.accept(ModItems.GUARDIAN.get());
                        pOutput.accept(ModItems.HUSK.get());
                        pOutput.accept(ModItems.LIGHTNING.get());
                        pOutput.accept(ModItems.LUMINOUS.get());
                        pOutput.accept(ModItems.MINESHAFT.get());
                        pOutput.accept(ModItems.NO_ESCAPE.get());
                        pOutput.accept(ModItems.NORTHERN_LIGHTS.get());
                        pOutput.accept(ModItems.OCHRE.get());
                        pOutput.accept(ModItems.OVERTUNE.get());
                        pOutput.accept(ModItems.PUMPKIN.get());
                        pOutput.accept(ModItems.RAIDERS.get());
                        pOutput.accept(ModItems.RIBBIT.get());
                        pOutput.accept(ModItems.SHRIEKER.get());
                        pOutput.accept(ModItems.SHRIEKER_X_BRUTE.get());
                        pOutput.accept(ModItems.SHULKER.get());
                        pOutput.accept(ModItems.SLEIGH.get());
                        pOutput.accept(ModItems.SNOWSTORM.get());
                        pOutput.accept(ModItems.SOULLESS.get());
                        pOutput.accept(ModItems.STRIDE.get());
                        pOutput.accept(ModItems.THE_ENDER_DRAGON.get());
                        pOutput.accept(ModItems.THE_WITHER.get());
                        pOutput.accept(ModItems.THUNDER_STORM.get());
                        pOutput.accept(ModItems.TIME.get());
                        pOutput.accept(ModItems.TUNDRA.get());
                        pOutput.accept(ModItems.UNDERSCORE.get());
                        pOutput.accept(ModItems.VOYAGE.get());
                        pOutput.accept(ModItems.WARDEN_RUN.get());


                    })
                    .build());

    public static void register(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
    } }