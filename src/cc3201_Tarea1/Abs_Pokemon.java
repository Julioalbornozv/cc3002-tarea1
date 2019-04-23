package cc3201_Tarea1;

import java.util.HashMap;

public abstract class Abs_Pokemon implements Pokemon{
	private int id;
	private int hp;
	private Ability[] skillset = new Ability[4];
	private HashMap<Energy, Integer> power = new HashMap<>();
	
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
		
	public boolean checkCost(Abs_Attack att) {
		Pair[] cost = att.getCost();
		for (int i = 0; i < cost.length; i++) {
			if (power.get(cost[i].type) < cost[i].ammount) {
				return false;
				}
			}
		return true;
		}
	
	public void deactivate(Trainer owner) {
		owner.setActive();
		}
	
	public void charge(Energy e) {
		if (!power.containsKey(e)) {
			power.put(e,1);
			}
		else {
			power.put(e, power.get(e) + 1);
			}
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
