package cc3002_Tarea1;

public class BasicFightPokemon extends Abs_FightPokemon implements IBasicPokemon{
	
	public BasicFightPokemon(int id,String name, int hp, IAbility ... skills) {
		super(id,name,hp,skills);
		}

	@Override
	public void accept(Visitor m) {
		m.visitBasicPokemon();
		}
	}
