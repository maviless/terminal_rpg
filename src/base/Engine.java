package base;
import java.util.Scanner;
import menu.MenuAbstract;
import menu.MenuFactory;

public class Engine {

    public static Hero hero;

    public static Enemy currentEnemy;

    public static MenuAbstract currentMenu;
    
    public static Region currentRegion = new Region("Cidade", 0, null);
    
    public static String error = new String();

    static Engine engine;

    public static boolean isGameOver() {
        return false;
    }

    public void displayMenu() {
    	currentMenu.display();
        for (int i = 0; i < currentMenu.options.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + currentMenu.options.get(i).label);
        }
    }

    private void start() {
        System.out.println("##### Terminal RPG #####");
        System.out.println();
	}

    private void about() {
        System.out.println("Feito com amor");
    }

    private void sair() {
        System.out.println("Muito obrigado por jogar conosco :D");
        System.exit(1);
    }

	public static void main(String[] args) {
        System.out.println("\u001B[34m");
        System.out.println("____________ _____   _____                   _             _");
        System.out.println("| ___ \\ ___ \\  __ \\ |_   _|                 (_)           | |");
        System.out.println("| |_/ / |_/ / |  \\/   | | ___ _ __ _ __ ___  _ _ __   __ _| |");
        System.out.println("|    /|  __/| | __    | |/ _ \\ '__| '_ ` _ \\| | '_ \\ / _` | |");
        System.out.println("| |\\ \\| |   | |_\\ \\   | |  __/ |  | | | | | | | | | | (_| | |");
        System.out.println("\\_| \\_\\_|    \\____/   \\_/\\___|_|  |_| |_| |_|_|_| |_|\\__,_|_|");
        System.out.println("\u001B[0m");

        Scanner scanner = new Scanner(System.in);
	    Engine engine = new Engine();
	    Engine.engine = engine;

	    MenuFactory menuManager = new MenuFactory();
	    Engine.currentMenu = menuManager.getMenu("start");

		while (!Engine.isGameOver()) {
			System.out.println(engine.error);
			System.out.println();
			engine.displayMenu();
			engine.error = "";
		    Engine.currentMenu.choose(scanner.nextInt());
			for (int i = 0; i < 100; i++)
				System.out.println();
		    System.out.println("");

		}

    }
}
