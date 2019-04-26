package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cc3002_Tarea1.Attack;
import cc3002_Tarea1.Ledger;
import cc3002_Tarea1.Pokemon_Fight;
import cc3002_Tarea1.Trainer;

public class Bench_Test {
	private Pokemon_Fight p1,p2,p3,p4,p5,p6,p7,p8,p9;
	private Trainer t1 = new Trainer();
	private Trainer t2 = new Trainer();
	private Attack nuke;
	
	@Before
	public void setUp() throws Exception {
		Ledger dud = new Ledger();
		nuke = new Attack("Nuke","",dud, 10000);
		Attack[] pack = {nuke};
		Attack[] none = {};
		p1 = new Pokemon_Fight(0,100, pack);
		p2 = new Pokemon_Fight(0,100, none);
		p3 = new Pokemon_Fight(0,100, none);
		p4 = new Pokemon_Fight(0,100, none);
		p5 = new Pokemon_Fight(0,100, none);
		p6 = new Pokemon_Fight(0,100, none);
		p7 = new Pokemon_Fight(0,100, none);
		p8 = new Pokemon_Fight(0,100, none);
		p9 = new Pokemon_Fight(0,100, none);
		}

	@Test
	public void test() {
		t2.play(p1);
		t2.setActive();
		t1.play(p2);	// 0/5
		t1.setActive();
		
		t1.play(p3);	// 1/5
		t1.play(p4);	// 2/5
		t1.play(p5);	// 3/5
		t1.play(p6);	// 4/5
		t1.play(p7);	// Full rooster
		t1.play(p8);	// Overflow, should not do anything
		
		t2.select(nuke,t1.getActive());
		assertEquals(p3, t1.getActive()); // p3 should take place of p2
		t1.play(p9);
		
		t2.select(nuke,t1.getActive()); // p3 out
		t2.select(nuke,t1.getActive()); // p4 out
		t2.select(nuke,t1.getActive()); // p5 out
		t2.select(nuke,t1.getActive()); // p6 out
		t2.select(nuke,t1.getActive()); // p7 out
		
		assertEquals(p9, t1.getActive()); // p9 active instead of p8
		}

}
