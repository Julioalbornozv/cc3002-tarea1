package cc3002_Tarea1;

public class Stage1_Thunder_Pokemon extends Abs_ThunderPokemon implements IStage1Pokemon{
	private int prevol;
	
	public Stage1_Thunder_Pokemon(int id, String name, int hp, int pre, IAbility ... skills) {
		super(id,name,hp,skills);
		this.prevol = pre;
		}
	
	@Override
	public void beingPlayedBy(ITrainer player){
		IPokemon prepk = player.getCurrent();
		prepk.getLedger().Transfer(this.power);
		player.replace(prepk, this);
		}
	
	public int getpreID() {
		return prevol;
		}

	@Override
	public void accept(Visitor m) {
		m.visitS1_Pokemon();
		}
	
}