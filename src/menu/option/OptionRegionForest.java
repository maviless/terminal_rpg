package menu.option;

import base.*;
import menu.MenuFactory;
import java.util.ArrayList;

public class OptionRegionForest extends Option {
	public OptionRegionForest() {
		this.name = "forest";
		this.label = "Forest [Level mínimo: 10]";
	}

	public void execute() {
		if (Engine.hero.getLevel() >= 10) {
			ArrayList<Item> loot = new ArrayList<Item>();
			loot.add(new Item("Money", 0, "", 200));
			ArrayList<Enemy> inimigos = new ArrayList<Enemy>();
			inimigos.add(new Enemy("Goblin", "Criatura Orc", new Attributes(10, 30, 5, 1, 30), 10, loot));
			inimigos.add(new Enemy("Lobo", "Animal Silvestre", new Attributes(3, 5, 1, 1, 2), 10, loot));

			Engine.currentRegion = new Region("Floresta", 10, inimigos);
		} else {
			Engine.error = "Você não possui o nível mínimo para essa região";
		}
		MenuFactory menuFactory = new MenuFactory();
		Engine.currentMenu = menuFactory.getMenu("travel");

	}
}
