package com.duckblade.osrs.easyteleports;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup(EasyTeleportsConfig.CONFIG_GROUP)
public interface EasyTeleportsConfig extends Config
{

	String CONFIG_GROUP = "easypharaohsceptre";
	int POSITION_FLAGS = 100;
	int POSITION_PHARAOHS_SCEPTRE = POSITION_FLAGS + 100;
	int POSITION_KHAREDSTS_MEMOIRS = POSITION_PHARAOHS_SCEPTRE + 100;
	int POSITION_XERICS_TALISMAN = POSITION_KHAREDSTS_MEMOIRS + 100;
	int POSITION_RING_OF_DUELING = POSITION_XERICS_TALISMAN + 100;
	int POSITION_DIARY_CAPE = POSITION_RING_OF_DUELING + 100;
	int POSITION_SLAYER_RING = POSITION_DIARY_CAPE + 100;

	@ConfigSection(
		name = "Toggles",
		description = "Turn teleport replacements on or off for specific items.",
		position = POSITION_FLAGS
	)
	String SECTION_ENABLE_FLAGS = "enableFlags";

	@ConfigItem(
		section = SECTION_ENABLE_FLAGS,
		keyName = "enablePharaohSceptre",
		name = "Pharaoh's sceptre",
		description = "Replace teleport entries on the Pharaoh's sceptre with new names.",
		position = POSITION_FLAGS + (POSITION_PHARAOHS_SCEPTRE / 100)
	)
	default boolean enablePharaohSceptre()
	{
		return true;
	}

	@ConfigItem(
		section = SECTION_ENABLE_FLAGS,
		keyName = "enableXericsTalisman",
		name = "Xeric's talisman",
		description = "Replace teleport entries on the Xeric's talisman with new names.",
		position = POSITION_FLAGS + (POSITION_XERICS_TALISMAN / 100)
	)
	default boolean enableXericsTalisman()
	{
		return false;
	}

	@ConfigItem(
		section = SECTION_ENABLE_FLAGS,
		keyName = "enableKharedstsMemoirs",
		name = "Kharedst's memoirs",
		description = "Replace teleport entries on the Kharedst's memoirs / Book of the dead with new names.",
		position = POSITION_FLAGS + (POSITION_KHAREDSTS_MEMOIRS / 100)
	)
	default boolean enableKharedstsMemoirs()
	{
		return false;
	}

	@ConfigItem(
		section = SECTION_ENABLE_FLAGS,
		keyName = "enableRingOfDueling",
		name = "Ring of dueling",
		description = "Replace teleport entries on the Ring of Dueling with new names.",
		position = POSITION_FLAGS + (POSITION_RING_OF_DUELING / 100)
	)
	default boolean enableRingOfDueling()
	{
		return false;
	}

	@ConfigItem(
		section = SECTION_ENABLE_FLAGS,
		keyName = "enableDiaryCape",
		name = "Achievement diary cape",
		description = "Replace teleport entries on the Achievement diary cape with new names.",
		position = POSITION_FLAGS + (POSITION_DIARY_CAPE / 100)
	)
	default boolean enableDiaryCape()
	{
		return false;
	}

	@ConfigItem(
		section = SECTION_ENABLE_FLAGS,
		keyName = "enableSlayerRing",
		name = "Slayer ring",
		description = "Replace teleport entries on the Slayer ring with new names.",
		position = POSITION_FLAGS + (POSITION_SLAYER_RING / 100)
	)
	default boolean enableSlayerRing()
	{
		return false;
	}

	@ConfigSection(
		name = "Pharaoh's sceptre",
		description = "Replacement text for the Pharaoh's sceptre teleport locations.",
		position = POSITION_PHARAOHS_SCEPTRE,
		closedByDefault = true
	)
	String SECTION_PHARAOHS_SCEPTRE = "sectionCustomReplacements"; // legacy config name

	@ConfigItem(
		keyName = "replacementJalsavrah",
		name = "Jalsavrah",
		description = "Replace Jalsavrah",
		section = SECTION_PHARAOHS_SCEPTRE,
		position = POSITION_PHARAOHS_SCEPTRE + 1
	)
	default String replacementJalsavrah()
	{
		return "Pyramid Plunder";
	}

	@ConfigItem(
		keyName = "replacementJaleustrophos",
		name = "Jaleustrophos",
		description = "Replace Jaleustrophos",
		section = SECTION_PHARAOHS_SCEPTRE,
		position = POSITION_PHARAOHS_SCEPTRE + 2
	)
	default String replacementJaleustrophos()
	{
		return "Agility Pyramid";
	}

