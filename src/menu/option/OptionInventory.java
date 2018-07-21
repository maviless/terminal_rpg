package menu.option;

import base.Engine;
import menu.MenuFactory;

public class OptionInventory extends Option{
	public OptionInventory() {
		this.name = "inventory";
		this.label = "Inventory";
	}

	public void execute() {
		MenuFactory menuFactory = new MenuFactory();
		Engine.currentMenu = menuFactory.getMenu("inventory");
	}
}
