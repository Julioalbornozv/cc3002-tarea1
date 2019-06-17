package cc3002_Tarea1;

public class Stage1_Leaf_Pokemon extends Abs_LeafPokemon implements IStage1Pokemon{
	private int prevol;
	
	public Stage1_Leaf_Pokemon(int id, String name, int hp, int pre, IAbility ... skills) {
		super(id,name,hp,skills);
		this.prevol = pre;
		}
	
	public int getpreID() {
		return prevol;
		}

	@Override
	public void accept(Visitor m) {
		m.visitS1_Pokemon();
		}
	
}
