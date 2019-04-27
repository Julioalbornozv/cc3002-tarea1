package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cc3002_Tarea1.Energy_Fire;
import cc3002_Tarea1.Energy_Leaf;
import cc3002_Tarea1.Ledger;

public class Ledger_test {
	private Ledger l1, l2, l3, l4, l5;
	
	@Before
	public void setUp() throws Exception {
		Energy_Leaf e1 = new Energy_Leaf("");
		Energy_Leaf e2 = new Energy_Leaf("");
		Energy_Fire e3 = new Energy_Fire("");
		Energy_Fire e4 = new Energy_Fire("");
		
		l1 = new Ledger(e1,e2);
		l2 = new Ledger(e1,e2);
		l3 = new Ledger(e2,e1);
		l4 = new Ledger(e1,e2,e3);
		l5 = new Ledger(e3,e4);
		}

	@Test
	public void test() {
		l1.equals(l2);
		assertTrue(l1.equals(l2));	
		assertTrue(l1.equals(l3));    // Order should not matter
		assertFalse(l1.equals(l4));   // l1 subset of l4
		assertFalse(l1.equals(l5));   // Same number different types
		}	

}
