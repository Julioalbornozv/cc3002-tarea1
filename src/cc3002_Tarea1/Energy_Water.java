package cc3002_Tarea1;

public class Energy_Water extends Abs_Energy{
	
	public Energy_Water(String name) {
		super(name);
		this.idE = 5;
		}
	
	/**
	 * Checks if this Water Energy is equal to another
	 * @param obj Object being compared
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Energy_Water && super.equals(obj);
		}	
	}
