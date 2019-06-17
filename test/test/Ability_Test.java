package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cc3002_Tarea1.Attack;
import cc3002_Tarea1.Energy_Leaf;
import cc3002_Tarea1.Heal;
import cc3002_Tarea1.Judge;
import cc3002_Tarea1.Ledger;
import cc3002_Tarea1.Pokemon_Leaf;
import cc3002_Tarea1.Trainer;

public class Ability_Test {
	private Trainer t1, t2;
	private Pokemon_Leaf p1, p2;
	private Energy_Leaf e1, e2;
	private Judge Monitor;
	private Ledger l;
	private Attack a;
	private Heal H = new Heal();
	
	@Before
	public void setUp() throws Exception {
		e1 = new Energy_Leaf("");
		e2 = new Energy_Leaf("");
		l = new Ledger(e1);
		a = new Attack("","",20,H,l);
		p1 = new Pokemon_Leaf(0,"",100,a);
		p2 = new Pokemon_Leaf(1,"",100,a);
		t1 = new Trainer(p1, e2);
		t2 = new Trainer(p2);
		Monitor = new Judge(t1,t2);
		t1.registerObserver(Monitor);
		t2.registerObserver(Monitor);
		}

	@Test
	public void Electric_Shock_test() {
		t1.setCurrent(p1);
		t1.play(e1);
		t1.select(a,t2);
		
		if (Monitor.seeCoin() == 0) {
			assertEquals(110, p1.getHP());
			}
		else {
			assertEquals(100,p1.getHP());
			}	
		}

}
