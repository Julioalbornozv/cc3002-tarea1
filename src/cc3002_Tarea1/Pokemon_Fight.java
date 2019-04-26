package cc3002_Tarea1;

public class Pokemon_Fight extends Abs_Pokemon{
	public Pokemon_Fight(int id, int hp, Ability[] skills) {
		super(id,hp,skills);
		}
	
	public void fight(Attack att, Pokemon enemy) {
		enemy.recieveFightDmg(att);
		}
	
	@Override
	public void recievePsiDmg(Attack att) {
		weaknessDmg(att.getDmg());
		}
	@Override
	public void recieveLeafDmg(Attack att) {
		weaknessDmg(att.getDmg());
		}
}
