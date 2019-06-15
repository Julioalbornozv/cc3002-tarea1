package cc3002_Tarea1;

public class Support implements ITrainerCard{
	private String name;
	private String description;
	private Effect eff;
	
	public Support(Effect e) {
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
	
	public void accept(Visitor m) {
		m.visitSupport(this);
		}
	
	@Override
	public void beingPlayedBy(ITrainer t) {
		t.getObs().instant_effect(this.eff);
		t.discard(this);
		}
	}
