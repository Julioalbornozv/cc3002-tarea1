package cc3002_Tarea1;
/**
 * Observer Interface, used by the Judge class to receive notifications of the game current state
 * @author Julio Albornoz Valencia
 *
 */

public interface IObserver {
	/**
	 * Replaces current stadium with a new one
	 * @param s New stadium
	 */
	void update_Stadium(Stadium s);
	
	/**
	 * This method is called when a player play a specific card from its hand, checks if this card will
	 * be affected by the effect of a stadium or a pssive effect.
	 * @param card Card currently being played
	 */
	void notifyCard(ICard card);
	
	/**
	 * This method is called when a player selects a standard ability from its active pokemon, 
	 * checks if its a passive effect, if it is and its the first time being played, the effect 
	 * is stored in the turn_limit list, otherwise the effect will be already registered and 
	 * will be ignored.
	 * @param sk Skill selected by the user
	 */
	void notifySelection(IAbility sk);
	
	/**
	 * This method is called after a player attacks another player, it first applies the effect
	 * of the attack and then proceeds to invoke the methods used during an attack, after that
	 * it checks if the defendant pokemon is defeated in which case it will reward a prize
	 * card to the trainer who called this method. After this it will reset the turn_limit list, 
	 * will swap the roles of the trainers and will give the card to the new active trainer
	 * at the start of his turn.
	 * @param attack Attack being executed
	 */
	void notifyAttack(Attack attack);
	
	/**
	 * This methos is called after a player uses an energy, in which case it verifies if the player
	 * is allowed to do so in the first place.
	 * @return
	 */
	int notifyEnergy();	
	
	/**
	 * Method called when a player skips its turn (Used in testing)
	 */
	void notifySkip();
	
	/**
	 * Executes intant effect
	 * @param effect
	 */
	void instant_effect(Effect effect);

	/**
	 * Register dormant effect
	 * @param eff
	 */
	void dormant_effect(Effect eff);
	}
