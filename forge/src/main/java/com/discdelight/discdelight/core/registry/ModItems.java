package com.discdelight.discdelight.core.registry;

import com.discdelight.discdelight.Constants;
import com.discdelight.discdelight.core.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);


    public static final RegistryObject<Item> TAKING_FLIGHT = ITEMS.register("taking_flight" ,

            () -> new RecordItem(6, ModSounds.TAKING_FLIGHT,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> SHOOTING_STARS = ITEMS.register("shooting_stars" ,
            () -> new RecordItem(6, ModSounds.SHOOTING_STARS,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> WALTZ_IN_A_MIRROR = ITEMS.register("waltz_in_a_mirror" ,
            () -> new RecordItem(6, ModSounds.WALTZ_IN_A_MIRROR,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> WAYS_OF_THE_WIZARD = ITEMS.register("ways_of_the_wizard" ,
            () -> new RecordItem(6, ModSounds.WAYS_OF_THE_WIZARD,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> CLASSICAL_VIOLIN = ITEMS.register("classical_violin" ,

            () -> new RecordItem(6, ModSounds.CLASSICAL_VIOLIN,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> SHIP_RAID = ITEMS.register("ship_raid" ,
            () -> new RecordItem(6, ModSounds.SHIP_RAID,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> CLASSICAL_ROYAL = ITEMS.register("classical_royal" ,
            () -> new RecordItem(6, ModSounds.CLASSICAL_ROYAL, new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> SOFT_RUSH = ITEMS.register("soft_rush" ,
            () -> new RecordItem(6, ModSounds.SOFT_RUSH,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> FUR_ELISE = ITEMS.register("fur_elise" ,
            () -> new RecordItem(6, ModSounds.FUR_ELISE,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> BLUE_WAVES = ITEMS.register("blue_waves" ,
            () -> new RecordItem(6, ModSounds.BLUE_WAVES,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> A_THOUSAND_TIMES = ITEMS.register("a_thousand_times" ,

            () -> new RecordItem(6, ModSounds.A_THOUSAND_TIMES,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> AWAKEN = ITEMS.register("awaken" ,
            () -> new RecordItem(6, ModSounds.AWAKEN,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> BEAUTIFUL_PIANO = ITEMS.register("beautiful_piano" ,
            () -> new RecordItem(6, ModSounds.BEAUTIFUL_PIANO,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> BUSINESS_GROOVE = ITEMS.register("business_groove" ,
            () -> new RecordItem(6, ModSounds.BUSINESS_GROOVE,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> CONGO_SQUARE = ITEMS.register("congo_square" ,
            () -> new RecordItem(6, ModSounds.CONGO_SQUARE,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> LADIES_NIGHT = ITEMS.register("ladies_night" ,
            () -> new RecordItem(6, ModSounds.LADIES_NIGHT,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> SALOON_PIANO = ITEMS.register("saloon_piano" ,
            () -> new RecordItem(6, ModSounds.SALOON_PIANO, new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> SEPERATION = ITEMS.register("seperation" ,
            () -> new RecordItem(6, ModSounds.SEPERATION,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> THE_PRELUDE = ITEMS.register("the_prelude" ,
            () -> new RecordItem(6, ModSounds.THE_PRELUDE,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> WHIMSICAL_MOOD = ITEMS.register("whimsical_mood" ,
            () -> new RecordItem(6, ModSounds.WHIMSICAL_MOOD,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> ADVENTURES_IN_THE_SEA = ITEMS.register("adventures_in_the_sea" ,
            () -> new RecordItem(6, ModSounds.ADVENTURES_IN_THE_SEA,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> ARISTOCRAT = ITEMS.register("aristocrat" ,
            () -> new RecordItem(6, ModSounds.ARISTOCRAT,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> BETRAYAL = ITEMS.register("betrayal" ,
            () -> new RecordItem(6, ModSounds.BETRAYAL,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> DREAMSCAPE_ODYSSEY = ITEMS.register("dreamscape_odyssey" ,
            () -> new RecordItem(6, ModSounds.DREAMSCAPE_ODYSSEY,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> EUROPE_TRAVEL = ITEMS.register("europe_travel" ,
            () -> new RecordItem(6, ModSounds.EUROPE_TRAVEL,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> MEDIEVAL_MUSIC = ITEMS.register("medieval_music" ,
            () -> new RecordItem(6, ModSounds.MEDIEVAL_MUSIC,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> RAGTIME_PIANO = ITEMS.register("ragtime_piano" ,
            () -> new RecordItem(6, ModSounds.RAGTIME_PIANO, new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> TRAVELED_FAR_AND_WIDE = ITEMS.register("traveled_far_and_wide" ,
            () -> new RecordItem(6, ModSounds.TRAVELED_FAR_AND_WIDE,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> VERDANT = ITEMS.register("verdant" ,
            () -> new RecordItem(6, ModSounds.VERDANT,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> WESTERN_IN_GROOVE = ITEMS.register("western_in_groove" ,
            () -> new RecordItem(6, ModSounds.WESTERN_IN_GROOVE,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> ACOUSTIC_GUITAR = ITEMS.register("acoustic_guitar" ,
            () -> new RecordItem(6, ModSounds.ACOUSTIC_GUITAR,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> ANTHEM_PIANO = ITEMS.register("anthem_piano" ,
            () -> new RecordItem(6, ModSounds.ANTHEM_PIANO,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> AVE_MARIA = ITEMS.register("ave_maria",
            () -> new RecordItem(6, ModSounds.AVE_MARIA,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> CRYSTAL_SOUL = ITEMS.register("crystal_soul" ,
            () -> new RecordItem(6, ModSounds.CRYSTAL_SOUL,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> CZERNY_ETUDE = ITEMS.register("czerny_etude" ,
            () -> new RecordItem(6, ModSounds.CZERNY_ETUDE,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> HOPEFUL_PIANO = ITEMS.register("hopeful_piano" ,
            () -> new RecordItem(6, ModSounds.HOPEFUL_PIANO,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> I_HAD_A_DREAM_ABOUT_YOU = ITEMS.register("i_had_a_dream_about_you" ,
            () -> new RecordItem(6, ModSounds.I_HAD_A_DREAM_ABOUT_YOU,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> JAZZ_PIANO = ITEMS.register("jazz_piano" ,
            () -> new RecordItem(6, ModSounds.JAZZ_PIANO, new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> PATH = ITEMS.register("path" ,
            () -> new RecordItem(6, ModSounds.PATH,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> SNOWDROPS = ITEMS.register("snowdrops" ,
            () -> new RecordItem(6, ModSounds.SNOWDROPS,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> WHIMSICAL_PAGANS = ITEMS.register("whimsical_pagans" ,
            () -> new RecordItem(6, ModSounds.WHIMSICAL_PAGANS,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> BACK_TO_DAWN_CITY = ITEMS.register("back_to_dawn_city" ,
            () -> new RecordItem(6, ModSounds.BACK_TO_DAWN_CITY,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> CHRISTMAS_CAROL = ITEMS.register("christmas_carol" ,
            () -> new RecordItem(6, ModSounds.CHRISTMAS_CAROL,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> DANCING_UNDER_STARS = ITEMS.register("dancing_under_stars",
            () -> new RecordItem(6, ModSounds.DANCING_UNDER_STARS,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> ENDLESS_HORIZONS = ITEMS.register("endless_horizons" ,
            () -> new RecordItem(6, ModSounds.ENDLESS_HORIZONS,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> IN_MY_ARMS = ITEMS.register("in_my_arms" ,
            () -> new RecordItem(6, ModSounds.IN_MY_ARMS,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> ISLAND_BREEZE = ITEMS.register("island_breeze" ,
            () -> new RecordItem(6, ModSounds.ISLAND_BREEZE,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> LOTUS_SKY = ITEMS.register("lotus_sky" ,
            () -> new RecordItem(6, ModSounds.LOTUS_SKY,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> LOVE_RUN = ITEMS.register("love_run" ,
            () -> new RecordItem(6, ModSounds.LOVE_RUN, new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> REACH_BEYOND = ITEMS.register("reach_beyond" ,
        () -> new RecordItem(6, ModSounds.REACH_BEYOND,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> RUN_AWAY_WITH_ME = ITEMS.register("run_away_with_me" ,
            () -> new RecordItem(6, ModSounds.RUN_AWAY_WITH_ME,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> SWEET_SERENADE = ITEMS.register("sweet_serenade" ,
            () -> new RecordItem(6, ModSounds.SWEET_SERENADE,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> SPECIAL_MASHUP = ITEMS.register("special_mashup" ,
            () -> new RecordItem(6, ModSounds.SPECIAL_MASHUP,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> ALIVE = ITEMS.register("alive" ,
            () -> new RecordItem(6, ModSounds.ALIVE,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> BAD_OMEN = ITEMS.register("bad_omen" ,
            () -> new RecordItem(6, ModSounds.BAD_OMEN,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> BELOW = ITEMS.register("below" ,
            () -> new RecordItem(6, ModSounds.BELOW,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> BONUS_LEVEL = ITEMS.register("bonus_level" ,
            () -> new RecordItem(6, ModSounds.BONUS_LEVEL, new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> BREEZE = ITEMS.register("breeze" ,
            () -> new RecordItem(6, ModSounds.BREEZE,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> BRUTE = ITEMS.register("brute" ,
            () -> new RecordItem(6, ModSounds.BRUTE,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> CASCADE = ITEMS.register("cascade" ,
            () -> new RecordItem(6, ModSounds.CASCADE,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> CELEBRATION = ITEMS.register("celebration" ,
            () -> new RecordItem(6, ModSounds.CELEBRATION,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> COMET = ITEMS.register("comet" ,
            () -> new RecordItem(6, ModSounds.COMET,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> FOREST = ITEMS.register("forest" ,
            () -> new RecordItem(6, ModSounds.FOREST,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> GILDED = ITEMS.register("gilded" ,
            () -> new RecordItem(6, ModSounds.GILDED,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> GLIDE = ITEMS.register("glide" ,
            () -> new RecordItem(6, ModSounds.GLIDE,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> GUARDIAN = ITEMS.register("guardian" ,
            () -> new RecordItem(6, ModSounds.GUARDIAN,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> HUSK = ITEMS.register("husk" ,
            () -> new RecordItem(6, ModSounds.HUSK, new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> LIGHTNING = ITEMS.register("lightning" ,
            () -> new RecordItem(6, ModSounds.LIGHTNING,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> LUMINOUS = ITEMS.register("luminous" ,
            () -> new RecordItem(6, ModSounds.LUMINOUS,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> MINESHAFT = ITEMS.register("mineshaft" ,
            () -> new RecordItem(6, ModSounds.MINESHAFT,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> NO_ESCAPE = ITEMS.register("no_escape" ,
            () -> new RecordItem(6, ModSounds.NO_ESCAPE,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> NORTHERN_LIGHTS = ITEMS.register("northern_lights" ,
            () -> new RecordItem(6, ModSounds.NORTHERN_LIGHTS,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> OCHRE = ITEMS.register("ochre",
            () -> new RecordItem(6, ModSounds.OCHRE,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> OVERTUNE = ITEMS.register("overtune" ,
            () -> new RecordItem(6, ModSounds.OVERTUNE,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> PUMPKIN = ITEMS.register("pumpkin" ,
            () -> new RecordItem(6, ModSounds.PUMPKIN,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> RAIDERS = ITEMS.register("raiders" ,
            () -> new RecordItem(6, ModSounds.RAIDERS,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> RIBBIT = ITEMS.register("ribbit" ,
            () -> new RecordItem(6, ModSounds.RIBBIT,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> SHRIEKER = ITEMS.register("shrieker" ,
            () -> new RecordItem(6, ModSounds.SHRIEKER, new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> SHRIEKER_X_BRUTE = ITEMS.register("shrieker_x_brute" ,
            () -> new RecordItem(6, ModSounds.SHRIEKER_X_BRUTE,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> SHULKER = ITEMS.register("shulker" ,
            () -> new RecordItem(6, ModSounds.SHULKER,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> SLEIGH = ITEMS.register("sleigh" ,
            () -> new RecordItem(6, ModSounds.SLEIGH,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> SNOWSTORM = ITEMS.register("snowstorm" ,
            () -> new RecordItem(6, ModSounds.SNOWSTORM,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> SOULLESS = ITEMS.register("soulless" ,
            () -> new RecordItem(6, ModSounds.SOULLESS,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> STRIDE = ITEMS.register("stride",
            () -> new RecordItem(6, ModSounds.STRIDE,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> THE_ENDER_DRAGON = ITEMS.register("the_ender_dragon" ,
            () -> new RecordItem(6, ModSounds.THE_ENDER_DRAGON,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> THE_WITHER = ITEMS.register("the_wither" ,
            () -> new RecordItem(6, ModSounds.THE_WITHER,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> TIME = ITEMS.register("time" ,
            () -> new RecordItem(6, ModSounds.TIME,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> THUNDER_STORM = ITEMS.register("thunder_storm" ,
            () -> new RecordItem(6, ModSounds.THUNDER_STORM,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> TUNDRA = ITEMS.register("tundra" ,
            () -> new RecordItem(6, ModSounds.TUNDRA, new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> UNDERSCORE = ITEMS.register("underscore" ,
            () -> new RecordItem(6, ModSounds.UNDERSCORE,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> VOYAGE = ITEMS.register("voyage" ,
            () -> new RecordItem(6, ModSounds.VOYAGE,
                    new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> WARDEN_RUN = ITEMS.register("warden_run" ,
            () -> new RecordItem(6, ModSounds.WARDEN_RUN,
                    new Item.Properties().stacksTo(1), 2440));







    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}