package cc3002_Tarea1;

public class BasicPsiPokemon extends Abs_PsiPokemon implements IBasicPokemon{
	
	public BasicPsiPokemon(int id,String name, int hp, IAbility ... skills) {
		super(id,name,hp,skills);
		}

	@Override
	public void accept(Visitor m) {
		m.visitBasicPokemon();
		}
	}
