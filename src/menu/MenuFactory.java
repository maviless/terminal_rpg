package menu;

import java.util.ArrayList;

public class MenuFactory {

    ArrayList<MenuAbstract> menus = new ArrayList<MenuAbstract>();

    public MenuFactory() {
       MenuStart menuStart = new MenuStart();
       menus.add(menuStart);

       MenuAbout menuAbout = new MenuAbout();
       menus.add(menuAbout);

       MenuStandard menuStandard = new MenuStandard();
       menus.add(menuStandard);

       MenuMarket menuMarket = new MenuMarket();
       menus.add(menuMarket);

       MenuTravel menuTravel = new MenuTravel();
       menus.add(menuTravel);
       
       MenuInventory menuInventary = new MenuInventory();
       menus.add(menuInventary);

       MenuBattle menuBattle = new MenuBattle();
       menus.add(menuBattle);

       MenuPotions menuPotions = new MenuPotions();
       menus.add(menuPotions);
       
       MenuWin menuWin = new MenuWin();
       menus.add(menuWin);
       
       MenuLose menuLoose = new MenuLose();
       menus.add(menuLoose);

       MenuCharacterCreation menuCharacterCreation = new MenuCharacterCreation();
       menus.add(menuCharacterCreation);
    }

    public MenuAbstract getMenu(String menuName) {
        for (MenuAbstract m : menus) {
            if (menuName.equals(m.name)){
                return m;
            }
        }
        return null;
    }
}
