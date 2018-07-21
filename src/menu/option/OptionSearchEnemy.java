package menu.option;

import base.Engine;
import menu.MenuFactory;
import java.util.Random;

public class OptionSearchEnemy extends Option {
	public OptionSearchEnemy() {
		this.name = "search";
		this.label = "Search enemies";
	}

	public void execute() {
		MenuFactory menuFactory = new MenuFactory();
		try {
			Random rand = new Random();
			int  n = rand.nextInt(Engine.currentRegion.getEnemies().size());
			Engine.currentEnemy = Engine.currentRegion.getEnemies().get(n);
			Engine.currentMenu = menuFactory.getMenu("battle");
		} catch(Exception NullPoiterException) {
			Engine.error = "A região está segura, não há inimigos";
			Engine.currentMenu = menuFactory.getMenu("standard");
		}
	}
}
