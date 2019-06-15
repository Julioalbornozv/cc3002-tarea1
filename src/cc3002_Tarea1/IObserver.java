package cc3002_Tarea1;

public interface IObserver {
	void update_Stadium(Stadium s);
	void notifyCard(ICard card);
	void instant_effect(Effect effect);
	}
