package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cc3002_Tarea1.Attack;
import cc3002_Tarea1.Effect;
import cc3002_Tarea1.Energy_Leaf;
import cc3002_Tarea1.Heal;
import cc3002_Tarea1.Item;
import cc3002_Tarea1.Judge;
import cc3002_Tarea1.Ledger;
import cc3002_Tarea1.Pokemon_Leaf;
import cc3002_Tarea1.Potion;
import cc3002_Tarea1.Trainer;

public class Item_Test {
	private Trainer t1, t2;
	private Pokemon_Leaf p1, p2;
	private Energy_Leaf e1, e2;
	private Judge Monitor;
	private Ledger l;
	private Attack a;
	private Potion P = new Potion();
	private Item it = new Item(P);
	
	@Before
	public void setUp() throws Exception {
		e1 = new Energy_Leaf("");
		e2 = new Energy_Leaf("");
		l = new Ledger(e1);
		a = new Attack("","",20,l);
		p1 = new Pokemon_Leaf(0,"",100,a);
		p2 = new Pokemon_Leaf(1,"",100,a);
		t1 = new Trainer(p1, it);
		t2 = new Trainer(p2);
		Monitor = new Judge(t1,t2);
		t1.registerObserver(Monitor);
		t2.registerObserver(Monitor);
		}

	@Test
	public void instant_effect_test() {
		t1.setCurrent(p1);
		t1.play(it);
		
		assertEquals(100+P.getMultiplier()*10,p1.getHP());
		}

}
