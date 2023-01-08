package arm;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.Item;
import mindustry.type.ItemStack;
import mindustry.world.Block;
public class testNewItem {

    public static Block iHateMyLife;

    public static void load() {
        iHateMyLife = new Block("grass-water") {{
            requirements(Category.defense, with(Items.copper, 1));
            health = 2;
            size = 1;
        }

        private ItemStack[] with(Item copper, int i) {
            return null;
        }};
    }
}; 