	@ConfigItem(
		keyName = "replacementJaldraocht",
		name = "Jaldraocht",
		description = "Replace Jaldraocht",
		section = SECTION_PHARAOHS_SCEPTRE,
		position = POSITION_PHARAOHS_SCEPTRE + 3
	)
	default String replacementJaldraocht()
	{
		return "Ancients Pyramid";
	}

	@ConfigItem(
		keyName = "replacementJaltevas",
		name = "Jaltevas",
		description = "Replace Jaltevas",
		section = SECTION_PHARAOHS_SCEPTRE,
		position = POSITION_PHARAOHS_SCEPTRE + 4
	)
	default String replacementJaltevas()
	{
		return "Necropolis";
	}

	@ConfigSection(
		name = "Kharedst's memoirs",
		description = "Replacement text for the Kharedst's memoirs teleport locations.",
		position = POSITION_KHAREDSTS_MEMOIRS,
		closedByDefault = true
	)
	String SECTION_KHAREDSTS_MEMOIRS = "sectionKharedstsMemoirs";

	@ConfigItem(
		keyName = "replacementLancalliums",
		name = "Lunch by the Lancalliums",
		description = "Replace Lunch by the Lancalliums",
		section = SECTION_KHAREDSTS_MEMOIRS,
		position = POSITION_KHAREDSTS_MEMOIRS + 1
	)
	default String replacementLancalliums()
	{
		return "<col=00ff00>Hosidius";
	}

	@ConfigItem(
		keyName = "replacementFishers",
		name = "The Fisher's Flute",
		description = "Replace The Fisher's Flute",
		section = SECTION_KHAREDSTS_MEMOIRS,
		position = POSITION_KHAREDSTS_MEMOIRS + 2
	)
	default String replacementFishers()
	{
		return "<col=00ffff>Port Piscarilius";
	}

	@ConfigItem(
		keyName = "replacementHistory",
		name = "History and Hearsay",
		description = "Replace History and Hearsay",
		section = SECTION_KHAREDSTS_MEMOIRS,
		position = POSITION_KHAREDSTS_MEMOIRS + 3
	)
	default String replacementHistory()
	{
		return "<col=ff0000>Shayzien";
	}

	@ConfigItem(
		keyName = "replacementJubilation",
		name = "Jewellery of Jubilation",
		description = "Replace Jewellery of Jubilation",
		section = SECTION_KHAREDSTS_MEMOIRS,
		position = POSITION_KHAREDSTS_MEMOIRS + 4
	)
	default String replacementJubilation()
	{
		return "<col=ff8800>Lovakengj";
	}

	@ConfigItem(
		keyName = "replacementDisposition",
		name = "A Dark Disposition",
		description = "Replace A Dark Disposition",
		section = SECTION_KHAREDSTS_MEMOIRS,
		position = POSITION_KHAREDSTS_MEMOIRS + 5
	)
	default String replacementDisposition()
	{
		return "<col=8800ff>Arceuus";
	}

	@ConfigSection(
		name = "Xeric's talisman",
		description = "Replacement text for the Xeric's talisman teleport locations.",
		position = POSITION_XERICS_TALISMAN,
		closedByDefault = true
	)
	String SECTION_XERICS_TALISMAN = "sectionXericsTalisman";

	@ConfigItem(
		keyName = "replacementLookout",
		name = "Xeric's Look-out",
		description = "Replace Xeric's Look-out",
		section = SECTION_XERICS_TALISMAN,
		position = POSITION_XERICS_TALISMAN + 1
	)
	default String replacementLookout()
	{
		return "Shayzien";
	}

	@ConfigItem(
		keyName = "replacementGlade",
		name = "Xeric's Glade",
		description = "Replace Xeric's Glade",
		section = SECTION_XERICS_TALISMAN,
		position = POSITION_XERICS_TALISMAN + 2
	)
	default String replacementGlade()
	{
		return "Hosidius";
	}

	@ConfigItem(
		keyName = "replacementInferno",
		name = "Xeric's Inferno",
		description = "Replace Xeric's Inferno",
		section = SECTION_XERICS_TALISMAN,
		position = POSITION_XERICS_TALISMAN + 3
	)
	default String replacementInferno()
	{
		return "Lovakengj";
	}

	@ConfigItem(
		keyName = "replacementHeart",
		name = "Xeric's Heart",
		description = "Replace Xeric's Heart",
		section = SECTION_XERICS_TALISMAN,
		position = POSITION_XERICS_TALISMAN + 4
	)
	default String replacementHeart()
	{
		return "Kourend Castle";
	}

	@ConfigItem(
		keyName = "replacementHonour",
		name = "Xeric's Honour",
		description = "Replace Xeric's Honour",
		section = SECTION_XERICS_TALISMAN,
		position = POSITION_XERICS_TALISMAN + 5
	)
	default String replacementHonour()
	{
		return "Chambers of Xeric";
	}

