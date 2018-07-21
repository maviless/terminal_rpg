package menu.option;

import base.Battle;
import base.Engine;
import base.Potion;

public class OptionUsePotion3 extends Option{
    public OptionUsePotion3() {
        this.name = "usePotion3";
        this.label = "Recupera muita vida";
    }
    public void execute() {
      if(Engine.hero.allPotions()[2] == 0){
			Engine.error = "Voc� n�o possui essa po��o!";
      } else{
    	  Battle.usePotion(Potion.MUIVIDA);
      }
    }
}
