package arm;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;
public class testNewItem {

    public static Block iHateMyLife;

    public static void load() {
        iHateMyLife = new Wall("iHateMyLife") {{
            requirements(Category.defense, ItemStack.with(Items.copper, 1), true);
            health = 2;
            size = 1;
        }};
    };
}; 