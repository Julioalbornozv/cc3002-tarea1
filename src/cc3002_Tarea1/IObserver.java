package cc3002_Tarea1;

public interface IObserver {
	void update_Stadium(Stadium s);
	void notifyCard(ICard card);
	void notifySelection(IAbility sk);
	void instant_effect(Effect effect);
	void notifyAttack(Attack attack);
	void notifySkip();
	int notifyEnergy();
	void dormant_effect(Effect eff);
	}
