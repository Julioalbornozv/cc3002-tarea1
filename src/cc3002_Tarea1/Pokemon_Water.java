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
	 * @param hp Pokemon hp
	 * @param skills Pokemon skills
	 */
	public Pokemon_Water(int id, int hp, Ability[] skills) {
		super(id,hp,skills);
		}
	
	@Override
	public void fight(Attack att, Pokemon enemy) {
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
	}

