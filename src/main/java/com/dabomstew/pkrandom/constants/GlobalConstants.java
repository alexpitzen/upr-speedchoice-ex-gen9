package com.dabomstew.pkrandom.constants;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static java.util.Map.entry;

public class GlobalConstants {

    public static final List<Integer> bannedRandomMoves = Arrays.asList(
            144,   // Transform, glitched in RBY
            165  // Struggle, self explanatory
    );

    public static final List<Integer> bannedForDamagingMove = Arrays.asList(
            120, // SelfDestruct
            138, // Dream Eater
            153, // Explosion
            173, // Snore
            206, // False Swipe
            248, // Future Sight
            252, // Fake Out
            264, // Focus Punch
            353, // Doom Desire
            364, // Feint
            387, // Last Resort
            389, // Sucker Punch
            132, // Constrict, overly weak
            99,// Rage, lock-in in gen1
            205, // Rollout, lock-in
            301, // Ice Ball, Rollout clone
            39,// Sonicboom
            82,// Dragon Rage
            32,// Horn Drill
            12,// Guillotine
            90,// Fissure
            329, // Sheer Cold
            621, // Hyperspace Fury, fails is anything other than hoopa uses it
            711 // Aura Wheel, as it only works properly with morpeko
    );
    
    /* @formatter:on */

    public static final List<Integer> battleTrappingAbilities = Arrays.asList(23, 42, 71);
    // Shadow Tag, Magnet Pull, Arena Trap

    public static final List<Integer> negativeAbilities = Arrays.asList(129, 112, 54, 59, 161, 103);
    // Defeatist, Slow Start, Truant, Forecast, Zen Mode, Klutz
    // To test: Illusion, Imposter

    public static final List<Integer> restrictedAbilities = Arrays.asList(
        210, //battle bond
        209, //disguise
        59, //forecast
        241, //gulp missile
        258, //hunger switch
        248, //ice face
        121, //multitype
        211, //power construct
        225, //rks system
        208, //schooling
        197, //shields down
        176, //stance change
        307, //tera shift
        308, //tera shell
        309, //teraform zero
        161, //zen mode
        278 //zero to hero
    );

    // Maps pokemon number to move number
    public static final Map<Integer, Integer> monEvoRequiresMove = Map.ofEntries(
        // Ancient Power 	Tangela, Yanma, Piloswine 	Tangrowth, Yanmega, Mamoswine 	Generation IV
        entry(114, 246),
        entry(193, 246),
        entry(221, 246),
        // Barb Barrage 	Hisuian Qwilfish 	Overqwil 	Generation VIII
        entry(998, 767),
        // Double Hit 	Aipom 	Ambipom 	Generation IV
        entry(190, 458),
        // Dragon Cheer 	Dipplin 	Hydrapple 	Generation IX
        entry(1408,841),
        // Dragon Pulse 	Poipole 	Naganadel 	Generation VII
        entry(803,406),
        // Hyper Drill 	Dunsparce 	Dudunsparce 	Generation IX
        entry(206,813),
        // Mimic 	Bonsly, Mime Jr. 	Sudowoodo, Mr. Mime 	Generation IV
        entry(438,102),
        entry(439,102),
        // Psyshield Bash 	Stantler 	Wyrdeer 	Generation VIII
        entry(234,756),
        // Rage Fist 	Primeape 	Annihilape 	Generation IX
        entry(57,815),
        // Rollout 	Lickitung 	Lickilicky 	Generation IV
        entry(108,205),
        // Stomp 	Steenee 	Tsareena 	Generation VII
        entry(762,23),
        // Taunt 	Clobbopus 	Grapploct 	Generation VIII
        entry(852,269),
        // Twin Beam 	Girafarig 	Farigiraf 	Generation IX
        entry(203,814),
        // Any Fairy-type move 	Eevee 	Sylveon* 	Generation VI
        // recoil moves (just use wave crash) - basculin white stripe
        entry(1091,762)
    );

    public static final int WONDER_GUARD_INDEX = 25;

    public static final int MIN_DAMAGING_MOVE_POWER = 50;

    public static final int METRONOME_MOVE = 118;

    public static final int LEVEL_UP_MOVE_END = 0xFFFF;

}
