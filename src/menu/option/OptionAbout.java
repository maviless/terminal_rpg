package menu.option;

import base.Engine;
import menu.MenuFactory;

public class OptionAbout extends Option{

    public OptionAbout() {
        this.name = "about";
        this.label = "About ";
    }
    public void execute() {
        MenuFactory menuFactory = new MenuFactory();
        Engine.currentMenu = menuFactory.getMenu("about");
    }
}
