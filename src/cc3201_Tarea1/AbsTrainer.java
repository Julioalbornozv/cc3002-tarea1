package cc3201_Tarea1;
import java.util.LinkedList;
import java.util.Queue;

public abstract class AbsTrainer implements ITrainer{
	private Pokemon active;
	private Queue<Pokemon> reserve = new LinkedList<>();
	private Card[] hand;
	
	public void setActive() {
		if (reserve.peek() == null) {	// No more bench pokemons
			return;	
			}
		this.active = reserve.poll();	
		}
	public void play(Pokemon p) {
		if (reserve.size() == 5) {	//Full bench
			return;	
			}
		this.reserve.add(p);
		}
	public void equip(Energy e) {
		this.active.charge(e);
		}
	public void select(Attack att, Abs_Pokemon enemy) {
		this.active.attack(att, enemy);
		}
}
