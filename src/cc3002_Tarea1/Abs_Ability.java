package cc3002_Tarea1;


/**
 * Base class for all attack. Includes getters for name, description
 * cost and base damage of the attack
 * 
 * @author Julio Albornoz Valencia
 */

public abstract class Abs_Ability implements IAbility {
	private String name;
	private String description;
	private Ledger cost;
	private Effect effect = new Null_Effect();
	
	/**
	 * Creates a new ability (based on an existing Ledger)
	 * 
	 * @param name Ability name
	 * @param desc Ability description
	 * @param cost Ability cost (as Ledger Object)
	 */
	protected Abs_Ability(String name, String desc, Ledger cost) {
		this.name = name;
		this.description = desc;
		this.cost = cost;
		}
	
	protected Abs_Ability(String name, String desc, Effect eff, Ledger cost) {
		this(name,desc,cost);
		this.effect = eff;
		}
	/**
	 * Creates a new ability
	 * 
	 * @param name Ability name
	 * @param desc Ability description
	 * @param cards Energy cards required by the ability
	 */
	protected Abs_Ability(String name, String desc, IEnergy ... cards) {
		this.name = name;
		this.description = desc;
		this.cost = new Ledger(cards);
		}
	
	protected Abs_Ability(String name, String desc, Effect eff, IEnergy ... cards) {
		this(name,desc,cards);
		this.effect = eff;
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
	
	@Override
	public Effect getEffect() {
		return effect;
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
			   && ((Attack)obj).getCost().equals(this.getCost());
		}
	}
