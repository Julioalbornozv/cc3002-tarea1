package cc3002_Tarea1;

public class BasicWaterPokemon extends Abs_WaterPokemon implements IBasicPokemon{
	
	public BasicWaterPokemon(int id,String name, int hp, IAbility ... skills) {
		super(id,name,hp,skills);
		}

	@Override
	public void accept(Visitor m) {
		m.visitBasicPokemon();
		}
	}
