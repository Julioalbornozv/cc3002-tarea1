package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cc3002_Tarea1.Ability;
import cc3002_Tarea1.Attack;
import cc3002_Tarea1.Energy;
import cc3002_Tarea1.Energy_Fight;
import cc3002_Tarea1.Energy_Fire;
import cc3002_Tarea1.Energy_Leaf;
import cc3002_Tarea1.Energy_Psi;
import cc3002_Tarea1.Energy_Thunder;
import cc3002_Tarea1.Energy_Water;
import cc3002_Tarea1.Ledger;

public class Equality_Test {
	private Energy e1, e2, e3, e4, e5, e6, e7, e8;
	private Ledger l1, l2, l3, l4, l5, l6;
	private Ability a1, a2, a3, a4, a5, a6;
	
	@Before
	public void setUp() throws Exception {
		e1 = new Energy_Leaf("Leaf Energy");
		e2 = new Energy_Leaf("leaf_erergy");
		e3 = new Energy_Fire("Fire Energy");
		e4 = new Energy_Psi("Psi");
		e5 = new Energy_Thunder("Psi");
		e6 = new Energy_Thunder("Leaf Energy");
		e7 = new Energy_Water("Water");
		e8 = new Energy_Fight("Fight Energy");
		//------------------------------------
		l1 = new Ledger(e1,e2);
		l2 = new Ledger(e1,e2);
		l3 = new Ledger(e2,e1);
		l4 = new Ledger(e1,e2,e3);
		l5 = new Ledger(e6,e8,e1,e5);
		l6 = new Ledger(e8,e2,e5,e6);
		//------------------------------------
		a1 = new Attack("Standard", "", 100, l5);
		a2 = new Attack("Standard", "", 100, e6, e8, e1, e5);
		a3 = new Attack("Standrd", "", 100, l5);
		a4 = new Attack("Standard", "", 90, l5);
		a5 = new Attack("Standard", "", 100, e6, e4, e1, e5);
		a6 = new Attack("Standard", "" ,100, e5, e1, e6, e8);
		//-------------------------------------
		}

	@Test
	public void Energy_equals_test() {
		assertTrue(e1.equals(e2));
		assertTrue(e2.equals(e1));
		assertFalse(e3.equals(e7));
		assertFalse(e4.equals(e5));
		assertTrue(e5.equals(e6));
		assertFalse(e6.equals(e1));
		assertFalse(e7.equals(e4));
		assertFalse(e8.equals(e7));
		}
	
	@Test
	public void Ledger_equals_test() {
		l1.equals(l2);
		assertTrue(l1.equals(l2));	
		assertTrue(l1.equals(l3));		// Order should not matter
		assertFalse(l1.equals(l4));		// l1 subset of l4
		assertFalse(l1.equals(l5));		// Same number different types
		assertTrue(l5.equals(l6));		// Same ledgers with different types and different order
		}	
	
	@Test
	public void Attack_equals_test() {
		assertTrue(a1.equals(a2));		// Ledger vs Energy card constructor
		assertTrue(a2.equals(a6));		// Order of Energy cards should not matter
		assertTrue(a6.equals(a1));		// Same for Ledger components vs Energy card order
		assertFalse(a1.equals(a3)); 	// Diff name
		assertFalse(a1.equals(a4)); 	// Diff Dmg
		assertFalse(a1.equals(a5)); 	// Diff Energy cards
		}
	}
