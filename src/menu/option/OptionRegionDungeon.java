package menu.option;

import base.*;
import menu.MenuFactory;

import java.util.ArrayList;

public class OptionRegionDungeon extends Option {
	public OptionRegionDungeon() {
		this.name = "dungeon";
		this.label = "Dungeon [Level mínimo: 5]";
	}

	public void execute() {
		if (Engine.hero.getLevel() >= 5) {
			ArrayList<Item> loot = new ArrayList<Item>();
			loot.add(new Item("Money", 0, "", 200));
			ArrayList<Enemy> inimigos = new ArrayList<Enemy>();
			inimigos.add(new Enemy("Esqueleto", "Morto-Vivo", new Attributes(5, 20, 10, 5, 2), 10, loot));
			inimigos.add(new Enemy("Aranha", "Animal Silvestre", new Attributes(1, 5, 5, 5, 5), 10, loot));

			Engine.currentRegion = new Region("Dungeon", 5, inimigos);
		} else {
			Engine.error = "Você não possui o nível mínimo para essa região";
		}
		MenuFactory menuFactory = new MenuFactory();
		Engine.currentMenu = menuFactory.getMenu("travel");

	}
}
