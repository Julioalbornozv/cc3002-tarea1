package cc3002_Tarea1;

import java.util.List;

/**
 * Common interface for Pokemon entities. Pokemons contain an id
 * , health points, a set of maximum 4 skills and a number of energy
 * cards associated with them (Managed by a Ledger object).
 * 
 * @author Julio Albornozz Valencia
 */
public interface Pokemon extends Card{  
	/**
	 * Getter for poekemon's hp
	 * @return Pokemon health
	 */
	public int getHP();
	
	/**
	 * Getter for pokemon id
	 * @return Pokemon id
	 */
	public int getID();
	/**
	 * Getter for skills associated with the pokemon
	 * @return Set of ablilities
	 */
	public List<Ability> getSkillset();
	
	/**
	 * Attacks specified pokemon only if the given attack cost is
	 * lower than the number of associated energies.
	 * @param att Attack to be used
	 * @param enemy Active pokemon of the opponent
	 */
	public void attack(Attack att, Pokemon enemy);
	
	/**
	 * Associates the given energy with this pokemon, by incrementing
	 * the energy card counters stored by the Ledger.
	 * @param energy Energy being equipped
	 */
	public void associate(Energy energy);
	
	/**
	 * Receives fire damage from an opponent
	 * @param att Enemy attack
	 */
	public void recieveFireDmg(Attack att);
	
	/**
	 * Receives water damage from an opponent
	 * @param att Enemy attack
	 */
	public void recieveWaterDmg(Attack att);
	
	/**
	 * Receives leaf damage from an opponent
	 * @param att Enemy attack
	 */
	public void recieveLeafDmg(Attack att);
	
	/**
	 * Receives fight damage from an opponent
	 * @param att Enemy attack
	 */
	public void recieveFightDmg(Attack att);
	
	/**
	 * Receives thunder damage from an opponent
	 * @param att Enemy attack
	 */
	public void recieveThunderDmg(Attack att);
	
	/**
	 * Receives psychic damage from an opponent
	 * @param att Enemy attack
	 */
	public void recievePsiDmg(Attack att);
}
