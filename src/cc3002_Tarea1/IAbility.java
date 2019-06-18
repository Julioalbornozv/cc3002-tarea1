package cc3002_Tarea1;

/**
 * Common interface for all skills. Skills have a name, a desription
 * and a cost associated with it.
 * 
 * 
 * @author Julio Albornoz Valencia
 */
public interface IAbility {
	
	/**
	 * Disambiguates by telling the observer if the selected ability is a standard ability or an attack
	 * @param m Judge of this match
	 */
	public void notify(IObserver m);
	
	/**
	 * Getter for the cost 
	 * @return Ledger Object containing the cost of the ability
	 */
	public Ledger getCost();
	
	/**
	 * Getter for the description
	 * @return Description of the skill
	 */
	public String getDescription();
	
	/**
	 * Getter for the name
	 * @return Name of the skill
	 */
	public String getName();
	
	/**
	 * Getter for the Effect
	 * @return Effect object
	 */
	Effect getEffect();
}
