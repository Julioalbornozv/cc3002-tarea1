package cc3002_Tarea1;

/**
 * Standard Trainer
 * 
 * @author Julio Albornoz Valencia
 */
public class Trainer extends Abs_Trainer{
	public Trainer() {}	

	/**
	 * Creates a new trainer with a starter pokemon
	 * @param starter
	 */
	public Trainer(IPokemon starter, ICard ...cards) {
		super(starter, cards);
		}
	
	@Override
	public void notifyObserver() {
		
		}
	}
