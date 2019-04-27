package cc3002_Tarea1;

/**
 * Class for psychic type pokemons
 * 
 * @author Julio Albornoz Valencia
 */
public class Pokemon_Psi extends Abs_Pokemon{
	/**
	 * Creates new psychic type pokemon
	 * @param id Pokemon id
	 * @param name Pokemon name
	 * @param hp Pokemon hp
	 * @param skills Pokemon skills
	 */
	public Pokemon_Psi(int id,String name, int hp, Ability[] skills) {
		super(id,name,hp,skills);
		}
	
	@Override
	public void fight(Attack att, Pokemon enemy) {
		enemy.recievePsiDmg(att);
		}
	
	@Override
	public void recievePsiDmg(Attack att) {
		weaknessDmg(att.getDmg());
		}
	@Override
	public void recieveFightDmg(Attack att) {
		resistDmg(att.getDmg());
		}
}
