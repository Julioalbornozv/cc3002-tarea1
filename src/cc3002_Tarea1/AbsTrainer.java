package cc3002_Tarea1;
import java.util.LinkedList;
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
	private Card[] hand;
	
	/** 
	 * Creates a new Trainer with an active pokemon.
	 * @param starter: active pokemon to be indexed
	 */
	protected AbsTrainer(Pokemon starter) { 
		this.active = starter;
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
			return;	
			}
		this.active = reserve.poll();	
		}
	
	@Override
	public void play(Pokemon p) {
		if (reserve.isEmpty() || reserve.size() < 5) {	//Full bench
			this.reserve.add(p);	
			}
		}
	
	@Override
	public void equip(Energy e) {
		active.associate(e);
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
}