	@ConfigSection(
		name = "Ring of dueling",
		description = "Replacement text for the ring of dueling teleport locations.",
		position = POSITION_RING_OF_DUELING,
		closedByDefault = true
	)
	String SECTION_RING_OF_DUELING = "sectionRingOfDueling";

	@ConfigItem(
		keyName = "replacementPvPArena",
		name = "PvP Arena",
		description = "Replace PvP Arena",
		section = SECTION_RING_OF_DUELING,
		position = POSITION_RING_OF_DUELING + 1
	)
	default String replacementPvPArena()
	{
		return "Duel Arena";
	}

	@ConfigItem(
		keyName = "replacementCastleWars",
		name = "Castle Wars",
		description = "Replace Castle Wars",
		section = SECTION_RING_OF_DUELING,
		position = POSITION_RING_OF_DUELING + 2
	)
	default String replacementCastleWars()
	{
		return "Castle Wars";
	}

	@ConfigItem(
		keyName = "replacementFeroxEnclave",
		name = "Ferox Enclave",
		description = "Replace Ferox Enclave",
		section = SECTION_RING_OF_DUELING,
		position = POSITION_RING_OF_DUELING + 3
	)
	default String replacementFeroxEnclave()
	{
		return "Ferox Enclave";
	}

	@ConfigSection(
		name = "Achievement Diary Cape",
		description = "Replacement text for the Achievement diary cape teleport locations.",
		position = POSITION_DIARY_CAPE,
		closedByDefault = true
	)
	String SECTION_DIARY_CAPE = "sectionDiaryCape";

	@ConfigItem(
		keyName = "replacementArdougne",
		name = "Ardougne: Two-pints",
		description = "Replace Ardougne: Two-pints",
		section = SECTION_DIARY_CAPE,
		position = POSITION_DIARY_CAPE + 1
	)
	default String replacementArdougne()
	{
		return "Ardougne: Bar";
	}

	@ConfigItem(
		keyName = "replacementDesert",
		name = "Desert: Jarr",
		description = "Replace Desert: Jarr",
		section = SECTION_DIARY_CAPE,
		position = POSITION_DIARY_CAPE + 2
	)
	default String replacementDesert()
	{
		return "Desert: Shantay Pass";
	}

	@ConfigItem(
		keyName = "replacementFalador",
		name = "Falador: Sir Rebral",
		description = "Replace Falador: Sir Rebral",
		section = SECTION_DIARY_CAPE,
		position = POSITION_DIARY_CAPE + 3
	)
	default String replacementFalador()
	{
		return "Falador: Castle";
	}

	@ConfigItem(
		keyName = "replacementFremennik",
		name = "Fremennik: Thorodin",
		description = "Replace Fremennik: Thorodin",
		section = SECTION_DIARY_CAPE,
		position = POSITION_DIARY_CAPE + 4
	)
	default String replacementFremennik()
	{
		return "Fremennik: POH Portal";
	}

	@ConfigItem(
		keyName = "replacementKandarin",
		name = "Kandarin: Flax keeper",
		description = "Replace Kandarin: Flax keeper",
		section = SECTION_DIARY_CAPE,
		position = POSITION_DIARY_CAPE + 5
	)
	default String replacementKandarin()
	{
		return "Kandarin: Flax";
	}

	@ConfigItem(
		keyName = "replacementKaramjaJackie",
		name = "Karamja: Pirate Jackie the Fruit",
		description = "Replace Karamja: Pirate Jackie the Fruit",
		section = SECTION_DIARY_CAPE,
		position = POSITION_DIARY_CAPE + 6
	)
	default String replacementKaramjaJackie()
	{
		return "Karamja: Agility Arena";
	}

	@ConfigItem(
		keyName = "replacementKaramjaKaleb",
		name = "Karamja: Kaleb Paramaya (retired)",
		description = "Replace Karamja: Kaleb Paramaya (retired)",
		section = SECTION_DIARY_CAPE,
		position = POSITION_DIARY_CAPE + 7
	)
	default String replacementKaramjaKaleb()
	{
		return "Karamja: Shilo Village";
	}

	@ConfigItem(
		keyName = "replacementKaramjaForester",
		name = "Karamja: Jungle forester (retired)",
		description = "Replace Karamja: Jungle forester (retired)",
		section = SECTION_DIARY_CAPE,
		position = POSITION_DIARY_CAPE + 8
	)
	default String replacementKaramjaForester()
	{
		return "Karamja: Kharazi Jungle";
	}

	@ConfigItem(
		keyName = "replacementKaramjaTzhaar",
		name = "Karamja: TzHaar-Mej (retired)",
		description = "Replace Karamja: TzHaar-Mej (retired)",
		section = SECTION_DIARY_CAPE,
		position = POSITION_DIARY_CAPE + 9
	)
	default String replacementKaramjaTzhaar()
	{
		return "Karamja: Mor-Ul-Rek";
	}

