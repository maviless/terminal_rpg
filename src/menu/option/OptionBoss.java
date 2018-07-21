package menu.option;

import base.Attributes;
import base.Enemy;
import base.Engine;
import menu.MenuFactory;

public class OptionBoss extends Option{
    private static int minMonstersDefeated = 6;

    public OptionBoss() {
        this.name = "boss";
        this.label = "ENFRENTAR O BOSS";
    }

    public static int getMinMonstersDefeated() {
        return minMonstersDefeated;
    }

    public void execute() {
    	Engine.currentEnemy = new Enemy("boss", "O medo de todo aluno de 302", new Attributes(10, 5, 5, 5, 20), 10, null);
        MenuFactory menuFactory = new MenuFactory();
        Engine.currentMenu = menuFactory.getMenu("battle");
    }
}
