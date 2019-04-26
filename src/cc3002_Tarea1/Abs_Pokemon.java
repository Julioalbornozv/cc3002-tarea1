package cc3002_Tarea1;

public abstract class Abs_Pokemon implements Pokemon{
	private int id;
	private int hp;
	private Ability[] skillset = new Ability[4];
	private Ledger power = new Ledger();
	
	public Abs_Pokemon(int id, int hp, Ability[] skills) {
		this.id = id;
		this.hp = hp;
		this.skillset = skills;
		}	
	
	public int getHP() {
		return hp;
		}
	
	public Ability[] getSkillset(){
		return skillset;
		}
	
	public void attack(Attack skill, Pokemon enemy) {
		if (power.evalCost(skill)) {
			this.fight(skill, enemy);
			}	
		}
	
	public void associate(Energy e) {
		power.add(e.getKey());
		}
	
	public void recieveFireDmg(Attack att) {
		normalDmg(att.getDmg());
		}
	
	public void recieveWaterDmg(Attack att) {
		normalDmg(att.getDmg());
		}
	
	public void recieveLeafDmg(Attack att) {
		normalDmg(att.getDmg());
		}
	
	public void recieveFightDmg(Attack att) {
		normalDmg(att.getDmg());
		}
	
	public void recieveThunderDmg(Attack att) {
		normalDmg(att.getDmg());
		}
	
	public void recievePsiDmg(Attack att) {
		normalDmg(att.getDmg());
		}
	
	public void normalDmg(int dmg) {
		this.hp -= dmg;
		}
	public void weaknessDmg(int dmg) {
		this.hp -= dmg*2;
		}
	public void resistDmg(int dmg) {
		this.hp -= (dmg-30);
	}
}
