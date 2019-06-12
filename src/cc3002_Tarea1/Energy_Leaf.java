package cc3002_Tarea1;

/**
 * Class for Leaf Energy cards
 * 
 * @author Julio Albornoz Valencia
 */
public class Energy_Leaf extends Abs_Energy {
	
	public Energy_Leaf(String name) {
		super(name);
		}
	
	@Override
	public void AddTo(Ledger p) {
		p.AddLeafEnergy();
		}
	/**
	 * Checks if this Leaf Energy is equal to another
	 * @param obj Object being compared
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Energy_Leaf && super.equals(obj);
		}
	}
