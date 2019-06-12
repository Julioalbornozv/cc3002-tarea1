package cc3002_Tarea1;

public class Monitor implements IMonitor {
	private ITrainer current;
	private ITrainer adversary;
	
	public Monitor(ITrainer player_1, ITrainer player_2){
		this.current = player_1;
		this.adversary = player_2;
		}
	
	
	@Override
	public void update() {
		
		}
	}
	