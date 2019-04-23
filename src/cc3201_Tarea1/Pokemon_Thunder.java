package cc3201_Tarea1;

public class Pokemon_Thunder extends Abs_Pokemon{
	public Pokemon_Thunder(int id, int hp, Ability[] skills) {
		super(id,hp,skills);
		}
	
	public void attack(Attack att, Pokemon enemy) {
		enemy.recieveThunderDmg(att);
		}
	
	@Override
	public void recieveFightDmg(Attack att) {
		weaknessDmg(att.getDmg());
		}
}
