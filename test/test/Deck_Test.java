package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cc3002_Tarea1.Deck;
import cc3002_Tarea1.Energy_Leaf;
import cc3002_Tarea1.Energy_Water;
import cc3002_Tarea1.ICard;

public class Deck_Test {
	private Deck d = new Deck();
	private Energy_Leaf t1, t2;
	private Energy_Water e1, e2, e3, e4, e5;
	
	@Before
	public void setUp() throws Exception {
		e1 = new Energy_Water("");
		e2 = new Energy_Water("");
		e3 = new Energy_Water("");
		e4 = new Energy_Water("");
		e5 = new Energy_Water("");
		t1 = new Energy_Leaf("target");
		t2 = new Energy_Leaf("target");
		}	
	
	@Test
	public void empty_test() {
		Deck empty = new Deck();
		ICard[] b = empty.draw(7); // No cards to draw
		ICard[] b2 = empty.draw(0); // Does nothing
		ICard[] b3 = empty.extract(e1, 12);
		ICard[] b4 = empty.extract(e1,0); 	
		
		assertEquals(b.length,0);
		assertEquals(b2.length,0);
		assertEquals(b3.length,0);
		assertEquals(b4.length,0);
		}
	
	@Test
	public void test() {
		d.add(e1,t1,e2,e3,e4,e5,t2);
		ICard[] buffer = d.extract(t1, 3); //Should extract the two energy cards and nothing more
		
		assertEquals(2, buffer.length);
		assertEquals(5, d.size());
		assertFalse(d.contains(t2));
		}

}
