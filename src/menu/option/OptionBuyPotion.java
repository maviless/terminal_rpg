package menu.option;

import base.Engine;
import base.Potion;
import java.util.ArrayList;
import java.util.Scanner;

public class OptionBuyPotion extends Option {
	public OptionBuyPotion() {
		this.name = "buyPotion";
		this.label = "Comprar poções";
	}

	public void execute() {
		for (int i = 0; i < 100; i++)
			System.out.println();
		ArrayList<Potion> potions = new ArrayList<Potion>();
		for (int i = 1; i < 5; i++) {
			if (i != 4)
				potions.add(
						new Potion("Poções do tipo " + i, (int) Math.ceil((i * 0.25 * Engine.hero.getAttributes().getMaxHealth())),
								"Lala", i * 5, i - 1));
			else
				potions.add(new Potion("Poções do tipo " + i, (int) Math.ceil((0.1 * Engine.hero.getAttributes().getStrenght())), "Lala",
						i * 5, i - 1));
		}
		System.out.printf(".---.  .-.   .-.    _\n" + "|~~~| .'~`. .' `. .'~`.\n" + "| 1 | | 2 | | 3 | : 4 :\n"
				+ "|___| |___| `._.' :___:\n" + "  ");
		for (int x : Engine.hero.allPotions())
			System.out.printf("%d     ", x);
		System.out.printf(
				"\n[1] Recupera 0.25 da vida - Preço: %d\n[2] Recupera 0.50 da vida - Preço: %d\n[3] Recupera 0.75 da vida - Preço: %d\n[4] Aumenta forca em 0.10 durante a batalha - Preço: %d",
				potions.get(0).getPrice(), potions.get(1).getPrice(), potions.get(2).getPrice(),
				potions.get(3).getPrice());
		System.out.println("\nDigite o tipo da poções desejada: ");
		Scanner input = new Scanner(System.in);
		int tipo = input.nextInt();
		System.out.println("Digite a quantidade de poções desejadas: ");
		int quantidade = input.nextInt();

		try{
			Potion p = potions.get(tipo - 1);
			if ((quantidade * p.getPrice()) > Engine.hero.getMoney())
				Engine.error = "Você não possui dinheiro sulficiente!";
			else {
				for (int i = 0; i < quantidade; i++) {
					Engine.hero.addItem(p);
				}
				int troco = Engine.hero.getMoney() - quantidade * p.getPrice();
				Engine.hero.setMoney(troco);
				System.out.println("Você comprou " + quantidade + " poções do tipo " + tipo + "!");
			}
		} catch(Exception IndexOutOfBoundsException) {
			Engine.error = "Essa poção não existe";
		}
	}
}
