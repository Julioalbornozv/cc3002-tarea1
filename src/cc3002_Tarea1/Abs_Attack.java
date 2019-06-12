package cc3002_Tarea1;


/**
 * Base class for all attack. Includes getters for name, description
 * cost and base damage of the attack
 * 
 * @author Julio Albornoz Valencia
 */

public abstract class Abs_Attack implements IAbility {
	private String name;
	private String description;
	private Ledger cost;
	private int dmg;
	
	/**
	 * Creates a new attack
	 * 
	 * @param name Attack name
	 * @param desc Attack description
	 * @param dmg  Attack base damage
	 * @param cost Attack cost (as Ledger Object)
	 */
	protected Abs_Attack(String name, String desc,  int dmg, Ledger cost) {
		this.name = name;
		this.description = desc;
		this.cost = cost;
		this.dmg = dmg;
		}
	
	/**
	 * Creates a new attack
	 * 
	 * @param name Attack name
	 * @param desc Attack description
	 * @param dmg  Attack base damage
	 * @param cards Energy cards required by the attack
	 */
	protected Abs_Attack(String name, String desc, int dmg, IEnergy ... cards) {
		this.name = name;
		this.description = desc;
		this.cost = new Ledger(cards);
		this.dmg = dmg;
		}
	
	/**
	 * Getter for the attack base damage
	 * @return Base damage
	 */
	public int getDmg() {
		return dmg;
		}
	
	@Override
	public String getDescription() {
		return description;
		}
	
	@Override
	public String getName() {	
		return name;
		}
	
	@Override
	public Ledger getCost() {
		return cost;
		}
	
	/**
	 * Determines if an attack is the same as another object
	 * @param Object to be compared
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		return obj instanceof IAbility 
			   && ((Attack)obj).getName().equals(this.getName())
			   && ((Attack)obj).getDmg() == this.getDmg() 
			   && ((Attack)obj).getCost().equals(this.getCost());
		}
	}
