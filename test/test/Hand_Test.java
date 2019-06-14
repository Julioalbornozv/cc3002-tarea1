package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cc3002_Tarea1.Attack;
import cc3002_Tarea1.IEnergy;
import cc3002_Tarea1.Energy_Leaf;
import cc3002_Tarea1.IPokemon;
import cc3002_Tarea1.Judge;
import cc3002_Tarea1.Pokemon_Fire;
import cc3002_Tarea1.Pokemon_Leaf;
import cc3002_Tarea1.Pokemon_Water;
import cc3002_Tarea1.Trainer;

public class Hand_Test {
	private Trainer t1;
	private Attack dud;
	private Judge Monitor;
	private IPokemon p1, p2, p3;
	private IEnergy e1;
	
	@Before
	public void setUp() throws Exception {
		dud = new Attack("Standard","", 40);
		
		p1 = new Pokemon_Leaf(0,"",100,dud);
		p2 = new Pokemon_Water(0,"",100,dud);
		p3 = new Pokemon_Fire(0,"",100,dud);
		
		e1 = new Energy_Leaf("");
		t1 = new Trainer(p1, p2, e1, p3);
		
		Monitor = new Judge(t1);
		t1.registerObserver(Monitor);
		}

	@Test
	public void Hand_test() {
		t1.play(p2);
		t1.setCurrent(p2);
		t1.play(e1);
		
		assertEquals(p1, t1.getActive());
		assertEquals(-1, t1.getHand().indexOf(p2));
		assertEquals(-1, t1.getHand().indexOf(e1));
	}
	
}
