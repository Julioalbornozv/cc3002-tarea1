package cc3002_Tarea1;

/**
 * Interface for energy class, this card only contains a non-unique name
 * 
 * @author Julio Albonroz Valencia
 */
public interface Energy extends Card{
	/**
	 * This method will return a hash key used by the Ledger for storage
	 * purposes, each new class type must have its own key to differentiate
	 * from another types.
	 * 
	 * The ideal setup should be that the energy class generated a unique 
	 * hash code by itself based on a unique field (Current energy implementations
	 * only have a non-unique name.), so future energy types won't need to
	 * hardcode a hashkey on their own.
	 * 
	 * @return int Hash key used by Ledger
	 */
	int getKey();
}
