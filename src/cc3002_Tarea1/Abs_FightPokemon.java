package cc3002_Tarea1;

public abstract class Abs_FightPokemon extends Abs_Pokemon{

	public Abs_FightPokemon(int id, String name, int hp, IAbility[] skills) {
		super(id,name,hp,skills);
		}	

	@Override
	public void fight(Attack att, IPokemon enemy) {
		enemy.recieveFightDmg(att);
		}
	
	@Override
	public void recievePsiDmg(Attack att) {
		weaknessDmg(att.getDmg());
		}
	@Override
	public void recieveLeafDmg(Attack att) {
		weaknessDmg(att.getDmg());
		}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Abs_FightPokemon && super.equals(obj);
		}
	}