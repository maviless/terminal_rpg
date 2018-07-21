package menu;
import menu.option.*;

public class MenuStart extends MenuAbstract{

    public MenuStart() {
        super();
        this.name = "start";
    }

    public void initOptions() {
        OptionFactory optFactory = new OptionFactory();
        this.options.add(optFactory.getOption("start"));
        this.options.add(optFactory.getOption("about"));
        this.options.add(optFactory.getOption("exit"));
    }

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
