package jayceecreates.earlygame.item.tool;

import jayceecreates.earlygame.item.ModItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class FlintKnife extends SwordItem {

    public FlintKnife(ToolMaterial material) {
        super(material, 1, -1f, new Item.Settings().group(ModItemGroup.EARLYGAME));
    }
    
}