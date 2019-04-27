package cc3002_Tarea1;

public class Energy_Psi extends Abs_Energy{
	
	public Energy_Psi(String name) {
		super(name);
		this.idE = 3;
		}
	
	/**
	 * Checks if this Psychic Energy is equal to another
	 * @param obj Object being compared
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Energy_Psi && super.equals(obj);
		}
	}
