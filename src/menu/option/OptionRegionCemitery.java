package menu.option;

import base.*;
import menu.MenuFactory;
import java.util.ArrayList;


public class OptionRegionCemitery extends Option {
	public OptionRegionCemitery() {
		this.name = "cemitery";
		this.label = "Cemitery [Level mínimo: 0]";
	}

	public void execute() {
		if (Engine.hero.getLevel() >= 0) {
			ArrayList<Item> loot = new ArrayList<Item>();
			loot.add(new Item("Money", 0, "", 200));
			ArrayList<Enemy> inimigos = new ArrayList<Enemy>();
			inimigos.add(new Enemy("Esqueleto", "Morto-Vivo", new Attributes(5, 20, 10, 5, 2), 10, loot));

			Engine.currentRegion = new Region("Cemitério", 0, inimigos);
		} else {
			Engine.error = "Você não possui o nível mínimo para essa região";
		}
		MenuFactory menuFactory = new MenuFactory();
		Engine.currentMenu = menuFactory.getMenu("travel");

	}
}
