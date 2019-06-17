package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cc3002_Tarea1.Attack;
import cc3002_Tarea1.BasicFightPokemon;
import cc3002_Tarea1.Energy_Leaf;
import cc3002_Tarea1.IPokemon;
import cc3002_Tarea1.Judge;
import cc3002_Tarea1.Ledger;
import cc3002_Tarea1.Trainer;

public class Bench_Test {
	private IPokemon p1,p2,p3,p4,p5,p6,p7,p8,p9;
	private Energy_Leaf e = new Energy_Leaf("");
	private Ledger l = new Ledger(e);
	private Trainer t1, t2;
	private Judge Monitor;
	private Attack nuke;
	
	@Before
	public void setUp() throws Exception {
		Ledger dud = new Ledger();
		nuke = new Attack("Nuke","", 10000, dud);

		p1 = new BasicFightPokemon(0,"",100, nuke);
		p2 = new BasicFightPokemon(0,"",100);
		p3 = new BasicFightPokemon(0,"",100);
		p4 = new BasicFightPokemon(0,"",100);
		p5 = new BasicFightPokemon(0,"",100);
		p6 = new BasicFightPokemon(0,"",100);
		p7 = new BasicFightPokemon(0,"",100);
		p8 = new BasicFightPokemon(0,"",100);
		p9 = new BasicFightPokemon(0,"",100);
		
		t1 = new Trainer(p1);
		t2 = new Trainer(p2);
		
		Monitor = new Judge(t1,t2);
		}

	@Test
	public void overflow_test() {
		
		t1.play(p3);	// 1/5
		t1.play(p4);	// 2/5
		t1.play(p5);	// 3/5
		t1.play(p6);	// 4/5
		t1.play(p7);	// Full rooster
		t1.play(p8);	// Overflow, should not do anything
		t1.pass();
		
		t2.select(nuke);
		assertEquals(p3, t1.getActive()); // p3 should take place of p2
		
		t1.play(p9);
		t1.pass();
		
		t2.select(nuke); // p3 out
		t1.pass();
		t2.select(nuke); // p4 out
		t1.pass();
		t2.select(nuke); // p5 out
		t1.pass();
		t2.select(nuke); // p6 out
		t1.pass();
		t2.select(nuke); // p7 out
		t1.pass();
		
		assertEquals(p9, t1.getActive()); // p9 active instead of p8
		
		t2.select(nuke); // No active pokemons left
		
		assertEquals(null, t1.getActive());
		}
	
	public void energy_test() {
		t1.play(p3);
		t1.setCurrent(p3);
		t1.play(e);
		assertEquals(l, p3.getLedger());
		}
	}	
