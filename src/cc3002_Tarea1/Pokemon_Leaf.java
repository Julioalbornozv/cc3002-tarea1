package cc3002_Tarea1;

/**
 * Class for leaf type pokemons
 * 
 * @author Julio Albornoz Valencia
 */
public class Pokemon_Leaf extends Abs_Pokemon{
	/**
	 * Creates new leaf type pokemon
	 * @param id Pokemon id
	 * @param name Pokemon name
	 * @param hp Pokemon hp
	 * @param skills Pokemon skills
	 */
	public Pokemon_Leaf(int id, String name, int hp, Ability[] skills) {
		super(id,name,hp,skills);
		}
	
	@Override
	public void fight(Attack att, Pokemon enemy) {
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
	
	/**
	 * Checks if this Leaf Pokemon is equal to another
	 * @param obj Object being compared
	 * @return boolean 
	 */
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Pokemon_Leaf && super.equals(obj);
		}	
	}
