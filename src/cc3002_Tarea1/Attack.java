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
	 * @param dmg Attack base damage
	 * @param cost Attack cost (As Ledger object)
	 */
	public Attack(String name, String desc, int dmg, Ledger cost) {
		super(name, desc, dmg, cost);
		}
	
	/**
	 * Creates new standard attack
	 * 
	 * @param name Attack name
	 * @param desc Attack description
	 * @param dmg Attack base damage
	 * @param cost Attack cost (As Energy cards)
	 */
	public Attack(String name, String desc, int dmg, IEnergy ... cards) {
		super(name, desc, dmg, cards);
		}
	
	/**
	 * Checks if this attack is equal to another
	 * @param obj Object being compared
	 * @return boolean
	 */
	public boolean equals(Object obj) {
		return obj instanceof Attack && super.equals(obj);
		}
}
