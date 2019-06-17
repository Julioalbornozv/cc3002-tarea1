package cc3002_Tarea1;

public abstract class Abs_WaterPokemon extends Abs_Pokemon{

	public Abs_WaterPokemon(int id, String name, int hp, IAbility[] skills) {
		super(id,name,hp,skills);
		}	

	@Override
	public void fight(Attack att, IPokemon enemy) {
		enemy.recieveWaterDmg(att);
		}
	
	@Override
	public void recieveLeafDmg(Attack att) {
		weaknessDmg(att.getDmg());
		}
	public void recieveThunderDmg(Attack att) {
		weaknessDmg(att.getDmg());
		}
	@Override
	public void recieveFightDmg(Attack att) {
		resistDmg(att.getDmg());
		}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Abs_WaterPokemon && super.equals(obj);
		}
	}