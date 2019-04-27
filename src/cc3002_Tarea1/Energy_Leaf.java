package cc3002_Tarea1;

public class Energy_Leaf extends Abs_Energy {
	
	public Energy_Leaf(String name) {
		super(name);
		this.idE = 2;
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
