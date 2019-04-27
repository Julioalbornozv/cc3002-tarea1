package cc3002_Tarea1;

/**
 * Base class for all Pokemons, contain implementations for getters
 * methods defined by IPokemon and includes methods required
 * to execute attacks.
 * 
 * @author Julio Albornoz Valencia
 */
public abstract class Abs_Pokemon implements Pokemon, Card{
	private int id;
	private int hp;
	private String name;
	private Ability[] skillset = new Ability[4];
	private Ledger power = new Ledger();
	
	/**
	 * Creates a generic Pokemon, starting with no energy cards
	 * associated
	 * @param id Pokemon id
	 * @param name Pokemon name
	 * @param hp Pokemon hp
	 * @param skills Pokemon skills
	 */
	protected Abs_Pokemon(int id,String name, int hp, Ability[] skills) {
		this.id = id;
		this.name = name;
		this.hp = hp;
		this.skillset = skills;
		}	
	
	@Override
	public int getHP() {
		return hp;
		}
	
	@Override
	public int getID() {
		return id;
		}	
	@Override
	public Ability[] getSkillset(){
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
	protected void fight (Attack skill, Pokemon enemy) {}
	
	@Override
	public void attack(Attack skill, Pokemon enemy) {
		if (power.evalCost(skill)) {
			this.fight(skill, enemy);
			}	
		}	
	
	@Override
	public void associate(Energy e) {
		power.add(e.getKey());
		}
	
	/**
	 * Base damage with no modifiers
	 * @param dmg Base damage
	 */
	protected void normalDmg(int dmg) {
		this.hp -= dmg;
		}

	/**
	 * Base Damage doubled if this pokemon is weak to the enemy 
	 * pokemon attacks.
	 * @param dmg Base damage
	 */
	protected void weaknessDmg(int dmg) {
		this.hp -= dmg*2;
		}
	
	/**
	 * Base Damage reduced by 30 if this pokemon is resists the
	 * enemy pokemon attacks.
	 * @param dmg Base damage
	 */
	protected void resistDmg(int dmg) {
		this.hp -= (dmg-30);
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
	
	/**
	 * Checks if this card represents the same pokemon as another
	 * 
	 * @param obj Object to be compared
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Pokemon 
				&&((Pokemon)obj).getID() == this.id;
		}
	}

