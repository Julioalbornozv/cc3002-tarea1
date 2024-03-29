package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cc3002_Tarea1.Attack;
import cc3002_Tarea1.BasicLeafPokemon;
import cc3002_Tarea1.Electric_Shock;
import cc3002_Tarea1.Energy_Leaf;
import cc3002_Tarea1.IPokemon;
import cc3002_Tarea1.Judge;
import cc3002_Tarea1.Ledger;
import cc3002_Tarea1.Trainer;

public class Attack_Test {
	private Trainer t1, t2;
	private IPokemon p1, p2;
	private Energy_Leaf e1, e2;
	private Judge Monitor;
	private Ledger l;
	private Attack a;
	private Electric_Shock Ec = new Electric_Shock();
	
	@Before
	public void setUp() throws Exception {
		e1 = new Energy_Leaf("");
		e2 = new Energy_Leaf("");
		l = new Ledger(e1);
		a = new Attack("","",2,Ec,l);
		p1 = new BasicLeafPokemon(0,"",100,a);
		p2 = new BasicLeafPokemon(1,"",100,a);
		t1 = new Trainer(p1, e2);
		t2 = new Trainer(p2);
		Monitor = new Judge(t1,t2);
		}

	@Test
	public void Electric_Shock_test() {
		t1.setCurrent(p1);
		t1.play(e1);
		t1.select(a);
		
		if (Monitor.seeCoin() == 1) {
			assertEquals(80-Ec.getMultiplier()*10,p2.getHP());
			}
		else {
			assertEquals(80,p2.getHP());
			}	
		}

}
