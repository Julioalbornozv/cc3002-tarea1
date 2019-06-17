package cc3002_Tarea1;

public class Heal extends Effect{

	@Override
	public void execute(Judge m) {
		if (m.coinflip() == 0) {
			IPokemon pk = m.getTrainer().getCurrent();
			pk.normalDmg(-10);
			}
		}

	@Override
	public void executeOver(Judge m, ICard card) {}

}
