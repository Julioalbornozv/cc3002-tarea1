package cc3002_Tarea1;

public abstract class Abs_Stadium implements Visitor, ITrainerCard{
	private String name;
	private String description;
	
	public Abs_Stadium() {};
	public abstract void execute(Judge m, ICard c);
	
	@Override
	public String getName() {
		return name;
		}
	
	@Override
	public String getDescription() {
		return description;
		}
	
	@Override
	public void beingPlayedBy(ITrainer player) {
		player.getObs().update_Stadium(this);
		}
	
	public void accept(Visitor m) {
		m.visitStadium(this);
		}
	
	@Override
	public void visitEnergy(IEnergy e) {}
	
	@Override
	public void visitBasicPokemon() {}

	@Override
	public void visitS1_Pokemon() {}

	@Override
	public void visitS2_Pokemon() {}

	@Override
	public void visitStadium(Abs_Stadium t) {}
	
	
	}