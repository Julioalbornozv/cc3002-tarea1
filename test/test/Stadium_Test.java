package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cc3002_Tarea1.Attack;
import cc3002_Tarea1.Energy_Leaf;
import cc3002_Tarea1.Frozen_City;
import cc3002_Tarea1.Judge;
import cc3002_Tarea1.Ledger;
import cc3002_Tarea1.Pokemon_Leaf;
import cc3002_Tarea1.Trainer;

public class Stadium_Test {
	private Trainer t1, t2;
	private Pokemon_Leaf p1, p2;
	private Energy_Leaf e;
	private Judge Monitor;
	private Ledger l = new Ledger();
	private Attack a = new Attack("","",0,l);
	private Frozen_City Fc = new Frozen_City();
	
	@Before
	public void setUp() throws Exception {
		p1 = new Pokemon_Leaf(0, "",100, a);
		p2 = new Pokemon_Leaf(1, "",100, a);
		e = new Energy_Leaf("");
		t1 = new Trainer(p1, Fc, e, p2);
		t2 = new Trainer();
		Monitor = new Judge(t1, t2);
		t1.registerObserver(Monitor);
		t2.registerObserver(Monitor);
		}

	@Test
	public void frozen_city_test() {
		t1.play(Fc);
		t1.setCurrent(p1);
		t1.play(e); //Equipa energia a pokemon
		assertEquals(100-Fc.getMult()*10, p1.getHP()); // Pokemon was damaged due to stadium effects
		
		t1.play(p2);
		assertEquals(100-Fc.getMult()*10, p1.getHP()); // No damage by the stadium
		}

}
