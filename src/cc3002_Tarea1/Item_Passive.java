package cc3002_Tarea1;

public class Item_Passive extends Item {
	
	public Item_Passive(Effect e) {
		super(e);
		};

	@Override
	public void beingPlayedBy(ITrainer player) {
		player.getObs().dormant_effect(this.eff);
		player.getCurrent().associateItem(this);
		}
	}
