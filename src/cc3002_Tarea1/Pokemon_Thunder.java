package cc3002_Tarea1;

/**
 * Class for thunder type pokemons
 * 
 * @author Julio Albornoz Valencia
 */
public class Pokemon_Thunder extends Abs_Pokemon{
	/**
	 * Creates new thunder type pokemon
	 * @param id Pokemon id
	 * @param name Pokemon name
	 * @param hp Pokemon hp
	 * @param skills Pokemon skills
	 */
	public Pokemon_Thunder(int id, String name, int hp, IAbility ... skills) {
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

	/**
	 * Checks if this Thunder Pokemon is equal to another
	 * @param obj Object being compared
	 * @return boolean 
	 */
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Pokemon_Fight && super.equals(obj);
		}	
}
