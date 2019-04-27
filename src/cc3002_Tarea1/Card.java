package cc3002_Tarea1;

/**
 * Basic Interface for generic cards
 * 
 * @author Julio Albornoz Valencia
 */
public interface Card {
	/**
	 * Getter for a card name
	 * @return Name of card
	 */
	public String getName();
	public void beingPlayedBy(ITrainer player);
	}
