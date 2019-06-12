package cc3002_Tarea1;

/**
 * Basic Interface for generic cards
 * 
 * @author Julio Albornoz Valencia
 */
public interface ICard {
	/**
	 * Getter for a card name
	 * @return Name of card
	 */
	public String getName();
	
	/**
	 * This method defines how each card type has to
	 * be handled by the trainer.
	 * @param player Trainer playing the card
	 */
	public void beingPlayedBy(ITrainer player);
	}
