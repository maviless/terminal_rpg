package menu.option;

import base.Engine;
import menu.MenuFactory;

public class OptionBackToStartMenu extends Option {
    public OptionBackToStartMenu() {
        this.name = "backToStartMenu";
        this.label = "Voltar para o menu anterior";
    }
    public void execute() {
        MenuFactory menuFactory = new MenuFactory();
        Engine.currentMenu = menuFactory.getMenu("start");
    }
}
