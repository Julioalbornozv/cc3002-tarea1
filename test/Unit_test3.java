import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class Unit_test1 {
	//Bench test
	
		@Before
		Trainer T1 = new Trainer();
		
		Attack a1 = new Attack(10,Water);
		

		Pokemon p1 = new Pokemon(60,Water,a1);	
		Pokemon p2 = new Pokemon(60,Water,a1);
		Pokemon p3 = new Pokemon(60,Water,a1);	
		Pokemon p4 = new Pokemon(60,Water,a1);	
		Pokemon p5 = new Pokemon(60,Water,a1);	
		Pokemon p6 = new Pokemon(60,Water,a1);	
		Pokemon p7 = new Pokemon(60,Water,a1);	
		
		@Test
		public void test3() {
			/*Maximum bench size is 5, adding p7 should return an error (or False)
			  */
			T1.play(p1);
			T1.play(p2);
			T1.play(p3);
			T1.play(p4);
			T1.play(p5);
			T1.play(p6);
			assertFalse(T1.play(p7));
			assertEquals(p1,T1.active);
	}
}
