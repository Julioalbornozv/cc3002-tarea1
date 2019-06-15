package cc3002_Tarea1;

public interface Visitor {
	/* Visitor interface*/
	public void visitEnergy(IEnergy e);
	public void visitBasicPokemon();
	public void visitS1_Pokemon();
	public void visitS2_Pokemon();
	public void visitStadium(Stadium t);
	public void visitSupport(Support s);
	}
