package cc3002_Tarea1;

public interface ITrainer {
	public void play(Pokemon p);
	public void select(Attack a, Trainer opp);
	public void equip(Energy e);
	public Pokemon getActive();
}
