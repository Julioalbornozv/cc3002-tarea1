package cc3002_Tarea1;

public interface ITrainer {
	public void setActive();
	public void play(Pokemon p);
	public void select(Attack a, Pokemon enemy);
	public void equip(Energy e);
	public Pokemon getActive();
}
