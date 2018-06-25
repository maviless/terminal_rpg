package com.samuere.menu;

import com.samuere.Engine;
import com.samuere.Item;
import com.samuere.menu.option.OptionFactory;

public class MenuLoose extends MenuAbstract{
	public MenuLoose() {
		super();
		this.name = "loose";
	}

	public void display() {
		System.out.println("Você foi derrotado pelo " + Engine.currentEnemy.getName());
        System.out.print("\u001B[31m");
        System.out.println("                   *              )               (");
        System.out.println(" (        (      (  `          ( /(               )\\ )  ");
        System.out.println(" )\\ )     )\\     )\\))(   (     )\\()) (   (   (   (()/(  ");
        System.out.println("(()/(  ((((_)(  ((_)()\\  )\\   ((_)\\  )\\  )\\  )\\   /(_)) ");
        System.out.println(" /(_))_ )\\ _ )\\ (_()((_)((_)    ((_)((_)((_)((_) (_))   ");
        System.out.println("(_)) __|(_)_\\(_)|  \\/  || __|  / _ \\\\ \\ / / | __|| _ \\  ");
        System.out.println("  | (_ | / _ \\  | |\\/| || _|  | (_) |\\ V /  | _| |   /  ");
        System.out.println("   \\___|/_/ \\_\\ |_|  |_||___|  \\___/  \\_/   |___||_|_\\  ");

        System.out.println();

        System.out.println("Muito Obrigado por jogar essa maravilha de jogo");
        System.exit(1);
	}

	public void initOptions() {
		
	}
}
