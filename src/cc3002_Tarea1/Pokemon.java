package cc3002_Tarea1;

public interface Pokemon {  //TODO: Set up permissions correctly
	public int getHP();
	public Ability[] getSkillset();
	public void attack(Attack att, Pokemon enemy);
	public void fight(Attack att, Pokemon enemy);
	public void deactivate(Trainer owner);
	public void associate(Energy energy);
	public void normalDmg(int dmg);
	public void weaknessDmg(int dmg);
	public void resistDmg(int dmg);
	public void recieveFireDmg(Attack chosen);
	public void recieveWaterDmg(Attack chosen);
	public void recieveLeafDmg(Attack chosen);
	public void recieveFightDmg(Attack chosen);
	public void recieveThunderDmg(Attack chosen);
	public void recievePsiDmg(Attack chosen);
}
