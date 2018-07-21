package menu.option;

import base.*;
import menu.MenuFactory;

import java.util.ArrayList;

public class OptionRegionMountain extends Option {
	public OptionRegionMountain() {
		this.name = "mountain";
		this.label = "Mountain [Level mínimo: 15]";
	}

	public void execute() {
		if (Engine.hero.getLevel() >= 15) {
			ArrayList<Item> loot = new ArrayList<Item>();
			loot.add(new Item("Money", 0, "", 200));
			ArrayList<Enemy> inimigos = new ArrayList<Enemy>();
			inimigos.add(new Enemy("Dragão", "Criatura mitológica", new Attributes(20, 50, 1, 10, 15), 10,
					loot));

			Engine.currentRegion = new Region("Montanha", 15, inimigos);
		} else {
			Engine.error = "Você não possui o nível mínimo para essa região";
		}
		MenuFactory menuFactory = new MenuFactory();
		Engine.currentMenu = menuFactory.getMenu("travel");

	}
}
