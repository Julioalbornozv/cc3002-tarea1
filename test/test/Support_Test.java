package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cc3002_Tarea1.Deck;
import cc3002_Tarea1.Effect;
import cc3002_Tarea1.Energy_Fight;
import cc3002_Tarea1.Energy_Fire;
import cc3002_Tarea1.Energy_Leaf;
import cc3002_Tarea1.Energy_Psi;
import cc3002_Tarea1.Energy_Water;
import cc3002_Tarea1.Judge;
import cc3002_Tarea1.PC_Discovery;
import cc3002_Tarea1.Support;
import cc3002_Tarea1.Trainer;

public class Support_Test {
	private Trainer t1;
	private Judge monitor;
	private Energy_Fight dud;
	private Energy_Leaf e1;
	private Energy_Fire e2;
	private Energy_Water e3;
	private Energy_Psi e4;
	private Effect Pc = new PC_Discovery();
	private Support sup = new Support(Pc);
	

	@Before
	public void setUp() throws Exception {
		e1 = new Energy_Leaf("");
		e2 = new Energy_Fire("");
		e3 = new Energy_Water("");
		e4 = new Energy_Psi("");
		t1 = new Trainer();
		t1.getDeck().add(e1,e2,e3,e4,dud);
		monitor = new Judge(t1);
		}

	@Test
	public void test() {
		Deck d = t1.getDeck();
		t1.play(sup);
		if (monitor.seeCoin() == 0) {
			assertEquals(e4,d.peek());
			assertEquals(1, d.size());
			}
		else {
			assertEquals(e2, d.peek());
			}
		
		assertEquals(sup, t1.getCemetery().peek());
		}

}
