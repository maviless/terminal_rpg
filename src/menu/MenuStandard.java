package menu;

import base.Enemy;
import base.Engine;
import menu.option.*;

public class MenuStandard extends MenuAbstract {

	public MenuStandard() {
		super();
		this.name = "standard";
	}

	public void display() {
		String heroSkin = "   ,   A           {} \n" + "  / \\, | ,        .--. \n" + " |    =|= >      /.--.\\ \n"
				+ "  \\ /` | `       |====| \n" + "   `   |         |`::`|   \n"
				+ "       |     .-;`\\..../`;_.-^-._ \n" + "      /\\\\/  /  |...::..|`   :   `| \n"
				+ "      |:'\\ |   /'''::''|   .:.   | \n" + "       \\ /\\;-,/\\   ::  |..:::::..| \n"
				+ "       |\\ <` >  >._::_.| ':::::' | \n" + "       | `\"\"`  /   ^^  |   ':'   | \n"
				+ "       |       |       \\    :    / \n" + "       |       |        \\   :   /  \n"
				+ "       |       |___/\\___|`-.:.-` \n" + "       |        \\_ || _/    ` \n"
				+ "       |        <_ >< _> \n" + "       |        |  ||  | \n" + "       |        |  ||  | \n"
				+ "       |       _\\.:||:./_ \n" + "       |      /____/\\____\\ \n";

		System.out.println(heroSkin);
		System.out.println("Nome do Herói: " + Engine.hero.getName()+ "\nVocê está no nivel " + Engine.hero.getLevel());
		System.out.println("Experiencia: " + Engine.hero.getExperience() + "/" + Engine.hero.getExperienceToUp());
		System.out.println("Progresso: " + Engine.hero.getEnemiesDefeated() + "/" + OptionBoss.getMinMonstersDefeated());
		System.out.println("Você está em: " + Engine.currentRegion.getName() + "\n");
	}

	public void initOptions() {
		OptionFactory optFactory = new OptionFactory();
		this.options.add(optFactory.getOption("travel"));
		this.options.add(optFactory.getOption("search"));
		if (Engine.currentRegion.getName() == "Cidade")
			this.options.add(optFactory.getOption("goToMarket"));
		this.options.add(optFactory.getOption("inventory"));
		if (Engine.hero != null && Engine.hero.getEnemiesDefeated() >= OptionBoss.getMinMonstersDefeated())
			this.options.add(optFactory.getOption("boss"));
		this.options.add(optFactory.getOption("exit"));
	}

}
