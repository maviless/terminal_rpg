package menu.option;

import base.Engine;
import menu.MenuFactory;

public class OptionBackToBattle extends Option {
	public OptionBackToBattle() {
		this.name = "backToBattle";
		this.label = "Voltar para a batalha";
	}

	public void execute() {
		MenuFactory menuFactory = new MenuFactory();
		Engine.currentMenu = menuFactory.getMenu("battle");
	}
}
