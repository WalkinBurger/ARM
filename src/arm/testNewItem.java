package arm;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
public class testNewItem {

    public static Block iHateMyLife;

    public static void load() {
        iHateMyLife = new Block("grass-water") {{
            requirements(Category.defense, ItemStack.with(Items.copper, 1), true);
            health = 2;
            size = 1;
        }};
    };
}; 