package cc3002_Tarea1;

public class Stadium implements ITrainerCard{
	private String name;
	private String description;
	private Effect eff;
	
	public Stadium(Effect e) {
		this.eff = e;
		};
	
	@Override
	public String getName() {
		return name;
		}
	
	@Override
	public String getDescription() {
		return description;
		}
	
	@Override
	public void beingPlayedBy(ITrainer player) {
		player.getObs().update_Stadium(this);
		}
	
	public void accept(Visitor m) {
		m.visitStadium(this);
		}
	public Effect getEffect() {
		return this.eff;	
		}
	}