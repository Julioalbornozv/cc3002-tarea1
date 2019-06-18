package cc3002_Tarea1;

/**
 * Class which encodes the effect of an Ability or a Trainer Card, uses visitor to 
 * disambiguate between card types and reacts depending on the card being applied to 
 * @author Julio Albornoz Valencia
 */
public abstract class Effect implements Visitor{
	private boolean turn_limit = false; //Turn restriction limited to n or once per turn
	
	/**
	 * Empty Effect
	 */
	
	public Effect() {}
	
	/**
	 * Sets a turn limitation (Currently once per turn (limit = True) or no limits
	 * @param limit bool
	 */
	public Effect(boolean limit) {
		this.turn_limit = limit;
		}
	
	/**
	 * Execute the stored instructions of this card directly to the game
	 * @param m Judge object from the current match
	 */
	public abstract void execute(Judge m);
	
	/**
	 * Executes the effects of this class depending on the type 
	 * @param m
	 * @param card
	 */
	public abstract void executeOver(Judge m, ICard card);
	
	@Override
	public void visitEnergy(IEnergy e) {}
	
	@Override
	public void visitBasicPokemon() {}

	@Override
	public void visitS1_Pokemon() {}

	@Override
	public void visitS2_Pokemon() {}

	@Override
	public void visitStadium(Stadium t) {}

	@Override
	public void visitSupport(Support s) {}

	@Override
	public void visitItem(Item I) {}
	
	/**
	 * Getter for turn limit
	 * @return bool
	 */
	public boolean getLimit() {
		return turn_limit;
		}
	}