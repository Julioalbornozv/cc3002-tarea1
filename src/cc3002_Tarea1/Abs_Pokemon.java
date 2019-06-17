package cc3002_Tarea1;

import java.util.LinkedList;
import java.util.List;

/**
 * Base class for all Pokemons, contain implementations for getters
 * methods defined by IPokemon and includes methods required
 * to execute attacks.
 * 
 * @author Julio Albornoz Valencia
 */
public abstract class Abs_Pokemon implements IPokemon{
	private int id;
	private int hp;
	private int wounds = 0;
	private String name;
	private Item modifier = null;
	private List<IAbility> skillset = new LinkedList<>();
	protected Ledger power = new Ledger();
	
	/**
	 * Creates a generic Pokemon, starting with no energy cards
	 * associated
	 * @param id Pokemon id
	 * @param name Pokemon name
	 * @param hp Pokemon hp
	 * @param skills Pokemon skills
	 */

	protected Abs_Pokemon(int id,String name, int hp, IAbility ... skills) {
		this.id = id;
		this.name = name;
		this.hp = hp;
		for (IAbility sk : skills) {
			if (skillset.size() < 4) { // 4 skill restriction
				skillset.add(sk);
				}
			}
		}
	
	@Override
	public int getHP() {
		return hp - wounds*10;
		}
	
	@Override
	public int getWound() {
		return wounds;
		}
	
	@Override
	public int getID() {
		return id;
		}
	
	
	@Override
	public List<IAbility> getSkillset(){
		return skillset;
		}
	
	@Override
	public String getName() {
		return name;
		}
	/**
	 * Attack command, this method is overriden by each 
	 * pokemon type to specify the damage type they inflict 
	 * to an enemy
	 * @param att Attack to be used
	 * @param enemy Enemy pokemon to be attacked
	 */
	protected abstract void fight (Attack skill, IPokemon enemy);
	
	@Override
	public void beingPlayedBy(ITrainer player){
		player.addToBench(this);
		}
	
	@Override
	public void attack(Attack skill, IPokemon enemy) {
		if (power.evalCost(skill)) {
			this.fight(skill, enemy);
			}	
		}	
	
	@Override
	public void associate(IEnergy e) {
		e.AddTo(power);
		}
	
	/**
	 * Base damage with no modifiers
	 * @param dmg Base damage
	 */
	@Override
	public void normalDmg(int dmg) {
		this.wounds += dmg;
		}

	/**
	 * Base Damage doubled if this pokemon is weak to the enemy 
	 * pokemon attacks.
	 * @param dmg Base damage
	 */
	protected void weaknessDmg(int dmg) {
		this.wounds += dmg*2;
		}
	
	/**
	 * Base Damage reduced by 30 if this pokemon is resists the
	 * enemy pokemon attacks.
	 * @param dmg Base damage
	 */
	protected void resistDmg(int dmg) {
		this.wounds += (dmg-3);
		}
	
	@Override
	public void recieveFireDmg(Attack att) {
		normalDmg(att.getDmg());
		}
	
	@Override
	public void recieveWaterDmg(Attack att) {
		normalDmg(att.getDmg());
		}
	
	@Override
	public void recieveLeafDmg(Attack att) {
		normalDmg(att.getDmg());
		}
	
	@Override
	public void recieveFightDmg(Attack att) {
		normalDmg(att.getDmg());
		}
	
	@Override
	public void recieveThunderDmg(Attack att) {
		normalDmg(att.getDmg());
		}
	
	@Override
	public void recievePsiDmg(Attack att) {
		normalDmg(att.getDmg());
		}	
	
	@Override
	public void associateItem(Item it) {
		if (this.modifier != null) {
			this.modifier = it;
			}
		}

	@Override 
	public abstract void accept(Visitor m);
	/**
	 * Checks if this card represents the same pokemon as another
	 * 	
	 * @param obj Object to be compared
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		return obj instanceof IPokemon 
				&&((IPokemon)obj).getID() == this.id;
		}
	}

