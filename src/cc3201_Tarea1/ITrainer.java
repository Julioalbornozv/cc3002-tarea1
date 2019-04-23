package cc3201_Tarea1;

public interface ITrainer {
	public void setActive();
	public void play(Pokemon p);
	public void select(Attack a, Abs_Pokemon enemy);
	public void equip(Energy e);
}
