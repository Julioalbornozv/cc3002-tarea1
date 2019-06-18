package cc3002_Tarea1;

/**
 * Heal ability implementation
 * @author Julio Albornoz Valencia
 *
 */
public class Heal extends Effect{

	@Override
	public void execute(Judge m) {
		if (m.coinflip() == 0) {
			IPokemon pk = m.getTrainer().getCurrent();
			if (pk.getWound() > 0) {
				pk.normalDmg(-1);
				}
			}
		}

	@Override
	public void executeOver(Judge m, ICard card) {}

}
