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
	 * @param hp Pokemon hp
	 * @param skills Pokemon skills
	 */
	public Pokemon_Fight(int id, int hp, Ability[] skills) {
		super(id,hp,skills);
		}
	
	@Override
	public void fight(Attack att, Pokemon enemy) {
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
}
