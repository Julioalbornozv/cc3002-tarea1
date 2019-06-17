package cc3002_Tarea1;

public class Item implements ITrainerCard{
	private String name;
	private String description;
	private Effect eff;
	
	@Override
	public String getName() {
		return name;
		}

	@Override
	public String getDescription() {
		return description;
		}

	@Override
	public void beingPlayedBy(ITrainer player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(Visitor modifier) {
		modifier.visitItem(this);
	}

}
