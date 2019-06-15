package cc3002_Tarea1;

import java.util.Random;

public class Judge implements IObserver {
	private ITrainer current;
	private ITrainer adversary;
	private Random coin = new Random();
	private boolean ene_played = false;
	private boolean sup_played = false;
	private boolean att_played = false;
	private int last_coin = 0;
	private Abs_Stadium stadium = new Empty_Stadium(); // NULL object
	
	public Judge(ITrainer player_1) { // Solo play (For testing purposes
		this.current = player_1;
		}
	
	public Judge(ITrainer player_1, ITrainer player_2){
		this.current = player_1;
		this.adversary = player_2;
		}
		
	@Override
	public void update_Stadium(Abs_Stadium st) { //Stadium update
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
		stadium.execute(this, card);
		card.beingPlayedBy(current);
		}
	
	public void notifySelection() {}
	public void notifyAttack() {}
	
	public ITrainer getTrainer() {
		return this.current;
		}
	public ITrainer getAdversary() {
		return this.adversary;
		}

	public int seeCoin() {
		return last_coin;
		}
	}
	