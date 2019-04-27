package cc3002_Tarea1;

/**
 * Standard Trainer
 * 
 * @author Julio Albornoz Valencia
 */
public class Trainer extends AbsTrainer{
	public Trainer() {}	

	/**
	 * Creates a new trainer with a starter pokemon
	 * @param starter
	 */
	public Trainer(Pokemon starter, Card ...cards) {
		super(starter, cards);
		}
	}
