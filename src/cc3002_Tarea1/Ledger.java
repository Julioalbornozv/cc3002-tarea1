package cc3002_Tarea1;

import java.util.HashMap;
import java.util.Set;
public class Ledger {
	private HashMap<Integer, Integer>  count = new HashMap<>();
	
	public Ledger() {}
		
	public Ledger(Energy ... eSet) {
		for (Energy header : eSet) {
			this.add(header.getKey());
			}
		}

	public void add(int k) {
		if (!count.containsKey(k)) {
			count.put(k,1);
			}
		else {
			count.put(k, count.get(k)+1);
			}
		}
	public Integer getval(Integer k) {
		return count.get(k);
		}
	
	public Integer[] getKeys() {
		Set<Integer> set= count.keySet();
		return set.toArray(new Integer[set.size()]);
		}
	
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
	}