	@ConfigItem(
		keyName = "replacementKourend",
		name = "Kourend & Kebos: Elise",
		description = "Replace Kourend & Kebos: Elise",
		section = SECTION_DIARY_CAPE,
		position = POSITION_DIARY_CAPE + 10
	)
	default String replacementKourend()
	{
		return "Kourend: Castle";
	}

	@ConfigItem(
		keyName = "replacementLumbridge",
		name = "Lumbridge & Draynor: Hatius Cosaintus",
		description = "Replace Lumbridge & Draynor: Hatius Cosaintus",
		section = SECTION_DIARY_CAPE,
		position = POSITION_DIARY_CAPE + 11
	)
	default String replacementLumbridge()
	{
		return "Lumbridge: Town Square";
	}

	@ConfigItem(
		keyName = "replacementMorytania",
		name = "Morytania: Le-sabrè",
		description = "Replace Morytania: Le-sabrè",
		section = SECTION_DIARY_CAPE,
		position = POSITION_DIARY_CAPE + 12
	)
	default String replacementMorytania()
	{
		return "Morytania: Canifis";
	}

	@ConfigItem(
		keyName = "replacementVarrock",
		name = "Varrock: Toby",
		description = "Replace Varrock: Toby",
		section = SECTION_DIARY_CAPE,
		position = POSITION_DIARY_CAPE + 13
	)
	default String replacementVarrock()
	{
		return "Varrock: Rooftops";
	}

	@ConfigItem(
		keyName = "replacementWilderness",
		name = "Wilderness: Lesser Fanatic",
		description = "Wilderness: Lesser Fanatic",
		section = SECTION_DIARY_CAPE,
		position = POSITION_DIARY_CAPE + 14
	)
	default String replacementWilderness()
	{
		return "Wilderness: Edgeville";
	}

	@ConfigItem(
		keyName = "replacementWestern",
		name = "Western Provinces: Elder Gnome Child",
		description = "Replace Western Provinces: Elder Gnome Child",
		section = SECTION_DIARY_CAPE,
		position = POSITION_DIARY_CAPE + 15
	)
	default String replacementWestern()
	{
		return "Western: Gnome Stronghold";
	}

	@ConfigItem(
		keyName = "replacementTwiggy",
		name = "Twiggy O'Korn",
		description = "Replace Twiggy O'Korn",
		section = SECTION_DIARY_CAPE,
		position = POSITION_DIARY_CAPE + 16
	)
	default String replacementTwiggy()
	{
		return "Diary Master: Draynor Village";
	}

	@ConfigSection(
		name = "Slayer ring",
		description = "Replacement text for the Slayer ring teleport locations.",
		position = POSITION_SLAYER_RING,
		closedByDefault = true
	)
	String SECTION_SLAYER_RING = "sectionSlayerRing";

	@ConfigItem(
		keyName = "replacementSlayerStronghold",
		name = "Stronghold Slayer Cave",
		description = "Replace Stronghold Slayer Cave",
		section = SECTION_SLAYER_RING,
		position = POSITION_SLAYER_RING + 1
	)
	default String replacementSlayerStronghold()
	{
		return "Gnome Stronghold Caves";
	}

	@ConfigItem(
		keyName = "replacementSlayerTower",
		name = "Morytania Slayer Tower",
		description = "Replace Morytania Slayer Tower",
		section = SECTION_SLAYER_RING,
		position = POSITION_SLAYER_RING + 2
	)
	default String replacementSlayerTower()
	{
		return "Slayer Tower";
	}

	@ConfigItem(
		keyName = "replacementSlayerRellekka",
		name = "Rellekka Slayer Caves",
		description = "Replace Rellekka Slayer Caves",
		section = SECTION_SLAYER_RING,
		position = POSITION_SLAYER_RING + 3
	)
	default String replacementSlayerRellekka()
	{
		return "Rellekka Caves";
	}

	@ConfigItem(
		keyName = "replacementTarns",
		name = "Tarn's Lair",
		description = "Replace Tarn's Lair",
		section = SECTION_SLAYER_RING,
		position = POSITION_SLAYER_RING + 4
	)
	default String replacementTarns()
	{
		return "Haunted Mine";
	}

	@ConfigItem(
		keyName = "replacementDarkBeasts",
		name = "Dark Beasts",
		description = "Replace Dark Beasts",
		section = SECTION_SLAYER_RING,
		position = POSITION_SLAYER_RING + 5
	)
	default String replacementDarkBeasts()
	{
		return "ME2 Caves";
	}
}