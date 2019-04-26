package cc3002_Tarea1;


public abstract class Abs_Attack implements Ability {
	private String name;
	private String description;
	private Ledger cost;
	private int dmg;
	
	public Abs_Attack(String name, String desc, Ledger cost, int dmg) {
		this.name = name;
		this.description = desc;
		this.cost = cost;
		this.dmg = dmg;
	}
	public String getDescription() {
		return description;
		}
	public String getName() {	
		return name;
		}
	public Ledger getCost() {
		return cost;
		}
	public int getDmg() {
		return dmg;
	}
}
