package cc3002_Tarea1;

/**
 * Class for fight type pokemons
 * 
 * @author Julio Albornoz Valencia
 */
public class Pokemon_Fight extends Abs_Pokemon{
	/**
	 * Creates new fight type pokemon
	 * @param id Pokemon id
	 * @param name Pokemon name
	 * @param hp Pokemon hp
	 * @param skills Pokemon skills
	 */
	public Pokemon_Fight(int id, String name, int hp, IAbility ... skills) {
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
	
	/**
	 * Checks if this Fight Pokemon is equal to another
	 * @param obj Object being compared
	 * @return boolean 
	 */
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Pokemon_Fight && super.equals(obj);
		}	
	}
