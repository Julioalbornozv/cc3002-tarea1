package cc3002_Tarea1;

import java.util.List;

public interface ITrainer {
	/**
	 * Common Interface for trainer objects. Trainers have
	 * a hand of available cards, an active pokemon which
	 * can receive commands and a reserve of a maximum of
	 * 5 pokemons which replace the active pokemon when defeated.
	 * 
	 * @author Julio Albornoz Valencia
	 */
	
	/**
	 * Places a specific pokemon on the reserve (Usually from the hand)
	 * 
	 * @param pk Pokemon to be placed
	 */
	public void play(Pokemon pk);
	
	/**
	 * Uses an attack against the active pokemon of the enemy player
	 * 
	 * @param a Attack to be used
	 * @param opp Opponent with an active pokemon
	 */
	public void select(Attack a, Trainer opp);
	
	/**
	 * Equips an energy card to the active pokemon
	 * @param e
	 */
	public void equip(Energy e);
	
	/**
	 * Checks if the active pokemon has been defeated, invoked
	 * by a trainer after an attack to message the opponent.
	 * Acts as a proxy to private method setActive().
	 */
	public void checkActive();
	
	/**
	 * Getter for the active pokemon
	 * 
	 * @return Active Pokemon
	 */
	public Pokemon getActive();
	
	/**
	 * Getter for the active pokemon
	 * 
	 * @return Active Pokemon
	 */
	public List<Card> getHand();
	}
