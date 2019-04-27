package cc3002_Tarea1;

/**
 * Class which handles energy cards as currency, used 
 * by pokemons to store associated cards while attacks use them to 
 * store their costs. Contains hash map which stores counters for
 * each energy type.
 * 
 * @author Julio Albornoz Valencia
 */
import java.util.HashMap;
import java.util.Set;
public class Ledger {
	
	private HashMap<Integer, Integer>  count = new HashMap<>();
	
	/**
	 * Creates empty Ledger
	 */
	public Ledger() {}
		
	/**
	 * Creates Ledger with a set of energy cards already stored
	 * @param eSet
	 */
	public Ledger(Energy ... eSet) {
		for (Energy header : eSet) {
			this.add(header.getKey());
			}
		}

	/**
	 * Increments an energy counter if it exists, if not creates
	 * a counter based on the new energy type.
	 * @param k Key used to identify an energy type
	 */
	public void add(int k) {
		if (!count.containsKey(k)) {
			count.put(k,1);
			}
		else {
			count.put(k, count.get(k)+1);
			}
		}
	
	/**
	 * Getter for a specific counter
	 * @param k Item key
	 * @return Number of energy cards of that type currently stored
	 */
	public Integer getval(Integer k) {
		return count.get(k);
		}
	
	/**
	 * Getter for keys currently being used by the hashmap
	 * @return Array of keys
	 */
	public Integer[] getKeys() {
		Set<Integer> set= count.keySet();
		return set.toArray(new Integer[set.size()]);
		}
	
	/**
	 * Given a skill, this object will compare the cost of the ability
	 * and the number of energy cards currently being stored. Returns
	 * returns false if there are not enough number of energy cards 
	 * to execute the given skill.
	 * @param skill Skill to be evaluated
	 * @return boolean
	 */
	public boolean evalCost(Ability skill) {
		Ledger cost = skill.getCost();
		Integer[] keys = cost.getKeys();
		
		for (int i = 0; i < keys.length; i++) {
			if (count.get(keys[i]) == null || cost.getval(keys[i]) == null){
				return false;
				}
			if (count.get(keys[i]) < cost.getval(keys[i])) {
				return false;
				}
			}
		return true;
		}
	
	/**
	 * Determines if a Ledger is the same as another object
	 * @param Object to be compared
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		Ledger other = ((Ledger)obj);
		return obj instanceof Ledger && (other.count).equals(this.count);
		}
	}