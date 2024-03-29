package cc3002_Tarea1;

public class Item implements ITrainerCard{
	private String name;
	private String description;
	protected Effect eff;
	
	public Item(Effect e) {
		this.eff = e;
		};
		
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
		player.getObs().instant_effect(this.eff);
		player.discard(this);
		}
	

	@Override
	public void accept(Visitor modifier) {
		modifier.visitItem(this);
	}

}
