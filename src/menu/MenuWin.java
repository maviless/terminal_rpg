package menu;
import base.Engine;
import base.Item;
import menu.option.*;


public class MenuWin extends MenuAbstract {
	public MenuWin() {
		super();
		this.name = "win";
	}

	public void display() {
		System.out.print("Derrotar " + Engine.currentEnemy.getName() + " te concedeu "
				+ Engine.currentEnemy.getExperience() + " pontos de experiencia");
		if (Engine.currentEnemy.getLoot() != null) {
		if(Engine.currentEnemy.getLoot().size() == 0)
			System.out.println();
		else
			System.out.println(" e:");
		for (Item a : Engine.currentEnemy.getLoot()) {
			System.out.println(a.getName() + " [" + a.getPrice() + " dinheiros]");
			if (a.getName() == "Money")
				Engine.hero.setMoney(Engine.hero.getMoney() + a.getPrice());
			else
				Engine.hero.addItem(a);
		}
		}
		Engine.hero.upExperience(Engine.currentEnemy.getExperience());
	}

	public void initOptions() {
		OptionFactory optFactory = new OptionFactory();
		this.options.add(optFactory.getOption("continue"));
	}
}
