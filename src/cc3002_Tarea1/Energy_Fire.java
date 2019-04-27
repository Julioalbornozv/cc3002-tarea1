package cc3002_Tarea1;

/**
 * Class for Fire Energy cards
 * 
 * @author Julio Albornoz Valencia
 */
public class Energy_Fire extends Abs_Energy{
	
	public Energy_Fire(String name) {
		super(name);
		}
	
	@Override
	public int getKey() {
		return 1;
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
