package cc3002_Tarea1;

import java.util.Random;

public class Judge implements IObserver {
	private Abs_Trainer current;
	private Abs_Trainer adversary;
	private Random coin = new Random();
	private boolean ene_played = false; //To be implemented
	private boolean sup_played = false;
	private int last_coin = 0;
	private Stadium stadium = new Stadium(new Null_Effect()); // NULL object
	
	public Judge(Abs_Trainer player_1) { // Solo play (For testing purposes
		this.current = player_1;
		this.current.registerObserver(this);
		}
	
	public Judge(Abs_Trainer player_1, Abs_Trainer player_2){
		this.current = player_1;
		this.adversary = player_2;
		this.current.registerObserver(this);
		this.adversary.registerObserver(this);
		}
		
	@Override
	public void update_Stadium(Stadium st) { //Stadium update
		this.stadium = st;
		}
	
	@Override
	public void instant_effect(Effect effect) {
		effect.execute(this);
		}
	public int coinflip(){
		last_coin = coin.nextInt(2);
		return last_coin;	//0 cara, 1 sello
		}

	@Override
	public void notifyCard(ICard card) {
		stadium.getEffect().executeOver(this, card);
		card.beingPlayedBy(current);
		}
	
	@Override
	public void notifySelection(IAbility skill) {
		skill.getEffect().execute(this);
		}
	
	public void notifyAttack(Attack att) {
		att.getEffect().execute(this);
		current.getActive().attack(att, adversary.getActive());
		adversary.checkActive();
		swap();
		}
	
	public Abs_Trainer getTrainer() {
		return this.current;
		}
	public Abs_Trainer getAdversary() {
		return this.adversary;
		}

	public int seeCoin() {
		return last_coin;
		}
	
	public void swap() {
		Abs_Trainer aux = this.current;
		this.current = this.adversary;
		this.adversary = aux;
		}
	
	@Override
	public void notifySkip() {
		swap();
		}
	
	}
	