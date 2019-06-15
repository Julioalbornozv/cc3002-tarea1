package cc3002_Tarea1;

public class Null_Effect extends Effect {
	private Judge monitor;
	
	@Override
	public void execute(Judge m) {}

	@Override
	public void executeOver(Judge m, ICard card) {
		this.monitor = m;
		card.accept(this);
		}

}
