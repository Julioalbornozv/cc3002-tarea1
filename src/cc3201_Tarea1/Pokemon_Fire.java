package cc3201_Tarea1;

public class Pokemon_Fire extends Abs_Pokemon{
	public Pokemon_Fire(int id, int hp, Ability[] skills) {
		super(id,hp,skills);
		}
	
	public void attack(Attack att, Pokemon enemy) {
		enemy.recieveFireDmg(att);
		}
	
	@Override
	public void recieveWaterDmg(Attack att) {
		weaknessDmg(att.getDmg());
		}
	}
