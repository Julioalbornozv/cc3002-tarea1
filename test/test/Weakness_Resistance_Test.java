package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cc3002_Tarea1.Attack;
import cc3002_Tarea1.Ledger;
import cc3002_Tarea1.IPokemon;
import cc3002_Tarea1.Pokemon_Fight;
import cc3002_Tarea1.Pokemon_Fire;
import cc3002_Tarea1.Pokemon_Leaf;
import cc3002_Tarea1.Pokemon_Psi;
import cc3002_Tarea1.Pokemon_Thunder;
import cc3002_Tarea1.Pokemon_Water;
import cc3002_Tarea1.Trainer;

public class Weakness_Resistance_Test {
	private IPokemon pL,pW,pF,pP,pFg,pT,pP2;
	private Trainer t1, t2;
	private Attack standard;
	
	@Before
	public void setUp() throws Exception {
		Ledger dud = new Ledger();
		standard = new Attack("Standard","", 40, dud);
		
		pL = new Pokemon_Leaf(0,"",100,standard);
		pW = new Pokemon_Water(0,"",100,standard);
		pF = new Pokemon_Fire(0,"",100,standard);
		pP = new Pokemon_Psi(0,"",100,standard);
		pFg = new Pokemon_Fight(0,"",100,standard);
		pT = new Pokemon_Thunder(0,"",100,standard);
		pP2 = new Pokemon_Psi(0,"",100,standard);
		}

	@Test
	public void Leaf_vs_Water_test() {
		t1 = new Trainer(pL);
		t2 = new Trainer(pW);
		
		t1.select(standard, t2);	// Weak
		t2.select(standard, t1);	// Resist
		
		assertEquals(20, pW.getHP());
		assertEquals(90, pL.getHP());
		}
	
	@Test
	public void Leaf_vs_Fire_test() {
		t1 = new Trainer(pL);
		t2 = new Trainer(pF);
		
		t1.select(standard, t2); 	// No modifier
		t2.select(standard, t1);	// Weak
		
		assertEquals(20, pL.getHP());
		assertEquals(60,pF.getHP());
		}
	
	@Test
	public void Fire_vs_Water_test() {
		t1 = new Trainer(pF);
		t2 = new Trainer(pW);
		
		t1.select(standard, t2); 	// No modifier
		t2.select(standard, t1);	// Weak
		
		assertEquals(20, pF.getHP());
		assertEquals(60, pW.getHP());
		}
	
		
	@Test
	public void Water_vs_Thunder_test() {
		t1 = new Trainer(pW);
		t2 = new Trainer(pT);
		
		t1.select(standard, t2); 	// No modifier
		t2.select(standard, t1);	// Weak
		
		assertEquals(20, pW.getHP());
		assertEquals(60, pT.getHP());
		}
	
	@Test
	public void Water_vs_Fight_test() {
		t1 = new Trainer(pW);
		t2 = new Trainer(pFg);
		
		t1.select(standard, t2); 	// No modifier
		t2.select(standard, t1);	// Resist
		
		assertEquals(90, pW.getHP());
		assertEquals(60, pFg.getHP());
		}

	@Test
	public void Fight_vs_Leaf_test() {
		t1 = new Trainer(pFg);
		t2 = new Trainer(pL);
		
		t2.select(standard, t1);	// Weak
		t1.select(standard, t2); 	// No modifier
		
		assertEquals(20, pFg.getHP());
		assertEquals(60, pL.getHP());
		}
	
	@Test
	public void Fight_vs_Psi_test() {
		t1 = new Trainer(pFg);
		t2 = new Trainer(pP);
		
		t1.select(standard, t2);	// Resist
		t2.select(standard, t1);	// Weak
		
		assertEquals(20, pFg.getHP());
		assertEquals(90, pP.getHP());
		}
	
	@Test
	public void Fight_vs_Thunder_test() {
		t1 = new Trainer(pFg);
		t2 = new Trainer(pT);
		
		t1.select(standard, t2);	// Weak
		t2.select(standard, t1); 	// No modifier
		
		assertEquals(60, pFg.getHP());
		assertEquals(20, pT.getHP());
		}
	
	@Test
	public void Psi_vs_Psi_test() {
		t1 = new Trainer(pP);
		t2 = new Trainer(pP2);
		
		t1.select(standard, t2);	// Weak
		
		assertEquals(20, pP2.getHP());
		}
	
	@Test  //Test for Non-modified Psychic damage
	public void Psi_vs_Fire_test() {
		t1 = new Trainer(pP);
		t2 = new Trainer(pF);
		
		t1.select(standard, t2);	// Weak
		
		assertEquals(60, pF.getHP());
		}
}
