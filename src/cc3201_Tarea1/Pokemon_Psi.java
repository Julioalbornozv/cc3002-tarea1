package cc3201_Tarea1;

public class Pokemon_Psi extends Abs_Pokemon{
	public Pokemon_Psi(int id, int hp, Ability[] skills) {
		super(id,hp,skills);
		}
	
	public void attack(Attack att, Pokemon enemy) {
		enemy.recievePsiDmg(att);
		}
	
	@Override
	public void recievePsiDmg(Attack att) {
		weaknessDmg(att.getDmg());
		}
	@Override
	public void recieveFightDmg(Attack att) {
		resistDmg(att.getDmg());
		}
}
