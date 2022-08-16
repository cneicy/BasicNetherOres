package cscot.basicnetherores.registries;
import cscot.basicnetherores.init.IngotInit;
import net.minecraftforge.oredict.OreDictionary;
import static cscot.basicnetherores.init.BlockInit.*;
import static cscot.basicnetherores.init.BlockOreInit.*;

public class OreDictionaryRegistry {

	public static void registerDictionaryOres() {
		OreDictionary.registerOre("oreCopper", ORE_NETHERCOPPER);
		OreDictionary.registerOre("oreEmerald", ORE_NETHEREMERALD);
		OreDictionary.registerOre("oreDiamond", ORE_NETHERDIAMOND);
		OreDictionary.registerOre("oreRedstone", ORE_NETHERREDSTONE);
		OreDictionary.registerOre("oreLapis", ORE_NETHERLAPIS);
		OreDictionary.registerOre("oreCoal", ORE_NETHERCOAL);
		OreDictionary.registerOre("oreIron", ORE_NETHERIRON);
		OreDictionary.registerOre("oreTin", ORE_NETHERTIN);
	}

	public static void registerDictionaryItems(){

		OreDictionary.registerOre("ingotCopper", IngotInit.INGOT_COPPER);
		OreDictionary.registerOre("ingotTin", IngotInit.INGOT_TIN);

		OreDictionary.registerOre("nuggetCopper", IngotInit.NUGGET_COPPER);
		OreDictionary.registerOre("nuggetTin", IngotInit.NUGGET_TIN);

	}

	public static void registerDictionaryBlocks(){
		OreDictionary.registerOre("blockCopper", BLOCK_COPPER);
		OreDictionary.registerOre("blockTin", BLOCK_TIN);
	}
}
