package cc3002_Tarea1;

import java.util.List;

/**
 * Common Interface for trainer objects. Trainers have
 * a hand of available cards, an active pokemon which
 * can receive commands and a reserve of a maximum of
 * 5 pokemons which replace the active pokemon when defeated.
 * 
 * @author Julio Albornoz Valencia
 */
public interface ITrainer {
	
	/**
	 * Plays a card
	 * 
	 * @param c Card to be played
	 */
	public void play(ICard x);
	
	/**
	 * Uses an attack against the active pokemon of the enemy player
	 * 
	 * @param a Attack to be used
	 * @param opp Opponent with an active pokemon
	 */
	public void select(Attack a, Trainer opp);
	
	
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
	public IPokemon getActive();
	
	/**
	 * Getter for the active pokemon
	 * 
	 * @return Active Pokemon
	 */
	public List<ICard> getHand();

	/**
	 * Adds pokemon to the bench
	 * @param p
	 */
	void addToBench(IPokemon p);
	}
