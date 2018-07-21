package menu.option;

import base.Engine;
import menu.MenuFactory;

public class OptionContinue extends Option {
    public OptionContinue() {
        this.name = "continue";
        this.label = "Continue";
    }
    public void execute() {
    	Engine.hero.getAttributes().setActualStrenght(Engine.hero.getAttributes().getStrenght());
        MenuFactory menuFactory = new MenuFactory();
        Engine.currentMenu = menuFactory.getMenu("standard");
    }
}
