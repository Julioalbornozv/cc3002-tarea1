package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cc3002_Tarea1.Attack;
import cc3002_Tarea1.BasicLeafPokemon;
import cc3002_Tarea1.Energy_Leaf;
import cc3002_Tarea1.Heal;
import cc3002_Tarea1.IPokemon;
import cc3002_Tarea1.Judge;
import cc3002_Tarea1.Ledger;
import cc3002_Tarea1.Trainer;

public class Ability_Test {
	private Trainer t1, t2;
	private IPokemon p1, p2;
	private Energy_Leaf e1, e2, e3;
	private Judge Monitor;
	private Ledger l;
	private Attack a;
	private Heal H = new Heal();
	
	@Before
	public void setUp() throws Exception {
		e1 = new Energy_Leaf("");
		e2 = new Energy_Leaf("");
		e3 = new Energy_Leaf("");
		l = new Ledger(e1);
		a = new Attack("","",2,H,l);
		p1 = new BasicLeafPokemon(0,"",100,a);
		p2 = new BasicLeafPokemon(1,"",100,a);
		t1 = new Trainer(p1, e2);
		t2 = new Trainer(p2, e3);
		Monitor = new Judge(t2,t1);
		}

	@Test
	public void Heal_test() {
		t2.setCurrent(p2);
		t2.play(e3);
		t1.select(a);
		
		assertEquals(100,p2.getHP()); // No counters, no heal
		t1.setCurrent(p1);
		t1.play(e2);
		t1.select(a);
		
		if (Monitor.seeCoin() == 0) {
			assertEquals(90, p1.getHP()); // Removes only one counter
			}
		else {
			assertEquals(80,p1.getHP());
			}
		
		int hp = p1.getHP();
		t1.select(a);
		
		assertEquals(hp-20,p1.getHP())	; // Heal cannot be used twice
		}
	}
