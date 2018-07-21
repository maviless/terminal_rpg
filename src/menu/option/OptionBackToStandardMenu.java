package menu.option;

import base.Engine;
import menu.MenuFactory;

public class OptionBackToStandardMenu extends Option {

    public OptionBackToStandardMenu() {
        this.name = "backToStandardMenu";
        this.label = "Back";
    }
    public void execute() {
        MenuFactory menuFactory = new MenuFactory();
        Engine.currentMenu = menuFactory.getMenu("standard");
    }
}
