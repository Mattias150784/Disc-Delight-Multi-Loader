package com.discdelight.discdelight.core.sound;

import com.discdelight.discdelight.Constants;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Constants.MOD_ID);



    public static final RegistryObject<SoundEvent> TAKING_FLIGHT = registerSoundEvents("taking_flight");
    public static final RegistryObject<SoundEvent> SHOOTING_STARS = registerSoundEvents("shooting_stars");

    public static final RegistryObject<SoundEvent> WALTZ_IN_A_MIRROR = registerSoundEvents("waltz_in_a_mirror");

    public static final RegistryObject<SoundEvent> WAYS_OF_THE_WIZARD = registerSoundEvents("ways_of_the_wizard");
    public static final RegistryObject<SoundEvent> CLASSICAL_ROYAL = registerSoundEvents("classical_royal");
    public static final RegistryObject<SoundEvent> CLASSICAL_VIOLIN = registerSoundEvents("classical_violin");

    public static final RegistryObject<SoundEvent> SHIP_RAID = registerSoundEvents("ship_raid");

    public static final RegistryObject<SoundEvent> FUR_ELISE = registerSoundEvents("fur_elise");
    public static final RegistryObject<SoundEvent> SOFT_RUSH = registerSoundEvents("soft_rush");

    public static final RegistryObject<SoundEvent> BLUE_WAVES = registerSoundEvents("blue_waves");

    public static final RegistryObject<SoundEvent> A_THOUSAND_TIMES = registerSoundEvents("a_thousand_times");
    public static final RegistryObject<SoundEvent> AWAKEN = registerSoundEvents("awaken");

    public static final RegistryObject<SoundEvent> BEAUTIFUL_PIANO = registerSoundEvents("beautiful_piano");

    public static final RegistryObject<SoundEvent> BUSINESS_GROOVE = registerSoundEvents("business_groove");
    public static final RegistryObject<SoundEvent> CONGO_SQUARE = registerSoundEvents("congo_square");
    public static final RegistryObject<SoundEvent> LADIES_NIGHT = registerSoundEvents("ladies_night");

    public static final RegistryObject<SoundEvent> SALOON_PIANO = registerSoundEvents("saloon_piano");

    public static final RegistryObject<SoundEvent> SEPERATION = registerSoundEvents("seperation");
    public static final RegistryObject<SoundEvent> THE_PRELUDE = registerSoundEvents("the_prelude");

    public static final RegistryObject<SoundEvent> WHIMSICAL_MOOD = registerSoundEvents("whimsical_mood");

    public static final RegistryObject<SoundEvent> ADVENTURES_IN_THE_SEA = registerSoundEvents("adventures_in_the_sea");
    public static final RegistryObject<SoundEvent> ARISTOCRAT = registerSoundEvents("aristocrat");

    public static final RegistryObject<SoundEvent> BETRAYAL = registerSoundEvents("betrayal");

    public static final RegistryObject<SoundEvent> DREAMSCAPE_ODYSSEY = registerSoundEvents("dreamscape_odyssey");
    public static final RegistryObject<SoundEvent> MEDIEVAL_MUSIC = registerSoundEvents("medieval_music");
    public static final RegistryObject<SoundEvent> EUROPE_TRAVEL = registerSoundEvents("europe_travel");

    public static final RegistryObject<SoundEvent> RAGTIME_PIANO = registerSoundEvents("ragtime_piano");

    public static final RegistryObject<SoundEvent> VERDANT = registerSoundEvents("verdant");
    public static final RegistryObject<SoundEvent> TRAVELED_FAR_AND_WIDE = registerSoundEvents("traveled_far_and_wide");

    public static final RegistryObject<SoundEvent> WESTERN_IN_GROOVE = registerSoundEvents("western_in_groove");

    public static final RegistryObject<SoundEvent> ACOUSTIC_GUITAR = registerSoundEvents("acoustic_guitar");

    public static final RegistryObject<SoundEvent> ANTHEM_PIANO = registerSoundEvents("anthem_piano");
    public static final RegistryObject<SoundEvent> AVE_MARIA = registerSoundEvents("ave_maria");

    public static final RegistryObject<SoundEvent> CRYSTAL_SOUL = registerSoundEvents("crystal_soul");

    public static final RegistryObject<SoundEvent> CZERNY_ETUDE = registerSoundEvents("czerny_etude");
    public static final RegistryObject<SoundEvent> HOPEFUL_PIANO = registerSoundEvents("hopeful_piano");
    public static final RegistryObject<SoundEvent> I_HAD_A_DREAM_ABOUT_YOU = registerSoundEvents("i_had_a_dream_about_you");

    public static final RegistryObject<SoundEvent> JAZZ_PIANO = registerSoundEvents("jazz_piano");

    public static final RegistryObject<SoundEvent> PATH = registerSoundEvents("path");
    public static final RegistryObject<SoundEvent> SNOWDROPS = registerSoundEvents("snowdrops");

    public static final RegistryObject<SoundEvent> WHIMSICAL_PAGANS = registerSoundEvents("whimsical_pagans");

    public static final RegistryObject<SoundEvent> BACK_TO_DAWN_CITY = registerSoundEvents("back_to_dawn_city");

    public static final RegistryObject<SoundEvent> CHRISTMAS_CAROL = registerSoundEvents("christmas_carol");
    public static final RegistryObject<SoundEvent> DANCING_UNDER_STARS = registerSoundEvents("dancing_under_stars");

    public static final RegistryObject<SoundEvent> ENDLESS_HORIZONS = registerSoundEvents("endless_horizons");

    public static final RegistryObject<SoundEvent> IN_MY_ARMS = registerSoundEvents("in_my_arms");
    public static final RegistryObject<SoundEvent> ISLAND_BREEZE = registerSoundEvents("island_breeze");
    public static final RegistryObject<SoundEvent> LOTUS_SKY = registerSoundEvents("lotus_sky");

    public static final RegistryObject<SoundEvent> LOVE_RUN = registerSoundEvents("love_run");

    public static final RegistryObject<SoundEvent> REACH_BEYOND = registerSoundEvents("reach_beyond");
    public static final RegistryObject<SoundEvent> RUN_AWAY_WITH_ME = registerSoundEvents("run_away_with_me");

    public static final RegistryObject<SoundEvent> SWEET_SERENADE = registerSoundEvents("sweet_serenade");

    public static final RegistryObject<SoundEvent> SPECIAL_MASHUP = registerSoundEvents("special_mashup");

    public static final RegistryObject<SoundEvent> ALIVE = registerSoundEvents("alive");
    public static final RegistryObject<SoundEvent> BAD_OMEN = registerSoundEvents("bad_omen");
    public static final RegistryObject<SoundEvent> BELOW = registerSoundEvents("below");

    public static final RegistryObject<SoundEvent> BONUS_LEVEL = registerSoundEvents("bonus_level");

    public static final RegistryObject<SoundEvent> BRUTE = registerSoundEvents("brute");
    public static final RegistryObject<SoundEvent> CASCADE = registerSoundEvents("cascade");

    public static final RegistryObject<SoundEvent> COMET = registerSoundEvents("comet");

    public static final RegistryObject<SoundEvent> CELEBRATION = registerSoundEvents("celebration");
    public static final RegistryObject<SoundEvent> BREEZE = registerSoundEvents("breeze");

    public static final RegistryObject<SoundEvent> FOREST = registerSoundEvents("forest");

    public static final RegistryObject<SoundEvent> GILDED = registerSoundEvents("gilded");
    public static final RegistryObject<SoundEvent> GLIDE = registerSoundEvents("glide");
    public static final RegistryObject<SoundEvent> HUSK = registerSoundEvents("husk");

    public static final RegistryObject<SoundEvent> GUARDIAN = registerSoundEvents("guardian");

    public static final RegistryObject<SoundEvent> LIGHTNING = registerSoundEvents("lightning");
    public static final RegistryObject<SoundEvent> LUMINOUS = registerSoundEvents("luminous");

    public static final RegistryObject<SoundEvent> MINESHAFT = registerSoundEvents("mineshaft");

    public static final RegistryObject<SoundEvent> NO_ESCAPE = registerSoundEvents("no_escape");

    public static final RegistryObject<SoundEvent> NORTHERN_LIGHTS = registerSoundEvents("northern_lights");
    public static final RegistryObject<SoundEvent> OCHRE = registerSoundEvents("ochre");

    public static final RegistryObject<SoundEvent> PUMPKIN = registerSoundEvents("pumpkin");

    public static final RegistryObject<SoundEvent> OVERTUNE = registerSoundEvents("overtune");
    public static final RegistryObject<SoundEvent> RAIDERS = registerSoundEvents("raiders");
    public static final RegistryObject<SoundEvent> RIBBIT = registerSoundEvents("ribbit");

    public static final RegistryObject<SoundEvent> SHRIEKER = registerSoundEvents("shrieker");

    public static final RegistryObject<SoundEvent> SHRIEKER_X_BRUTE = registerSoundEvents("shrieker_x_brute");
    public static final RegistryObject<SoundEvent> SHULKER = registerSoundEvents("shulker");

    public static final RegistryObject<SoundEvent> SLEIGH = registerSoundEvents("sleigh");

    public static final RegistryObject<SoundEvent> SNOWSTORM = registerSoundEvents("snowstorm");

    public static final RegistryObject<SoundEvent> THUNDER_STORM = registerSoundEvents("thunder_storm");
    public static final RegistryObject<SoundEvent> SOULLESS = registerSoundEvents("soulless");

    public static final RegistryObject<SoundEvent> STRIDE = registerSoundEvents("stride");

    public static final RegistryObject<SoundEvent> THE_ENDER_DRAGON = registerSoundEvents("the_ender_dragon");
    public static final RegistryObject<SoundEvent> THE_WITHER = registerSoundEvents("the_wither");
    public static final RegistryObject<SoundEvent> TIME = registerSoundEvents("time");

    public static final RegistryObject<SoundEvent> TUNDRA = registerSoundEvents("tundra");

    public static final RegistryObject<SoundEvent> UNDERSCORE = registerSoundEvents("underscore");
    public static final RegistryObject<SoundEvent> VOYAGE = registerSoundEvents("voyage");

    public static final RegistryObject<SoundEvent> WARDEN_RUN = registerSoundEvents("warden_run");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Constants.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}