package cc3002_Tarea1;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Base class for trainer objects, this objects are used by
 * the players to interact with the game. 
 * Contains methods to interact with the active pokemon.
 * 
 * @author Julio Albornoz Valencia
*/

public abstract class Abs_Trainer implements ITrainer, ISubject{
	
	private IPokemon active;
	private IPokemon selected;
	private Queue<IPokemon> reserve = new LinkedList<>();
	private Queue<ICard> prize = new LinkedList<>();
	private List<ICard> hand = new LinkedList<>();
	private Deck cemetery = new Deck();
	private Deck deck = new Deck();
	private IObserver judge;
	/** 
	 * Creates a new Trainer with an active pokemon and
	 * an indeterminate number of cards on its hand
	 * @param starter: active pokemon to be indexed
	 * @param roll: Number of cards to be given at the start
	 */
	protected Abs_Trainer(IPokemon starter, ICard ... roll) { 
		this.active = starter;
		for (ICard c : roll) {
			this.hand.add(c);
			}
		}

	/**
	 * Creates an empty Trainer
	 */
	protected Abs_Trainer() {}	
	
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
	public void addToBench(IPokemon p) {
		if (reserve.isEmpty() || reserve.size() < 5) {	//Full bench
			this.reserve.add(p);
			}
		}
	
	@Override
	public void play(ICard card) {
		if (hand.indexOf(card) != -1) { //Removes from hand
			hand.remove(card);
			}
		judge.notifyCard(card);
		}
	

	@Override
	public void checkActive() {
		if (active.getHP() <= 0) {
			setActive();
			}
		}
	
	@Override
	public void select(IAbility skill) {
		skill.notify(judge);
		}
		
	@Override
	public void discard(ICard card) {
		cemetery.add(card);
		}
	
	@Override
	public IPokemon getActive() {
		return this.active;
		}
	
	@Override
	public List<ICard> getHand(){
		return hand;
		}
	
	@Override 
	public void setCurrent(IPokemon p) {
		this.selected = p;
		}
	
	@Override
	public IPokemon getCurrent() {
		return selected;
		}
	
	@Override
	public Deck getDeck() {
		return deck;
		}
	
	@Override
	public Deck getCemetery() {
		return cemetery;
		}
	
	@Override
	public IObserver getObs() {
		return this.judge;
		}

	@Override
	public void registerObserver(IObserver m) {
		this.judge = m;
		}
	
	@Override
	public void pass() {
		judge.notifySkip();
		}
	}
