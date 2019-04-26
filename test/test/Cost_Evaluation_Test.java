package test;
import static org.junit.Assert.*;
import cc3002_Tarea1.Pokemon_Leaf;
import cc3002_Tarea1.Trainer;
import cc3002_Tarea1.Attack;
import cc3002_Tarea1.Ledger;
import cc3002_Tarea1.Energy_Leaf;
import cc3002_Tarea1.Energy_Fire;

import org.junit.Before;
import org.junit.Test;

public class Cost_Evaluation_Test {
	private Trainer t1 = new Trainer();
	private Pokemon_Leaf p1, p2;
	private Attack a1,a2,a3;
	private Energy_Leaf e1, e2;
	private Energy_Fire e3;
	
	@Before
	public void setUp() throws Exception {
		e1 = new Energy_Leaf();
		e2 = new Energy_Leaf();
		e3 = new Energy_Fire();
		
		Ledger l1 = new Ledger(e1);
		Ledger l2 = new Ledger(e1,e2);
		Ledger l3 = new Ledger(e1,e3);
		
		a1 = new Attack("1W","",l1, 20);
		a2 = new Attack("2W","",l2, 20);
		a3 = new Attack("1W-1E","",l3, 20);
		
		Attack[] skillset = {a1,a2,a3};
		
		p1 = new Pokemon_Leaf(0,100,skillset);
		p2 = new Pokemon_Leaf(1,100,skillset);
		}

	@Test
	public void test() {
		t1.play(p1);
		t1.setActive();
		assertTrue(t1.getActive() != null);
		
		t1.equip(e1);
		
		t1.select(a1,p2); // True
		t1.select(a2,p2); // False
		t1.select(a3,p2); // False
		
		assertEquals(p2.getHP(), 80);
		//---------------------------
		t1.equip(e3);
		
		t1.select(a2,p2); // False
		t1.select(a3,p2); // True
		assertEquals(p2.getHP(), 60);
		//--------------------------
		t1.equip(e2);
		t1.select(a2,p2); // True
		assertEquals(p2.getHP(), 40);
		
		}
	}
