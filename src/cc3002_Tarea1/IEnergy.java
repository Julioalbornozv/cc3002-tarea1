package cc3002_Tarea1;

/**
 * Interface for energy class, this card only contains a non-unique name
 * 
 * @author Julio Albonroz Valencia
 */
public interface IEnergy extends ICard{
	
	/**
	 * Each energy will tell the Ledger how it should handle them
	 * @param b
	 */
	void AddTo(Ledger b);
}
