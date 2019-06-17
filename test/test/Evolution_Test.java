package test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import cc3002_Tarea1.BasicFirePokemon;
import cc3002_Tarea1.BasicWaterPokemon;
import cc3002_Tarea1.Energy_Leaf;
import cc3002_Tarea1.IPokemon;
import cc3002_Tarea1.ITrainer;
import cc3002_Tarea1.Judge;
import cc3002_Tarea1.Ledger;
import cc3002_Tarea1.Stage1_Fire_Pokemon;
import cc3002_Tarea1.Stage1_Water_Pokemon;
import cc3002_Tarea1.Stage2_Fire_Pokemon;
import cc3002_Tarea1.Stage2_Water_Pokemon;
import cc3002_Tarea1.Trainer;

public class Evolution_Test {
	private IPokemon p1, p2, p3, p4, p5, p6;
	private Energy_Leaf e;
	private Ledger l;
	private Trainer t1;
	private Judge arbiter;
	
	@Before
	public void setUp() throws Exception {
		p1 = new BasicFirePokemon(10,"",100);
		p2 = new Stage1_Fire_Pokemon(36,"", 80,10);
		p3 = new Stage2_Fire_Pokemon(99,"",1000,36);
		//--------------------------------------------
		e = new Energy_Leaf("");
		l = new Ledger(e);
		p4 = new BasicWaterPokemon(20,"",100);
		p5 = new Stage1_Water_Pokemon(78,"", 80,20);
		p6 = new Stage2_Water_Pokemon(15,"",1000,78);
		t1 = new Trainer(p1,p2,p3,p4,p5,p6);
		arbiter = new Judge(t1);
		}

	@Test
	public void Evolution_active_test() {
		t1.play(p4);
		t1.setCurrent(p1);
		t1.play(p2);
		t1.setCurrent(p2);
		assertEquals(p2,t1.getActive());
		t1.play(p3);
		assertEquals(p3,t1.getActive());
		
		t1.setCurrent(p4);
		t1.play(e);
		t1.play(p5);
		assertTrue(Arrays.asList(t1.getBench()).contains(p5));
		assertFalse(Arrays.asList(t1.getBench()).contains(p4));
		assertEquals(p4, t1.getCemetery().peek());
		assertEquals(l,p5.getLedger());	//Ledger is inherited
		
		
		t1.setCurrent(p5);
		t1.play(p6);
		assertTrue(Arrays.asList(t1.getBench()).contains(p6));
		assertFalse(Arrays.asList(t1.getBench()).contains(p5));
		assertEquals(p5, t1.getCemetery().peek());
		assertEquals(l,p6.getLedger()); //Ledger is inherited
		}
	}
