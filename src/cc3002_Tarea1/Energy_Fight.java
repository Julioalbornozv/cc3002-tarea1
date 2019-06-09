package cc3002_Tarea1;

/**
 * Class for Fight Energy cards
 * 
 * @author Julio Albornoz Valencia
 */
public class Energy_Fight extends Abs_Energy{
	
	public Energy_Fight(String name) {
		super(name);
		}
	
	@Override
	public int getKey() {
		return 0;
		}
	
	@Override
	public void AddTo(Ledger p) {
		p.AddFightEnergy();
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
