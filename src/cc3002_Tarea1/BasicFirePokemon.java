package cc3002_Tarea1;

public class BasicFirePokemon extends Abs_FirePokemon implements IBasicPokemon{
	
	public BasicFirePokemon(int id,String name, int hp, IAbility ... skills) {
		super(id,name,hp,skills);
		}

	@Override
	public void accept(Visitor m) {
		m.visitBasicPokemon();
		}
	}
