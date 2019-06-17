package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cc3002_Tarea1.Attack;
import cc3002_Tarea1.BasicLeafPokemon;
import cc3002_Tarea1.IPokemon;
import cc3002_Tarea1.Item;
import cc3002_Tarea1.Judge;
import cc3002_Tarea1.Ledger;
import cc3002_Tarea1.Potion;
import cc3002_Tarea1.Trainer;

public class Item_Test {
	private Trainer t1, t2;
	private IPokemon p1, p2;
	private Judge Monitor;
	private Ledger l;
	private Attack a;
	private Potion P = new Potion();
	private Item it = new Item(P);
	
	@Before
	public void setUp() throws Exception {
		l = new Ledger();
		a = new Attack("","",2,l);
		p1 = new BasicLeafPokemon(0,"",100,a);
		p2 = new BasicLeafPokemon(0,"",100,a);
		t1 = new Trainer(p1, it, it);
		t2 = new Trainer(p2);
		Monitor = new Judge(t1,t2);
		}

	@Test
	public void instant_effect_test() {
		t1.setCurrent(p1);
		t1.play(it);
		
		assertEquals(100, p1.getHP()); // Pokemon has full hp, potion should does nothing in this case
		
		t1.select(a);
		t2.select(a);
		
		assertEquals(80,p1.getHP());
		
		t1.play(it); 
		assertEquals(100,p1.getHP()); // Potion cures 20 hp instead of 30 to prevent overhealing
		}

}
