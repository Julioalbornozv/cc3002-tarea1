package cc3002_Tarea1;

public abstract class Abs_Energy implements IEnergy{
	private String name;
	
	/**
	 * Energy constructor
	 * @param name Energy name
	 */
	public Abs_Energy(String name) {
		this.name = name;
		}
	
	@Override
	public String getName() {
		return name;	
		}

	@Override 
	public void beingPlayedBy(ITrainer player) {
		if (player.getObs().notifyEnergy() == 0) {
			IPokemon current = player.getCurrent(); 
			current.associate(this);
			}
		}
	
	@Override 
	public void accept(Visitor m){
		m.visitEnergy(this);
		}
	
	/**
	 * Checks if this Energy Card is equal to another
	 * @param obj Object being compared
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		return obj instanceof IEnergy;
		}
	}
