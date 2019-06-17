package cc3002_Tarea1;

public class Potion extends Effect{
	private int multiplier = 3;
	
	@Override
	public void execute(Judge m) {
		IPokemon pk = m.getTrainer().getCurrent();
		pk.normalDmg(-10*multiplier);
		}

	@Override
	public void executeOver(Judge m, ICard card) {}

	public int getMultiplier() {
		return multiplier;
		}
	}