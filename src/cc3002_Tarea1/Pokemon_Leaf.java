package cc3002_Tarea1;

public class Pokemon_Leaf extends Abs_Pokemon{
	public Pokemon_Leaf(int id, int hp, Ability[] skills) {
		super(id,hp,skills);
		}
	
	public void fight(Attack att, Pokemon enemy) {
		enemy.recieveLeafDmg(att);
		}
	
	@Override
	public void recieveFireDmg(Attack att) {
		weaknessDmg(att.getDmg());
		}
	@Override
	public void recieveWaterDmg(Attack att) {
		resistDmg(att.getDmg());
		}
	}
