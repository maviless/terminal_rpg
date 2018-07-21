package base;

import java.util.ArrayList;

public class Enemy extends Persona {

	private ArrayList<Item> loot = new ArrayList<Item>();
	
	public Enemy(String name, String description, Attributes attributes, int experience, ArrayList<Item> loot) {
		super(name, description, attributes, experience);
		this.loot = loot;
	}
	
	public ArrayList<Item> getLoot(){
		return loot;
	}

	public String getSkin(){
		String skin = "";

		if (this.getName().equalsIgnoreCase("goblin")){
			skin =  "             ,      , \n"+
					"            /(.-\"\"-.)\\ \n"+
					"        |\\  \\/      \\/  /| \n" +
					"        | \\ / =.  .= \\ / |     Eu sou o globin demoro, demoro mais abalo  \n" +
					"        \\( \\   o\\/o   / )/    Humildemente tocando o terror.\n" +
					"         \\_, '-/  \\-' ,_/   Sou o Demo Demorô, demorou mais abalou \n" +
					"           /   \\__/   \\ Sou vida louca, sangue bom do bagunca \n" +
					"           \\ \\__/\\__/ / Tenho até comunidade no Orkut\n" +
					"         ___\\ \\|--|/ /___ \n" +
					"       /`    \\      /    `\\ \n" +
					"      /       \'----\'       \\ \n";

		}else if (this.getName().equalsIgnoreCase("dragão")){					
			skin = "\n" + 
					"                                                 /===-_---~~~~~~~~~------____\n" + 
					"                                                |===-~___                _,-'\n" + 
					"                 -==\\\\                         `//~\\\\   ~~~~`---.___.-~~\n" + 
					"             ______-==|                         | |  \\\\           _-~`\n" + 
					"       __--~~~  ,-/-==\\\\                        | |   `\\        ,'\n" + 
					"    _-~       /'    |  \\\\                      / /      \\      /\n" + 
					"  .'        /       |   \\\\                   /' /        \\   /'		Depois que o expulsaram do senhor dos aneis,\n" + 
					" /  ____  /         |    \\`\\.__/-~~ ~ \\ _ _/'  /          \\/'		Ele jurou viganca...\n" + 
					"/-'~    ~~~~~---__  |     ~-/~         ( )   /'        _--~`			O pior dragao de todos,\n" + 
					"                  \\_|      /        _)   ;  ),   __--~~\n" + 
					"                    '~~--_/      _-~/-  / \\   '-~ \\\n" + 
					"                   {\\__--_/}    / \\\\_>- )<__\\      \\				(Exceto por sua sogra)\n" + 
					"                   /'   (_/  _-~  | |__>--<__|      | \n" + 
					"                  |0  0 _/) )-~     | |__>--<__|      |\n" + 
					"                  / /~ ,_/       / /__>---<__/      |  \n" + 
					"                 o o _//        /-~_>---<__-~      /\n" + 
					"                 (^(~          /~_>---<__-      _-~              \n" + 
					"                ,/|           /__>--<__/     _-~                 \n" + 
					"             ,//('(          |__>--<__|     /                  .----_ \n" + 
					"            ( ( '))          |__>--<__|    |                 /' _---_~\\\n" + 
					"         `-)) )) (           |__>--<__|    |               /'  /     ~\\`\\\n" + 
					"        ,/,'//( (             \\__>--<__\\    \\            /'  //        ||\n" + 
					"      ,( ( ((, ))              ~-__>--<_~-_  ~--____---~' _/'/        /'\n" + 
					"    `~/  )` ) ,/|                 ~-_~>--<_/-__       __-~ _/ \n" + 
					"  ._-~//( )/ )) `                    ~~-'_/_/ /~~~~~~~__--~ \n" + 
					"   ;'( ')/ ,)(                              ~~~~~~~~~~ \n" + 
					"  ' ') '( (/\n" + 
					"    '   '  `   \n" + 
					"";


		}else if(this.getName().equalsIgnoreCase("lobo")){

			skin =  "*     *    *     /\\__/\\  *    ---    * \n"+
					"   *            /      \\    /     \\    \n"+
					"        *   *  |  -  -  |  |       |*   Desde os tempos mais primordios, existe \n"+
					" *   __________| \\     /|  |       |   uma duvida, uma pergunta sem reposta. \n"+
					"   /              \\ T / |   \\     /    \n"+
					" /                      |  *  ---  Voce finalmente encontrara a resposta, \n"+
					"|  ||     |    |       /             * Mas ficara vivo tempo suficiente para saber\n"+
					"|  ||    /______\\     / |*     * WHAT DOES THE FLOG SAY?!?\n"+
					"|  | \\  |  /     \\   /  |  Ring-ding-ding-ding-dingeringeding!\n" + 
					" \\/   | |\\ \\      | | \\ \\ Gering-ding-ding-ding-dingeringeding!\n"+
					"      | | \\ \\     | |  \\ \\ Gering-ding-ding-ding-dingeringeding!\n"+
					"      | |  \\ \\    | |   \\ \\ WHAT DOES THE FLOG SAY?!?\n"+
					"      '''   '''   '''    '''  \n";

		}else if(this.getName().equalsIgnoreCase("esqueleto")){
			skin =  "      .-. \n" +
					"     (o.o)           \n" +
					"      |=|    O Homem esqueleto ja foi um homem comum,        \n"+
					"     __|__   Ate que em um dia fatidico ele pulou de uma penhasco \n" +
					"   //.=|=.\\\\  Nesse momento a sua pele se abriu e a verdade foi revelada, \n"+
					"  // .=|=. \\\\ EXISTIA UM ESQUELETO DENTRO DO HOMEM \n"+
					"  \\\\ .=|=. // AJOELHE-SE PERANTE A FURIA \n"+
					"   \\\\(_=_)// DO HOMEM-ESQUELETO \n"+
					"    (:| |:) \n"+
					"     || || \n"+
					"     () () \n"+
					"     || || \n"+
					"     || || \n"+
					"    ==' '== \n";
		}else if(this.getName().equalsIgnoreCase("aranha")){
			skin = "              (\n" + 
					"                )\n" + 
					"               (\n" + 
					"         /\\  .-\"\"\"-.  /\\\n" + 
					"        //\\\\/  ,,,  \\//\\\\\n" + 
					"        |/\\| ,;;;;;, |/\\|\n" + 
					"        //\\\\\\;-\"\"\"-;///\\\\\n" + 
					"       //  \\/   .   \\/  \\\\\n" + 
					"      (| ,-_| \\ | / |_-, |)\n" + 
					"        //`__\\.-.-./__`\\\\\n" + 
					"       // /.-(() ())-.\\ \\\\\n" + 
					"      (\\ |)   '---'   (| /)\n" + 
					"       ` (|           |) `\n" + 
					"         \\)           (/\n" + 
					"\n" + 
					"";
		} else if(this.getName().equalsIgnoreCase("boss")) {
			skin = "8888888b.                                                                                     \n" + 
					"888   Y88b                                                                                    \n" + 
					"888    888                                                                                    \n" + 
					"888   d88P .d88b.  88888b.  888d888 .d88b.  888  888  8888b.   .d8888b  8888b.   .d88b.       \n" + 
					"8888888P\" d8P  Y8b 888 \"88b 888P\"  d88\"\"88b 888  888     \"88b d88P\"        \"88b d88\"\"88b      \n" + 
					"888 T88b  88888888 888  888 888    888  888 Y88  88P .d888888 888      .d888888 888  888      \n" + 
					"888  T88b Y8b.     888 d88P 888    Y88..88P  Y8bd8P  888  888 Y88b.    888  888 Y88..88P      \n" + 
					"888   T88b \"Y8888  88888P\"  888     \"Y88P\"    Y88P   \"Y888888  \"Y8888P \"Y888888  \"Y88P\"       \n" + 
					"                   888                                                                        \n" + 
					"                   888                                                                        \n" + 
					"                   888                                                                        \n" + 
					"888b     d888  .d8888b.   .d8888b.   .d8888b.   .d8888b.                                      \n" + 
					"8888b   d8888 d88P  Y88b d88P  Y88b d88P  Y88b d88P  Y88b                                     \n" + 
					"88888b.d88888 888    888      .d88P 888    888        888                                     \n" + 
					"888Y88888P888 888            8888\"  888    888      .d88P                                     \n" + 
					"888 Y888P 888 888             \"Y8b. 888    888  .od888P\"                                      \n" + 
					"888  Y8P  888 888    888 888    888 888    888 d88P\"                                          \n" + 
					"888   \"   888 Y88b  d88P Y88b  d88P Y88b  d88P 888\"                                           \n" + 
					"888       888  \"Y8888P\"   \"Y8888P\"   \"Y8888P\"  888888888                                      \n" + 
					"                                                               ";
		}

		return skin;
	}
}
