package menu.option;

import base.Battle;
import base.Engine;
import menu.MenuFactory;

public class OptionAttack extends Option {
	public OptionAttack() {
		this.name = "attack";
		this.label = "Attack";
	}

	public void execute() {
		System.out.println("Atacou");
		Battle.attack(Engine.hero, Engine.currentEnemy);
		Battle.attack(Engine.currentEnemy, Engine.hero);
		if (!(Engine.currentEnemy.getAttributes().getActualHealth() > 0)) {
			if (Engine.currentEnemy.getName() == "boss") {
				MenuFactory menuFactory = new MenuFactory();
				Engine.currentMenu = menuFactory.getMenu("about");
			} else {
				Engine.currentRegion.removeEnemy(Engine.currentEnemy);
				Engine.hero.addEnemyDefeated();
				MenuFactory menuFactory = new MenuFactory();
				Engine.currentMenu = menuFactory.getMenu("win");
			}
		}
		if (Engine.hero.getAttributes().getActualHealth() <= 0) {
			MenuFactory menuFactory = new MenuFactory();
			Engine.currentMenu = menuFactory.getMenu("lose");
		}
	}
}
