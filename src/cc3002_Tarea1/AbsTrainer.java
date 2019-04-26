package cc3002_Tarea1;
import java.util.LinkedList;
import java.util.Queue;

public abstract class AbsTrainer implements ITrainer{
	private Pokemon active;
	private Queue<Pokemon> reserve = new LinkedList<>();
	private Card[] hand;
	
	public AbsTrainer() {}		

	public void setActive() {
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
	public void select(Attack att, Pokemon enemy) {
		this.active.attack(att, enemy);
		}
	public Pokemon getActive() {
		return this.active;
		}
}
