import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class Unit_test1 {
	@Before
	Trainer T1 = new Trainer();
	Trainer T2 = new Trainer();
	
	Energy E1 = new Energy(Water);
	Energy E2 = new Energy(Leaf);
	Energy E3 = new Energy(Psi);
	
	Attack a1 = new Attack(40,Water);
	Attack a2 = new Attack(20,Leaf);
	Attack a3 = new Attack(30,Psi);
	
	Pokemon p1 = new Pokemon(60,Water,a1);	//P1 active
	Pokemon p2 = new Pokemon(60,Leaf,a2);	//P1 bench
	Pokemon p3 = new Pokemon(60,Psi,a3);    //P2 active
	
	@Test
	public void test2() {
		/*p2 resists p1, p1 is weak against p2, p3 replaces p2
		  */
		T1.play(p1);
		T1.play(p2);
		T1.equip(p1,E1);
		T2.play(p2);
		T2.equip(p2,E2);
		
		P1.choose(a1);
		assertEquals(p2.getHP, 50);	//Resist
		
		P2.choose(a2);
		assertEquals(p3,T1.active);	//p2 is defeated, replaced by p3
		
		T1.equip(p3,E3)
		P1.choose(a3);
		
		assertEquals(p2.getHP, 20); // Base damage done
	
	}

}
