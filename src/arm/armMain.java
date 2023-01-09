package arm;

import arm.content.testNewItem;
import mindustry.mod.Mod;

public class armMain extends Mod{
    public armMain(){
    }

    @Override
    public void loadContent(){
        testNewItem.load();
    }
}
