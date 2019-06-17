package cc3002_Tarea1;

public class BasicThunderPokemon extends Abs_ThunderPokemon implements IBasicPokemon{
	
	public BasicThunderPokemon(int id,String name, int hp, IAbility ... skills) {
		super(id,name,hp,skills);
		}

	@Override
	public void accept(Visitor m) {
		m.visitBasicPokemon();
		}
	}
