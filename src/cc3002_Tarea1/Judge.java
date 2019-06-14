package cc3002_Tarea1;

import java.util.Random;

public class Judge implements IObserver {
	private ITrainer current;
	private ITrainer adversary;
	private Random coin = new Random();
	private Abs_Stadium modifier = new Empty_Stadium(); // NULL object
	
	public Judge(ITrainer player_1) { // Solo play (For testing purposes
		this.current = player_1;
		}
	
	public Judge(ITrainer player_1, ITrainer player_2){
		this.current = player_1;
		this.adversary = player_2;
		}
		
	@Override
	public void update_Stadium(Abs_Stadium st) { //Stadium update
		this.modifier = st;
		}
	
	public int coinflip(){
		return coin.nextInt(2);
		}

	@Override
	public void notifyCard(ICard card) {
		modifier.execute(this, card);
		}
	
	public ITrainer getTrainer() {
		return this.current;
		}
	public ITrainer getAdversary() {
		return this.adversary;
		}
	}
	