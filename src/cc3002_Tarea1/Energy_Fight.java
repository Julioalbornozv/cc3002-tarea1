package cc3002_Tarea1;

public class Energy_Fight extends Abs_Energy{
	
	public Energy_Fight(String name) {
		super(name);
		this.idE = 0;	
		}
	/**
	 * Checks if this Fight Energy is equal to another
	 * @param obj Object being compared
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Energy_Fight && super.equals(obj);
		}
	}
