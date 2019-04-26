package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cc3002_Tarea1.Attack;
import cc3002_Tarea1.Ledger;
import cc3002_Tarea1.Pokemon;
import cc3002_Tarea1.Pokemon_Fight;
import cc3002_Tarea1.Pokemon_Fire;
import cc3002_Tarea1.Pokemon_Leaf;
import cc3002_Tarea1.Pokemon_Psi;
import cc3002_Tarea1.Pokemon_Thunder;
import cc3002_Tarea1.Pokemon_Water;
import cc3002_Tarea1.Trainer;

public class Weakness_Resistance_Test {
	private Pokemon pL,pW,pF,pP,pFg,pT,pP2;
	private Trainer t1, t2;
	private Attack standard;
	
	@Before
	public void setUp() throws Exception {
		Ledger dud = new Ledger();
		standard = new Attack("Standard","",dud, 40);
		Attack[] std = {standard};
		
		pL = new Pokemon_Leaf(0,100,std);
		pW = new Pokemon_Water(0,100,std);
		pF = new Pokemon_Fire(0,100,std);
		pP = new Pokemon_Psi(0,100,std);
		pFg = new Pokemon_Fight(0,100,std);
		pT = new Pokemon_Thunder(0,100,std);
		pP2 = new Pokemon_Psi(0,100,std);
		}

	@Test
	public void Leaf_vs_Water_test() {
		t1 = new Trainer(pL);
		t2 = new Trainer(pW);
		
		t1.select(standard, t2);	// Weak
		t2.select(standard, t1);	// Resist
		
		assertEquals(pW.getHP(), 20);
		assertEquals(pL.getHP(), 90);
		}
	
	@Test
	public void Leaf_vs_Fire_test() {
		t1 = new Trainer(pL);
		t2 = new Trainer(pF);
		
		t2.select(standard, t1);	// Weak
		
		assertEquals(pL.getHP(), 20);
		}
	
	@Test
	public void Fire_vs_Water_test() {
		t1 = new Trainer(pF);
		t2 = new Trainer(pW);
		
		t2.select(standard, t1);	// Weak
		
		assertEquals(pF.getHP(), 20);
		}
	
		
	@Test
	public void Water_vs_Thunder_test() {
		t1 = new Trainer(pW);
		t2 = new Trainer(pT);
		
		t2.select(standard, t1);	// Weak
		
		assertEquals(pW.getHP(), 20);
		}
	
	@Test
	public void Water_vs_Fight_test() {
		t1 = new Trainer(pW);
		t2 = new Trainer(pFg);
		
		t2.select(standard, t1);	// Resist
		
		assertEquals(pW.getHP(), 90);
		}

	@Test
	public void Fight_vs_Leaf_test() {
		t1 = new Trainer(pFg);
		t2 = new Trainer(pL);
		
		t2.select(standard, t1);	// Weak
		
		assertEquals(pFg.getHP(), 20);
		}
	
	@Test
	public void Fight_vs_Psi_test() {
		t1 = new Trainer(pFg);
		t2 = new Trainer(pP);
		
		t1.select(standard, t2);	// Resist
		t2.select(standard, t1);	// Weak
		
		assertEquals(pFg.getHP(), 20);
		assertEquals(pP.getHP(), 90);
		}
	
	@Test
	public void Fight_vs_Thunder_test() {
		t1 = new Trainer(pFg);
		t2 = new Trainer(pT);
		
		t1.select(standard, t2);	// Weak
		
		assertEquals(pT.getHP(), 20);
		}
	
	@Test
	public void Psi_vs_Psi_test() {
		t1 = new Trainer(pP);
		t2 = new Trainer(pP2);
		
		t1.select(standard, t2);	// Weak
		
		assertEquals(pP2.getHP(), 20);
		}
}
