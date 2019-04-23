package cc3201_Tarea1;

public interface Pokemon {  //TODO: Set up permissions correctly
	public int getHP();
	public Ability[] getSkillset();
	public void attack(Attack att, Pokemon enemy);
	public boolean checkCost(Abs_Attack att);
	public void deactivate(Trainer owner);
	public void charge(Energy energy);
	public void recieveFireDmg(Attack chosen);
	public void recieveWaterDmg(Attack chosen);
	public void recieveLeafDmg(Attack chosen);
	public void recieveFightDmg(Attack chosen);
	public void recieveThunderDmg(Attack chosen);
	public void recievePsiDmg(Attack chosen);
	public void normalDmg(int dmg);
	public void weaknessDmg(int dmg);
	public void resistDmg(int dmg);
}
