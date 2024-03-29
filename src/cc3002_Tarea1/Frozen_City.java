package cc3002_Tarea1;

/**
 * Frozen City Stadium implementation
 * @author Julio Albornoz Valencia
 *
 */
public class Frozen_City extends Effect {
	private Judge monitor;
	private int multiplier = 3; // Number of counters to be dicsarded
	
	@Override
	public void execute(Judge m) {}
	
	@Override
	public void executeOver(Judge m, ICard c) {
		this.monitor = m;
		c.accept(this);
		}
	
	@Override
	public void visitEnergy(IEnergy e) {
		IPokemon pk = monitor.getTrainer().getCurrent();
		pk.normalDmg(multiplier);
		}
	
	/**
	 * Getter for multiplier of this effect
	 * @return
	 */
	
	public int getMult() {
		return multiplier;	
		}
	
	}
