package cc3002_Tarea1;

/**
 * Class for water type pokemons
 * 
 * @author Julio Albornoz Valencia
 */
public class Pokemon_Water extends Abs_Pokemon{
	/**
	 * Creates new water type pokemon
	 * @param id Pokemon id
	 * @param name Pokemon name
	 * @param hp Pokemon hp
	 * @param skills Pokemon skills
	 */
	public Pokemon_Water(int id, String name, int hp, IAbility ... skills) {
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

	/**
	 * Checks if this Water Pokemon is equal to another
	 * @param obj Object being compared
	 * @return boolean 
	 */
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Pokemon_Water && super.equals(obj);
		}	
	}

