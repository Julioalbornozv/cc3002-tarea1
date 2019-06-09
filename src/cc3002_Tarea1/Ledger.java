package cc3002_Tarea1;

/**
 * Class which handles energy cards as currency, used 
 * by pokemons to store associated cards while attacks use them to 
 * store their costs. Contains hash map which stores counters for
 * each energy type.
 * 
 * @author Julio Albornoz Valencia
 */
import java.util.Map;
import java.util.EnumMap;
import java.util.Set;



public class Ledger {
	public enum EnergyType {LEAF, FIRE, WATER, THUNDER, PSI, FIGHT};
	
	private Map<EnergyType, Integer>  count = new EnumMap<>(EnergyType.class);
	
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
			header.AddTo(this);
			}
		}

	public void AddLeafEnergy() {
		if (!count.containsKey(EnergyType.LEAF)) {
			count.put(EnergyType.LEAF,1);
			}
		else {
			count.put(EnergyType.LEAF, count.get(EnergyType.LEAF)+1);
			}
		}
	
	public void AddFireEnergy() {
		if (!count.containsKey(EnergyType.FIRE)) {
			count.put(EnergyType.FIRE,1);
			}
		else {
			count.put(EnergyType.FIRE, count.get(EnergyType.FIRE)+1);
			}
		}
	
	public void AddWaterEnergy() {
		if (!count.containsKey(EnergyType.WATER)) {
			count.put(EnergyType.WATER,1);
			}
		else {
			count.put(EnergyType.WATER, count.get(EnergyType.WATER)+1);
			}
		}
	
	public void AddPsiEnergy() {
		if (!count.containsKey(EnergyType.PSI)) {
			count.put(EnergyType.PSI,1);
			}
		else {
			count.put(EnergyType.PSI, count.get(EnergyType.PSI)+1);
			}
		}
	
	public void AddThunderEnergy() {
		if (!count.containsKey(EnergyType.THUNDER)) {
			count.put(EnergyType.THUNDER,1);
			}
		else {
			count.put(EnergyType.THUNDER, count.get(EnergyType.THUNDER)+1);
			}
		}
	
	public void AddFightEnergy() {
		if (!count.containsKey(EnergyType.FIGHT)) {
			count.put(EnergyType.FIGHT,1);
			}
		else {
			count.put(EnergyType.FIGHT, count.get(EnergyType.FIGHT)+1);
			}
		}
	
	/**
	 * Getter for a specific counter
	 * @param e Energy Type
	 * @return Number of energy cards of that type currently stored
	 */
	public Integer getval(EnergyType e) {
		return count.get(e);
		}
	
	/**
	 * Getter for keys currently being used by the hashmap
	 * @return Array of keys
	 */
	public EnergyType[] getKeys() {
		Set<EnergyType> set= count.keySet();
		return set.toArray(new EnergyType[set.size()]);
		}
	
	/**
	 * Given a skill, this object will compare the cost of the ability
	 * and the number of energy cards currently being stored. Returns
	 * false if there are not enough number of energy cards 
	 * to execute the given skill.
	 * @param skill Skill to be evaluated
	 * @return boolean
	 */
	public boolean evalCost(Ability skill) {
		Ledger cost = skill.getCost();
		EnergyType[] keys = cost.getKeys();
		
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