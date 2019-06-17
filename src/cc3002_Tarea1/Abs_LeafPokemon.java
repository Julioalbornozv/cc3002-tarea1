package cc3002_Tarea1;

public abstract class Abs_LeafPokemon extends Abs_Pokemon{

	public Abs_LeafPokemon(int id, String name, int hp, IAbility[] skills) {
		super(id,name,hp,skills);
		}	

	@Override
	public void fight(Attack att, IPokemon enemy) {
		enemy.recieveLeafDmg(att);
		}
	
	@Override
	public void recieveFireDmg(Attack att) {
		weaknessDmg(att.getDmg());
		}
	@Override
	public void recieveWaterDmg(Attack att) {
		resistDmg(att.getDmg());
		}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Abs_LeafPokemon && super.equals(obj);
		}
	}