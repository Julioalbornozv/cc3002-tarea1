package cc3002_Tarea1;

public interface Visitor {
	/**
	 * Visitor methods, react depending on the card being used, implementation varies between
	 * cards
	 */
	
	public void visitEnergy(IEnergy e);
	public void visitBasicPokemon();
	public void visitS1_Pokemon();
	public void visitS2_Pokemon();
	public void visitStadium(Stadium t);
	public void visitSupport(Support s);
	public void visitItem(Item item);
	}
