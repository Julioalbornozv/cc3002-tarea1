package cc3002_Tarea1;

public class PC_Discovery extends Effect {

	@Override
	public void execute(Judge m) {
		ITrainer curr = m.getTrainer();
		if (m.coinflip() == 0) {
			curr.getDeck().draw(3);
			}	
		else {
			curr.getDeck().draw(2);
			}
		}

	@Override
	public void executeOver(Judge m, ICard card) {}
	}
