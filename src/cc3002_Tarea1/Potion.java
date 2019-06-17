package cc3002_Tarea1;

public class Potion extends Effect{
	private int multiplier = 3;
	
	@Override
	public void execute(Judge m) {
		IPokemon pk = m.getTrainer().getCurrent();
		int counters = pk.getWound();
		if (counters < multiplier) {	// Less counters than maximum
			pk.normalDmg(-counters);    // Restores to full health
			}
		else {
			pk.normalDmg(-multiplier);  // Removes max number of counters
			}
		}

	@Override
	public void executeOver(Judge m, ICard card) {}

	public int getMultiplier() {
		return multiplier;
		}
	}