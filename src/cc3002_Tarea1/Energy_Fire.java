package cc3002_Tarea1;

public class Energy_Fire extends Abs_Energy{
	
	public Energy_Fire(String name) {
		super(name);
		this.idE = 1;
		}
	
	/**
	 * Checks if this Fire Energy is equal to another
	 * @param obj Object being compared
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Energy_Fire && super.equals(obj);
		}
	
}
