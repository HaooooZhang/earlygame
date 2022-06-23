package jayceecreates.earlygame.init;

import jayceecreates.earlygame.armor.BaseArmor;
import jayceecreates.earlygame.armor.CopperArmorBase;
import jayceecreates.earlygame.item.*;
import jayceecreates.earlygame.item.tool.base_tools.*;
import jayceecreates.earlygame.item.tool.flint_tier.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static jayceecreates.earlygame.init.BlocksInit.*;

public class ItemsInit {

    // plant
    public static final Item PLANT_FIBER = new Item(new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item LASHING = new Item(new Item.Settings().group(ModItemGroup.EARLYGAME));

    // tools
    public static final Item FIRE_STARTER = new FireStarterItem(new Item.Settings().maxDamage(64).group(ModItemGroup.EARLYGAME));
    public static final Item SLINGSHOT = new SlingshotItem(new Item.Settings().maxDamage(64).group(ModItemGroup.EARLYGAME));

    // rocks
    public static final Item STONE_ROCK = new BlockItem(BlocksInit.STONE_ROCK_BLOCK, new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item ANDESITE_STONE_ROCK = new BlockItem(BlocksInit.ANDESITE_ROCK_BLOCK, new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item DIORITE_STONE_ROCK = new BlockItem(BlocksInit.DIORITE_ROCK_BLOCK, new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item GRANITE_STONE_ROCK = new BlockItem(BlocksInit.GRANITE_ROCK_BLOCK, new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item DEEPSLATE_STONE_ROCK = new BlockItem(BlocksInit.DEEPSLATE_ROCK_BLOCK, new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item CALCITE_STONE_ROCK = new BlockItem(BlocksInit.CALCITE_ROCK_BLOCK, new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item TUFF_STONE_ROCK = new BlockItem(BlocksInit.TUFF_ROCK_BLOCK, new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item SANDSTONE_ROCK = new BlockItem(BlocksInit.SANDSTONE_ROCK_BLOCK, new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item RED_SANDSTONE_ROCK = new BlockItem(BlocksInit.RED_SANDSTONE_ROCK_BLOCK, new Item.Settings().group(ModItemGroup.EARLYGAME));

    // flint
    public static final Item FLINT_SHARD = new Item(new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item FLINT_KNIFE = new FlintKnife(new FlintToolBase(), new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item FLINT_PICKAXE = new FlintPickaxe(new FlintToolBase(), new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item FLINT_AXE = new FlintAxe(new FlintToolBase(), new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item FLINT_SAW = new FlintSaw(new FlintToolBase(), new Item.Settings().group(ModItemGroup.EARLYGAME));

    // copper
    public static final Item COPPER_NUGGET = new Item(new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final ArmorMaterial COPPER_ARMOR = new CopperArmorBase();
    public static final Item COPPER_SWORD = new SwordBase(new CopperToolBase(), new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item COPPER_KNIFE = new KnifeBase(new CopperToolBase(), new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item COPPER_SHOVEL = new ShovelBase(new CopperToolBase(), new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item COPPER_PICKAXE = new PickaxeBase(new CopperToolBase(), new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item COPPER_AXE = new AxeBase(new CopperToolBase(), new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item COPPER_SAW = new SawBase(new CopperToolBase(), new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item COPPER_HOE = new HoeBase(new CopperToolBase(), new Item.Settings().group(ModItemGroup.EARLYGAME));

    // iron
    public static final Item IRON_KNIFE = new KnifeBase(ToolMaterials.IRON, new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item IRON_SAW = new SawBase(ToolMaterials.IRON, new Item.Settings().group(ModItemGroup.EARLYGAME));

    // gold
    public static final Item GOLDEN_KNIFE = new KnifeBase(ToolMaterials.GOLD, new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item GOLDEN_SAW = new SawBase(ToolMaterials.GOLD, new Item.Settings().group(ModItemGroup.EARLYGAME));

    // diamond
    public static final Item DIAMOND_KNIFE = new KnifeBase(ToolMaterials.DIAMOND, new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item DIAMOND_SAW = new SawBase(ToolMaterials.DIAMOND, new Item.Settings().group(ModItemGroup.EARLYGAME));

    // netherite
    public static final Item NETHERITE_KNIFE = new KnifeBase(ToolMaterials.NETHERITE, new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item NETHERITE_SAW = new SawBase(ToolMaterials.NETHERITE, new Item.Settings().group(ModItemGroup.EARLYGAME));

    public static void init() {

        // rocks
        Registry.register(Registry.ITEM, new Identifier("earlygame", "stone_rock"), ItemsInit.STONE_ROCK);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "andesite_rock"), ItemsInit.ANDESITE_STONE_ROCK);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "diorite_rock"), ItemsInit.DIORITE_STONE_ROCK);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "granite_rock"), ItemsInit.GRANITE_STONE_ROCK);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "deepslate_rock"), ItemsInit.DEEPSLATE_STONE_ROCK);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "calcite_rock"), ItemsInit.CALCITE_STONE_ROCK);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "tuff_rock"), ItemsInit.TUFF_STONE_ROCK);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "sandstone_rock"), ItemsInit.SANDSTONE_ROCK);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "red_sandstone_rock"), ItemsInit.RED_SANDSTONE_ROCK);

        // cobblestone
        Registry.register(Registry.ITEM, new Identifier("earlygame", "cobbled_andesite"), new BlockItem(COBBLED_ANDESITE, new Item.Settings().group(ModItemGroup.EARLYGAME)));
        Registry.register(Registry.ITEM, new Identifier("earlygame", "cobbled_diorite"), new BlockItem(COBBLED_DIORITE, new Item.Settings().group(ModItemGroup.EARLYGAME)));
        Registry.register(Registry.ITEM, new Identifier("earlygame", "cobbled_granite"), new BlockItem(COBBLED_GRANITE, new Item.Settings().group(ModItemGroup.EARLYGAME)));
        Registry.register(Registry.ITEM, new Identifier("earlygame", "cobbled_calcite"), new BlockItem(COBBLED_CALCITE, new Item.Settings().group(ModItemGroup.EARLYGAME)));
        Registry.register(Registry.ITEM, new Identifier("earlygame", "cobbled_tuff"), new BlockItem(COBBLED_TUFF, new Item.Settings().group(ModItemGroup.EARLYGAME)));

        // plant
        Registry.register(Registry.ITEM, new Identifier("earlygame", "plant_fiber"), PLANT_FIBER);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "lashing"), LASHING);

        // fire starter
        Registry.register(Registry.ITEM, new Identifier("earlygame", "fire_starter"), FIRE_STARTER);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "slingshot"), SLINGSHOT);

        // flint
        Registry.register(Registry.ITEM, new Identifier("earlygame", "flint_shard"), FLINT_SHARD);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "flint_pickaxe"), FLINT_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "flint_axe"), FLINT_AXE);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "flint_knife"), FLINT_KNIFE);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "flint_saw"), FLINT_SAW);

        // copper
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_nugget"), COPPER_NUGGET);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_helmet"), new BaseArmor(COPPER_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(ModItemGroup.EARLYGAME)));
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_chestplate"), new BaseArmor(COPPER_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(ModItemGroup.EARLYGAME)));
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_leggings"), new BaseArmor(COPPER_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(ModItemGroup.EARLYGAME)));
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_boots"), new BaseArmor(COPPER_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(ModItemGroup.EARLYGAME)));
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_sword"), COPPER_SWORD);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_knife"), COPPER_KNIFE);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_shovel"), COPPER_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_pickaxe"), COPPER_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_axe"), COPPER_AXE);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_saw"), COPPER_SAW);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_hoe"), COPPER_HOE);

        // iron
        Registry.register(Registry.ITEM, new Identifier("earlygame", "iron_knife"), IRON_KNIFE);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "iron_saw"), IRON_SAW);

        // gold
        Registry.register(Registry.ITEM, new Identifier("earlygame", "golden_knife"), GOLDEN_KNIFE);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "golden_saw"), GOLDEN_SAW);

        // diamond
        Registry.register(Registry.ITEM, new Identifier("earlygame", "diamond_knife"), DIAMOND_KNIFE);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "diamond_saw"), DIAMOND_SAW);

        // netherite (prefix is dumb please replace it with ancient prefix)
        Registry.register(Registry.ITEM, new Identifier("earlygame", "netherite_knife"), NETHERITE_KNIFE);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "netherite_saw"), NETHERITE_SAW);

    }

    
}