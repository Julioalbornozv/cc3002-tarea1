package cc3002_Tarea1;

public class Stage2_Fire_Pokemon extends Abs_FirePokemon implements IBasicPokemon{
	private int prevol;
	
	public Stage2_Fire_Pokemon(int id, String name, int hp, int pre, IAbility ... skills) {
		super(id,name,hp,skills);
		this.prevol = pre;
		}
	
	public int getpreID() {
		return prevol;
		}

	@Override
	public void accept(Visitor m) {
		m.visitS2_Pokemon();
		}
	}
