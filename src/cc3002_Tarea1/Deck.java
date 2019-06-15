package cc3002_Tarea1;

import java.util.Stack;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Deck {
	private Stack<ICard> deck = new Stack<ICard>();
	
	public Deck() {};
	
	public void add(ICard ... cards) {
		for (ICard c : cards) {
			if (deck.size() == 60) { // Too much cards
				break;
				}
			deck.push(c);
			}
		}
	
	public ICard[] draw(int n) {
		List<ICard> buffer = new ArrayList<ICard>();
		while(n != 0 && !deck.empty()) {
			buffer.add(deck.pop());
			n--;
			}
		
		return buffer.toArray(new ICard[buffer.size()]);
		}
	
	public ICard[] drawLast(int n) {
		Collections.reverse(deck);
		ICard[] ret = this.draw(n);
		Collections.reverse(deck);
		return ret;
		}
	
	
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
		
	public void shuffle() {
		Collections.shuffle(deck);
		}
	
	public int size() {
		return deck.size();
		}
	
	public boolean contains(ICard c) {
		return deck.contains(c);
		}
	public boolean isEmpty() {
		return deck.isEmpty();
		}
	public ICard peek() {
		return deck.peek();
		}
	}
