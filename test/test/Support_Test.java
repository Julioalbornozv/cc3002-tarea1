package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cc3002_Tarea1.Effect;
import cc3002_Tarea1.Energy_Leaf;
import cc3002_Tarea1.Judge;
import cc3002_Tarea1.PC_Discovery;
import cc3002_Tarea1.Support;
import cc3002_Tarea1.Trainer;

public class Support_Test {
	private Trainer t1;
	private Judge monitor;
	private Energy_Leaf e1, e2, e3;
	private Effect Pc = new PC_Discovery();
	private Support sup = new Support(Pc);
	

	@Before
	public void setUp() throws Exception {
		e1 = new Energy_Leaf("");
		e2 = new Energy_Leaf("");
		e3 = new Energy_Leaf("");
		t1 = new Trainer();
		t1.getDeck().add(e1,e2,e3);
		monitor = new Judge(t1);
		t1.registerObserver(monitor);
		}

	@Test
	public void test() {
		t1.play(sup);
		if (monitor.seeCoin() == 0) {
			assertTrue(t1.getDeck().isEmpty());
			}
		else {
			assertEquals(e3, t1.getDeck().peek());
			}
		
		assertEquals(sup, t1.getCemetery().peek());
		}

}
