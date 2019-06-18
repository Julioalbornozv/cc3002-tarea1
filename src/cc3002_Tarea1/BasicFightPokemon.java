package cc3002_Tarea1;

public class BasicFightPokemon extends Abs_FightPokemon{
	
	public BasicFightPokemon(int id,String name, int hp, IAbility ... skills) {
		super(id,name,hp,skills);
		}

	@Override
	public void beingPlayedBy(ITrainer player){
		player.addToBench(this);
		}
	
	@Override
	public void accept(Visitor m) {
		m.visitBasicPokemon();
		}
	}
