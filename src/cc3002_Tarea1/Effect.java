package cc3002_Tarea1;

public abstract class Effect implements Visitor{
	private int turn_limit = 0;

	public Effect() {}
	public Effect(int limit) {
		this.turn_limit = 0;
		}
	public abstract void execute(Judge m);
	public abstract void executeOver(Judge m, ICard card);
	
	@Override
	public void visitEnergy(IEnergy e) {}
	
	@Override
	public void visitBasicPokemon() {
		// TODO Auto-generated method stub
		
		}

	@Override
	public void visitS1_Pokemon() {
		// TODO Auto-generated method stub
		
		}

	@Override
	public void visitS2_Pokemon() {
		// TODO Auto-generated method stub
		
		}

	@Override
	public void visitStadium(Stadium t) {}

	@Override
	public void visitSupport(Support s) {}

	@Override
	public void visitItem(Item I) {
		// TODO Auto-generated method stub
		
		}
	}