package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cc3002_Tarea1.Attack;
import cc3002_Tarea1.Judge;
import cc3002_Tarea1.Ledger;
import cc3002_Tarea1.Pokemon_Fight;
import cc3002_Tarea1.Trainer;

public class Bench_Test {
	private Pokemon_Fight p1,p2,p3,p4,p5,p6,p7,p8,p9;
	private Trainer t1, t2;
	private Judge Monitor;
	private Attack nuke;
	
	@Before
	public void setUp() throws Exception {
		Ledger dud = new Ledger();
		nuke = new Attack("Nuke","", 10000, dud);

		p1 = new Pokemon_Fight(0,"",100, nuke);
		p2 = new Pokemon_Fight(0,"",100);
		p3 = new Pokemon_Fight(0,"",100);
		p4 = new Pokemon_Fight(0,"",100);
		p5 = new Pokemon_Fight(0,"",100);
		p6 = new Pokemon_Fight(0,"",100);
		p7 = new Pokemon_Fight(0,"",100);
		p8 = new Pokemon_Fight(0,"",100);
		p9 = new Pokemon_Fight(0,"",100);
		
		t1 = new Trainer(p1);
		t2 = new Trainer(p2);
		
		Monitor = new Judge(t1,t2);
		t1.registerObserver(Monitor);
		t2.registerObserver(Monitor);
		}

	@Test
	public void test() {
		
		t1.play(p3);	// 1/5
		t1.play(p4);	// 2/5
		t1.play(p5);	// 3/5
		t1.play(p6);	// 4/5
		t1.play(p7);	// Full rooster
		t1.play(p8);	// Overflow, should not do anything
		
		t2.select(nuke,t1);
		assertEquals(p3, t1.getActive()); // p3 should take place of p2
		
		t1.play(p9);
		
		t2.select(nuke,t1); // p3 out
		t2.select(nuke,t1); // p4 out
		t2.select(nuke,t1); // p5 out
		t2.select(nuke,t1); // p6 out
		t2.select(nuke,t1); // p7 out
		
		assertEquals(p9, t1.getActive()); // p9 active instead of p8
		
		t2.select(nuke, t1); // No active pokemons left
		
		assertEquals(null, t1.getActive());
		}
	}	
