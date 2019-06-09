package cc3002_Tarea1;

/**
 * Class for Psi Energy cards
 * 
 * @author Julio Albornoz Valencia
 */
public class Energy_Psi extends Abs_Energy{
	
	public Energy_Psi(String name) {
		super(name);
		}
	
	@Override
	public int getKey() {
		return 3;
		}
	
	@Override
	public void AddTo(Ledger p) {
		p.AddPsiEnergy();
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
