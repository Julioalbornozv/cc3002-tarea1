package cc3002_Tarea1;

public abstract class Abs_FirePokemon extends Abs_Pokemon {

	public Abs_FirePokemon(int id, String name, int hp, IAbility[] skills) {
		super(id,name,hp,skills);
		}	

	@Override
	public void fight(Attack att, IPokemon enemy) {
		enemy.recieveFireDmg(att);
		}
	
	@Override
	public void recieveWaterDmg(Attack att) {
		weaknessDmg(att.getDmg());
		}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Abs_FirePokemon && super.equals(obj);
		}
	}