package cc3002_Tarea1;

public class Electric_Shock extends Effect {
	private int multiplier = 3;
	
	@Override
	public void execute(Judge m) {
		if (m.coinflip() == 1) {
			m.getAdversary().getActive().normalDmg(multiplier);
			}

		}

	@Override
	public void executeOver(Judge m, ICard card) {}
	
	public int getMultiplier() {
		return multiplier;
		}

}
