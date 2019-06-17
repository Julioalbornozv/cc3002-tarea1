package cc3002_Tarea1;

public abstract class Abs_PsiPokemon extends Abs_Pokemon {

	public Abs_PsiPokemon(int id, String name, int hp, IAbility[] skills) {
		super(id,name,hp,skills);
		}	

	@Override
	public void fight(Attack att, IPokemon enemy) {
		enemy.recievePsiDmg(att);
		}
	
	@Override
	public void recievePsiDmg(Attack att) {
		weaknessDmg(att.getDmg());
		}
	
	@Override
	public void recieveFightDmg(Attack att) {
		resistDmg(att.getDmg());
		}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Abs_PsiPokemon && super.equals(obj);
		}
	}