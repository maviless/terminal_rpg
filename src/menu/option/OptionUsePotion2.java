package menu.option;

import base.Battle;
import base.Engine;
import base.Potion;

public class OptionUsePotion2 extends Option{
    public OptionUsePotion2() {
        this.name = "usePotion2";
        this.label = "Recupera m�dia vida";
    }
    public void execute() {
      if(Engine.hero.allPotions()[1] == 0){
			Engine.error = "Voc� n�o possui essa po��o!";
      } else {
    	  Battle.usePotion(Potion.MEVIDA);
      }
    }
}
