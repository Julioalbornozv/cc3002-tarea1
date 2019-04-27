package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cc3002_Tarea1.Attack;
import cc3002_Tarea1.Energy;
import cc3002_Tarea1.Energy_Leaf;
import cc3002_Tarea1.Pokemon;
import cc3002_Tarea1.Pokemon_Fire;
import cc3002_Tarea1.Pokemon_Leaf;
import cc3002_Tarea1.Pokemon_Water;
import cc3002_Tarea1.Trainer;

public class Hand_Test {
	private Trainer t1;
	private Attack dud;
	private Pokemon p1, p2, p3;
	private Energy e1;
	
	@Before
	public void setUp() throws Exception {
		dud = new Attack("Standard","", 40);
		
		p1 = new Pokemon_Leaf(0,"",100,dud);
		p2 = new Pokemon_Water(0,"",100,dud);
		p3 = new Pokemon_Fire(0,"",100,dud);
		
		e1 = new Energy_Leaf("");
		t1 = new Trainer(p1, p2, e1, p3);
	}

	@Test
	public void Hand_test() {
		t1.play(p2);
		t1.equip(e1);
		
		assertEquals(p1, t1.getActive());
		assertEquals(-1, t1.getHand().indexOf(p2));
		assertEquals(-1, t1.getHand().indexOf(e1));
	}
	
}
