package cc3002_Tarea1;
import java.util.LinkedList;
import java.util.Queue;

public abstract class AbsTrainer implements ITrainer{
	private Pokemon active;
	private Queue<Pokemon> reserve = new LinkedList<>();
	private Card[] hand;
	
	// Empty Trainer
	public AbsTrainer() {}	
	
	// Trainer generated with an active pokemon
	public AbsTrainer(Pokemon starter) { 
		this.active = starter;
		}

	private void setActive() { 
		if (reserve.peek() == null) {	// No more bench pokemons
			return;	
			}
		this.active = reserve.poll();	
		}
	public void play(Pokemon p) {
		if (reserve.isEmpty() || reserve.size() < 5) {	//Full bench
			this.reserve.add(p);	
			}
		}
	public void equip(Energy e) {
		active.associate(e);
		}
	
	public void checkActive() {
		if (active.getHP() <= 0) {
			setActive();
			}
		}
	public void select(Attack att, Trainer opponent) {
		Pokemon enemy = opponent.getActive();
		this.active.attack(att, enemy);
		opponent.checkActive();
		
		}
	public Pokemon getActive() {
		return this.active;
		}
}
