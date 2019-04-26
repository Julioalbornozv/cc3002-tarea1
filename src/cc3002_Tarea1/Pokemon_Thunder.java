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
	 * @param hp Pokemon hp
	 * @param skills Pokemon skills
	 */
	public Pokemon_Thunder(int id, int hp, Ability[] skills) {
		super(id,hp,skills);
		}
	
	@Override
	public void fight(Attack att, Pokemon enemy) {
		enemy.recieveThunderDmg(att);
		}
	
	@Override
	public void recieveFightDmg(Attack att) {
		weaknessDmg(att.getDmg());
		}
}
