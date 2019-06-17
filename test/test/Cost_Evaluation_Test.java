package test;
import static org.junit.Assert.*;
import cc3002_Tarea1.Trainer;
import cc3002_Tarea1.Attack;
import cc3002_Tarea1.BasicLeafPokemon;
import cc3002_Tarea1.Ledger;
import cc3002_Tarea1.Energy_Leaf;
import cc3002_Tarea1.IPokemon;
import cc3002_Tarea1.Judge;
import cc3002_Tarea1.Energy_Fire;

import org.junit.Before;
import org.junit.Test;

public class Cost_Evaluation_Test {
	private Trainer t1, t2;
	private IPokemon p1, p2;
	private Attack a1,a2,a3;
	private Judge Monitor;
	private Energy_Leaf e1 = new Energy_Leaf("");
	private Energy_Leaf e2 = new Energy_Leaf("");
	private Energy_Fire e3 = new Energy_Fire("");
	
	@Before
	public void setUp() throws Exception {
		Energy_Leaf e1s = new Energy_Leaf("");
		Energy_Leaf e2s = new Energy_Leaf("");
		Energy_Fire e3s = new Energy_Fire("");
		
		Ledger l1 = new Ledger(e1s);
		Ledger l2 = new Ledger(e1s,e2s);
		Ledger l3 = new Ledger(e1s,e3s);
		
		a1 = new Attack("1W","", 2, l1);
		a2 = new Attack("2W","", 2, l2);
		a3 = new Attack("1W-1E","", 2, l3);
		
		p1 = new BasicLeafPokemon(0,"",100,a1,a2,a3);
		p2 = new BasicLeafPokemon(1,"",100,a1,a2,a3);
		
		t1 = new Trainer(p1);
		t2 = new Trainer(p2);
		
		t1.setCurrent(t1.getActive());
		t2.setCurrent(t2.getActive());
		
		Monitor = new Judge(t1,t2);
		}

	@Test
	public void test() {
		
		t1.play(e1);
		
		t1.select(a1); // True
		t2.pass();
		t1.select(a2); // False
		t2.pass();
		t1.select(a3); // False
		t2.pass();
		
		assertEquals(80, p2.getHP());
		//---------------------------
		t1.play(e3);
		
		t1.select(a2); // False
		t2.pass();
		t1.select(a3); // True
		assertEquals(60, p2.getHP());
		t2.pass();
		//--------------------------
		t1.play(e2);
		t1.select(a2); // True
		assertEquals(40, p2.getHP());
		
		}
	}
