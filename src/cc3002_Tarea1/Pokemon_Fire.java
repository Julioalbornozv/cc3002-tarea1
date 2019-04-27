package cc3002_Tarea1;

/**
 * Class for fire type pokemons
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
	public Pokemon_Fire(int id, String name, int hp, Ability[] skills) {
		super(id,name,hp,skills);
		}
	
	@Override
	public void fight(Attack att, Pokemon enemy) {
		enemy.recieveFireDmg(att);
		}
	
	@Override
	public void recieveWaterDmg(Attack att) {
		weaknessDmg(att.getDmg());
		}
	}
