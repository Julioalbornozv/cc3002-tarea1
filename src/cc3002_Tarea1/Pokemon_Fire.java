package cc3002_Tarea1;

/**
 * Class for the fire type pokemons
 * 
 * @author Julio Albornoz Valencia
 */
public class Pokemon_Fire extends Abs_Pokemon{
	/**
	 * Creates new fire type pokemon
	 * @param id Pokemon id
	 * @param name Pokemon name
	 * @param hp Pokemon hp
	 * @param skills Pokemon skills
	 */
	public Pokemon_Fire(int id, String name, int hp, IAbility ... skills) {
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

	/**
	 * Checks if this Fire Pokemon is equal to another
	 * @param obj Object being compared
	 * @return boolean 
	 */
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Pokemon_Fire && super.equals(obj);
		}	
	}
