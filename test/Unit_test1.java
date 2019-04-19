import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class Unit_test1 {
	//Cost management Test
	@Before
	Trainer T1 = new Trainer();
	Trainer T2 = new Trainer();
	
	Energy E1 = new Energy(Water);
	Energy E2 = new Energy(Water);
	
	Attack a1 = new Attack(10,Fight);
	Attack a2 = new Attack(10,Water);
	Attack a3 = new Attack(10,Water,Water);
	
	Pokemon p1 = new Pokemon(99,Water,a1,a2,a3);
	Pokemon p2 = new Pokemon(99,Water,a1);
	
	@Test
	public void test() {
		/*Pokemon should be only capable to choose ability a2 with one water
		  energy. Equiping a second water energy card should unlock ability 
		  a3 */
		T1.play(p1);
		T1.equip(p1,E1);
		T2.play(p2);
		
		P1.assertFalse(P1.choose(a1));
		P1.assertFalse(P1.choose(a2));
		P3.assertTrue(P1.choose(a3));
		
		T1.equip(p1,E2)
		
		P3.assertTrue(P1.choose(a3));
	}

}
