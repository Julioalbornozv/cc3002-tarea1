package cc3002_Tarea1;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Base class for trainer objects, this objects are used by
 * the players to interact with the game. 
 * Contains methods to interact with the active pokemon.
 * 
 * @author Julio Albornoz Valencia
*/

public abstract class AbsTrainer implements ITrainer{
	
	private Pokemon active;
	private Queue<Pokemon> reserve = new LinkedList<>();
	private List<Card> hand = new LinkedList<>();
	
	/** 
	 * Creates a new Trainer with an active pokemon and
	 * an indeterminate number of cards on its hand
	 * @param starter: active pokemon to be indexed
	 * @param roll: Number of cards to be given at the start
	 */
	protected AbsTrainer(Pokemon starter, Card ... roll) { 
		this.active = starter;
		for (Card c : roll) {
			this.hand.add(c);
			}
		}

	/**
	 * Creates an empty Trainer
	 */
	protected AbsTrainer() {}	
	
	/**
	 * Private Setter
	 * Replaces the active pokemon with the first pokemon
	 * from the reserve queue. This method should not be
	 * accessible by other players.
	 */
	private void setActive() { 
		if (reserve.peek() == null) {	// No more bench pokemons
			this.active = null;
			return;	
			}
		this.active = reserve.poll();	
		}
	
	@Override
	public void addToBench(Pokemon p) {
		if (reserve.isEmpty() || reserve.size() < 5) {	//Full bench
			this.reserve.add(p);
			}
		}
	
	@Override
	public void play(Card card) {
		if (hand.indexOf(card) != -1) { //Removes from hand
			hand.remove(card);
			}
		card.beingPlayedBy(this);
		}
	

	@Override
	public void checkActive() {
		if (active.getHP() <= 0) {
			setActive();
			}
		}
	
	@Override
	public void select(Attack att, Trainer opponent) {
		Pokemon enemy = opponent.getActive();
		this.active.attack(att, enemy);
		opponent.checkActive();
		
		}
	
	@Override
	public Pokemon getActive() {
		return this.active;
		}
	
	@Override
	public List<Card> getHand(){
		return hand;
		}
}
