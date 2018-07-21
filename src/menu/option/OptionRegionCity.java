package menu.option;

import base.Engine;
import base.Region;
import menu.MenuFactory;

public class OptionRegionCity extends Option{
	public OptionRegionCity() {
		this.name = "city";
		this.label = "City";
	}

	public void execute() {
		Engine.currentRegion = new Region("Cidade", 0, null);
		MenuFactory menuFactory = new MenuFactory();
		Engine.currentMenu = menuFactory.getMenu("standard");
	}
}
