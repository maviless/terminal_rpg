package menu;

import base.Engine;
import base.Item;
import menu.option.*;

public class MenuInventory extends MenuAbstract {
	public MenuInventory() {
		super();
		this.name = "inventory";
	}

	@Override
	public void display() {
		System.out.println("Seu inventário:");
		System.out.println("Money: " + Engine.hero.getMoney());
		if (Engine.hero.getItems().size() == 0)
			System.out.println("-");
		else
			for (Item a : Engine.hero.getItems())
				System.out.println("-" + a.getName());
	}

	public void initOptions() {
		OptionFactory optFactory = new OptionFactory();
		this.options.add(optFactory.getOption("backToStandardMenu"));
	}
}
