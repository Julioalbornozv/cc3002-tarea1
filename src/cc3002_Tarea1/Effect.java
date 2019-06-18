package cc3002_Tarea1;

public abstract class Effect implements Visitor{
	private boolean turn_limit = false; //Turn restriction limited to n or once per turn
	
	public Effect() {}
	public Effect(boolean limit) {
		this.turn_limit = limit;
		}
	
	public abstract void execute(Judge m);
	public abstract void executeOver(Judge m, ICard card);
	
	@Override
	public void visitEnergy(IEnergy e) {}
	
	@Override
	public void visitBasicPokemon() {}

	@Override
	public void visitS1_Pokemon() {}

	@Override
	public void visitS2_Pokemon() {}

	@Override
	public void visitStadium(Stadium t) {}

	@Override
	public void visitSupport(Support s) {}

	@Override
	public void visitItem(Item I) {}
	
	public boolean getLimit() {
		return turn_limit;
		}
	}