package cc3002_Tarea1;

/**
 * Class used to represent a stack of cards, used as a deck and a cemetery
 * @author Julio Albornoz Valencia
 */
import java.util.Stack;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Deck {
	private Stack<ICard> deck = new Stack<ICard>();
	
	/**
	 * Creates empty Deck
	 */
	public Deck() {};
	
	/**
	 * Adds the given cards to the deck, has a limit of 60 cards per deck
	 * @param cards
	 */
	public void add(ICard ... cards) {
		for (ICard c : cards) {
			if (deck.size() == 60) { // Too much cards
				break;
				}
			deck.push(c);
			}
		}
	
	/**
	 * Take a specific number of cards from the deck
	 * @param n Number of cards to take
	 * @return Array of cards
	 */
	public ICard[] draw(int n) {
		List<ICard> buffer = new ArrayList<ICard>();
		while(n != 0 && !deck.empty()) {
			buffer.add(deck.pop());
			n--;
			}
		
		return buffer.toArray(new ICard[buffer.size()]);
		}
	
	/**
	 * Take a specific number of cards from the end of the deck
	 * @param n Number of cards to rake
	 * @return Array of cards
	 */
	public ICard[] drawLast(int n) {
		Collections.reverse(deck);
		ICard[] ret = this.draw(n);
		Collections.reverse(deck);
		return ret;
		}
	
	
	/**
	 * Searches for a specific card inside a deck and removes n instances from it
	 * @param target Card to be extracted
	 * @param n Numbre of cards to remove from the deck
	 * @return Array of cards
	 */
	public ICard[] extract(ICard target, int n) {
		List<ICard> ret = new ArrayList<ICard>();
		Stack<ICard> aux = new Stack<ICard>();
		while (n != 0) {
			int index = deck.search(target);
			if (index == -1) {
				break;	
				}
			while(index != 1) {
				aux.push(deck.pop());
				index--;
				}
			ret.add(deck.pop());
			n--;
			}
		// Return taken cards to the deck
		while (!aux.empty()) {
			deck.push(aux.pop());
			}
		return ret.toArray(new ICard[ret.size()]);
		}
		
	/**
	 * Shuffles deck
	 */
	public void shuffle() {
		Collections.shuffle(deck);
		}
	
	/**
	 * Return current size of the deck
	 * @return size
	 */
	public int size() {
		return deck.size();
		}
	
	/**
	 * Verifies if a card is present inside the deck
	 * @param c Card to be searched
	 * @return True if found
	 */
	public boolean contains(ICard c) {
		return deck.contains(c);
		}
	
	/**
	 * Checks if deck is empty
	 * @return True if empty
	 */
	public boolean isEmpty() {
		return deck.isEmpty();
		}
	
	/**
	 * Looks at the first card on the deck but doesn't remove it
	 * @return card at the top of the stack
	 */
	public ICard peek() {
		return deck.peek();
		}
	}
