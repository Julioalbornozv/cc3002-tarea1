package cc3002_Tarea1;

public abstract class Abs_ThunderPokemon extends Abs_Pokemon{

	public Abs_ThunderPokemon(int id, String name, int hp, IAbility[] skills) {
		super(id,name,hp,skills);
		}	

	@Override
	public void fight(Attack att, IPokemon enemy) {
		enemy.recieveThunderDmg(att);
		}
	
	@Override
	public void recieveFightDmg(Attack att) {
		weaknessDmg(att.getDmg());
		}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Abs_ThunderPokemon && super.equals(obj);
		}
	}