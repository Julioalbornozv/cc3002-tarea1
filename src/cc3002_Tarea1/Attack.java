package cc3002_Tarea1;

/**
 * Standard attack class (No special effects)
 * 
 * @author Julio Albornoz Valencia
 */
public class Attack extends Abs_Attack{
	/**
	 * Creates new standard attack
	 * 
	 * @param name Attack name
	 * @param desc Attack description
	 * @param cost Attack cost
	 * @param dmg Attack base damage
	 */
	public Attack(String name, String desc, Ledger cost, int dmg) {
		super(name, desc, cost, dmg);
		}
}
