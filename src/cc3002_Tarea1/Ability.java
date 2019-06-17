package cc3002_Tarea1;

public class Ability extends Abs_Ability {

	protected Ability(String name, String desc, Ledger cost) {
		super(name,desc,cost);
		}
	
	protected Ability(String name, String desc, Effect eff, Ledger cost) {
		super(name,desc,eff,cost);
		}
	
	protected Ability(String name, String desc, IEnergy ... cards) {
		super(name,desc,cards);
		}
	
	protected Ability(String name, String desc, Effect eff, IEnergy ... cards) {
		super(name,desc,eff,cards);
		}
	
	@Override
	public void notify(IObserver m) {
		m.notifySelection(this);
		}
	}
