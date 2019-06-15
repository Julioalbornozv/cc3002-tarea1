package cc3002_Tarea1;

public abstract class Effect implements Visitor{

	public Effect() {}
	public abstract void execute(Judge m);
	public void executeOver(Judge m, ICard card) {}
	
	@Override
	public void visitEnergy(IEnergy e) {
		// TODO Auto-generated method stub
		
		}

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
	public void visitStadium(Abs_Stadium t) {
		// TODO Auto-generated method stub
		
		}

	@Override
	public void visitSupport(Support s) {
		// TODO Auto-generated method stub
		
		}

	}
