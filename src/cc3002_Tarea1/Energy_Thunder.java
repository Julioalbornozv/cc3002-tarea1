package cc3002_Tarea1;

public class Energy_Thunder extends Abs_Energy{
	
	public Energy_Thunder(String name) {
		super(name);
		this.idE = 4;
		}
	
	/**
	 * Checks if this Thunder Energy is equal to another
	 * @param obj Object being compared
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Energy_Thunder && super.equals(obj);
		}
	}
