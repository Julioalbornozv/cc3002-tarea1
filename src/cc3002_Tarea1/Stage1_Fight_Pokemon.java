package cc3002_Tarea1;

public class Stage1_Fight_Pokemon extends Abs_FightPokemon {
	private int prevol;
	
	public Stage1_Fight_Pokemon(int id, String name, int hp, int pre, IAbility ... skills) {
		super(id,name,hp,skills);
		this.prevol = pre;
		}
	
	/*
	 * For this case the player must choose which basic pokemon it wishes to evolve
	 */
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
