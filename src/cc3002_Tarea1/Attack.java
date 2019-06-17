package cc3002_Tarea1;

/**
 * Standard attack class (No special effects)
 * 
 * @author Julio Albornoz Valencia
 */
public class Attack extends Abs_Ability{
	private int dmg;
	/**
	 * Creates new standard attack
	 * 
	 * @param name Attack name
	 * @param desc Attack description
	 * @param dmg Attack base damage
	 * @param cost Attack cost (As Ledger object)
	 */
	public Attack(String name, String desc, int dmg, Ledger cost) {
		super(name, desc, cost);
		this.dmg = dmg;
		}
	
	public Attack(String name, String desc, int dmg, Effect eff, Ledger cost) {
		super(name, desc, eff, cost);
		this.dmg = dmg;
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
		super(name, desc, cards);
		this.dmg = dmg;
		}
	
	public Attack(String name, String desc, int dmg, Effect eff, IEnergy ... cards) {
		super(name, desc, eff, cards);
		this.dmg = dmg;
		}
	
	@Override
	public void notify(IObserver m) {
		m.notifyAttack(this);
		}
	
	/**
	 * Getter for the attack base damage
	 * @return Base damage
	 */
	
	public int getDmg() {
		return dmg;
		}
	
	/**
	 * Checks if this attack is equal to another
	 * @param obj Object being compared
	 * @return boolean
	 */
	public boolean equals(Object obj) {
		return obj instanceof Attack && super.equals(obj)
				&& ((Attack)obj).getDmg() == this.getDmg();
		}
}
