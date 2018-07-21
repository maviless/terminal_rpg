package menu.option;

import base.Engine;
import menu.MenuFactory;

public class OptionPotions extends Option{
    public OptionPotions() {
        this.name = "potions";
        this.label = "Potions";
    }
    public void execute() {
    	MenuFactory menuFactory = new MenuFactory();
    	Engine.currentMenu = menuFactory.getMenu("potions");
    }
}
