package cc3002_Tarea1;

public abstract class Abs_Energy implements Energy, Card{
	private String name;
	protected int idE;
	public Abs_Energy(String name) {
		this.name = name;
		}
	
	@Override
	public String getName() {
		return name;	
		}
	
	@Override
	public int getKey() {
		return idE;
		}
	
	/**
	 * Checks if this Energy Card is equal to another
	 * @param obj Object being compared
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Energy 
				&& ((Energy)obj).getKey() == this.idE;
		}
	}
