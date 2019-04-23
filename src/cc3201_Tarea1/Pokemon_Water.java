package cc3201_Tarea1;

public class Pokemon_Water extends Abs_Pokemon{
	public Pokemon_Water(int id, int hp, Ability[] skills) {
		super(id,hp,skills);
		}
	
	public void attack(Attack att, Pokemon enemy) {
		enemy.recieveWaterDmg(att);
		}
	
	@Override
	public void recieveLeafDmg(Attack att) {
		weaknessDmg(att.getDmg());
		}
	public void recieveThunderDmg(Attack att) {
		weaknessDmg(att.getDmg());
		}
	@Override
	public void recieveFightDmg(Attack att) {
		resistDmg(att.getDmg());
		}
	}

