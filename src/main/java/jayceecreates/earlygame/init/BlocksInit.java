package jayceecreates.earlygame.init;

import jayceecreates.earlygame.block.*;
import jayceecreates.earlygame.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlocksInit {
    
    // rocks
    public static final Block STONE_ROCK_BLOCK = new RockBlock();
    public static final Block ANDESITE_ROCK_BLOCK = new RockBlock();
    public static final Block DIORITE_ROCK_BLOCK = new RockBlock();
    public static final Block GRANITE_ROCK_BLOCK = new RockBlock();
    public static final Block SANDSTONE_ROCK_BLOCK = new RockBlock();
    public static final Block RED_SANDSTONE_ROCK_BLOCK = new RockBlock();
    
    // cobblestone
    public static final Block COBBLED_ANDESITE = new Cobblestone();
    public static final Block COBBLED_DIORITE = new Cobblestone();
    public static final Block COBBLED_GRANITE = new Cobblestone();

    // copper
    public static final Block COPPER_ORE = new CopperOre();
    public static final Block COPPER_BLOCK = new CopperBlock();

    // stick
    public static final Block STICK_TWIG_BLOCK = new StickTwigBlock();

    public static void init() {

        // rocks
        Registry.register(Registry.ITEM, new Identifier("earlygame", "stone_rock"), ItemsInit.STONE_ROCK);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "andesite_rock"), ItemsInit.ANDESITE_STONE_ROCK);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "diorite_rock"), ItemsInit.DIORITE_STONE_ROCK);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "granite_rock"), ItemsInit.GRANITE_STONE_ROCK);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "sandstone_rock"), ItemsInit.SANDSTONE_ROCK);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "red_sandstone_rock"), ItemsInit.RED_SANDSTONE_ROCK);
        Registry.register(Registry.BLOCK, new Identifier("earlygame", "stone_rock_block"), STONE_ROCK_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("earlygame", "andesite_rock_block"), ANDESITE_ROCK_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("earlygame", "diorite_rock_block"), DIORITE_ROCK_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("earlygame", "granite_rock_block"), GRANITE_ROCK_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("earlygame", "sandstone_rock_block"), SANDSTONE_ROCK_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("earlygame", "red_sandstone_rock_block"), RED_SANDSTONE_ROCK_BLOCK);

        // cobblestone
        Registry.register(Registry.ITEM, new Identifier("earlygame", "cobbled_andesite"), new BlockItem(COBBLED_ANDESITE, new Item.Settings().group(ModItemGroup.EARLYGAME)));
        Registry.register(Registry.ITEM, new Identifier("earlygame", "cobbled_diorite"), new BlockItem(COBBLED_DIORITE, new Item.Settings().group(ModItemGroup.EARLYGAME)));
        Registry.register(Registry.ITEM, new Identifier("earlygame", "cobbled_granite"), new BlockItem(COBBLED_GRANITE, new Item.Settings().group(ModItemGroup.EARLYGAME)));
        Registry.register(Registry.BLOCK, new Identifier("earlygame", "cobbled_andesite"), COBBLED_ANDESITE);
        Registry.register(Registry.BLOCK, new Identifier("earlygame", "cobbled_diorite"), COBBLED_DIORITE);
        Registry.register(Registry.BLOCK, new Identifier("earlygame", "cobbled_granite"), COBBLED_GRANITE);

        // copper
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_ore"), new BlockItem(COPPER_ORE, new Item.Settings().group(ModItemGroup.EARLYGAME)));
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_block"), new BlockItem(COPPER_BLOCK, new Item.Settings().group(ModItemGroup.EARLYGAME)));
        Registry.register(Registry.BLOCK, new Identifier("earlygame", "copper_ore"), COPPER_ORE);
        Registry.register(Registry.BLOCK, new Identifier("earlygame", "copper_block"), COPPER_BLOCK);
        
        // stick
        Registry.register(Registry.BLOCK, new Identifier("earlygame", "stick_twig"), STICK_TWIG_BLOCK);
    }

    
}