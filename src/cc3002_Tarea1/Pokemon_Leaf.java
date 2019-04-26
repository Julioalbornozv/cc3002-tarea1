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
	 * @param hp Pokemon hp
	 * @param skills Pokemon skills
	 */
	public Pokemon_Leaf(int id, int hp, Ability[] skills) {
		super(id,hp,skills);
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
	}
