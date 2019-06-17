package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cc3002_Tarea1.Attack;
import cc3002_Tarea1.Ledger;
import cc3002_Tarea1.IPokemon;
import cc3002_Tarea1.Judge;
import cc3002_Tarea1.BasicFightPokemon;
import cc3002_Tarea1.BasicFirePokemon;
import cc3002_Tarea1.BasicLeafPokemon;
import cc3002_Tarea1.BasicPsiPokemon;
import cc3002_Tarea1.BasicThunderPokemon;
import cc3002_Tarea1.BasicWaterPokemon;
import cc3002_Tarea1.Trainer;

public class Weakness_Resistance_Test {
	private IPokemon pL,pW,pF,pP,pFg,pT,pP2;
	private Trainer t1, t2;
	private Judge arbiter;
	private Attack standard;
	
	@Before
	public void setUp() throws Exception {
		Ledger dud = new Ledger();
		standard = new Attack("Standard","", 4, dud);
		
		pL = new BasicLeafPokemon(0,"",100,standard);
		pW = new BasicWaterPokemon(0,"",100,standard);
		pF = new BasicFirePokemon(0,"",100,standard);
		pP = new BasicPsiPokemon(0,"",100,standard);
		pFg = new BasicFightPokemon(0,"",100,standard);
		pT = new BasicThunderPokemon(0,"",100,standard);
		pP2 = new BasicPsiPokemon(0,"",100,standard);
		
		}

	@Test
	public void Leaf_vs_Water_test() {
		t1 = new Trainer(pL);
		t2 = new Trainer(pW);
		arbiter = new Judge(t1,t2);
		
		t1.select(standard);	// Weak
		t2.select(standard);	// Resist
		
		assertEquals(20, pW.getHP());
		assertEquals(90, pL.getHP());
		}
	
	@Test
	public void Leaf_vs_Fire_test() {
		t1 = new Trainer(pL);
		t2 = new Trainer(pF);
		arbiter = new Judge(t1,t2);
		
		t1.select(standard); 	// No modifier
		t2.select(standard);	// Weak
		
		assertEquals(20, pL.getHP());
		assertEquals(60,pF.getHP());
		}
	
	@Test
	public void Fire_vs_Water_test() {
		t1 = new Trainer(pF);
		t2 = new Trainer(pW);
		arbiter = new Judge(t1,t2);
		
		t1.select(standard); 	// No modifier
		t2.select(standard);	// Weak
		
		assertEquals(20, pF.getHP());
		assertEquals(60, pW.getHP());
		}
	
		
	@Test
	public void Water_vs_Thunder_test() {
		t1 = new Trainer(pW);
		t2 = new Trainer(pT);
		arbiter = new Judge(t1,t2);
		
		t1.select(standard); 	// No modifier
		t2.select(standard);	// Weak
		
		assertEquals(20, pW.getHP());
		assertEquals(60, pT.getHP());
		}
	
	@Test
	public void Water_vs_Fight_test() {
		t1 = new Trainer(pW);
		t2 = new Trainer(pFg);
		arbiter = new Judge(t1,t2);
		
		t1.select(standard); 	// No modifier
		t2.select(standard);	// Resist
		
		assertEquals(90, pW.getHP());
		assertEquals(60, pFg.getHP());
		}

	@Test
	public void Fight_vs_Leaf_test() {
		t1 = new Trainer(pFg);
		t2 = new Trainer(pL);
		arbiter = new Judge(t1,t2);
		
		t2.select(standard);	// Weak
		t1.select(standard); 	// No modifier
		
		assertEquals(20, pFg.getHP());
		assertEquals(60, pL.getHP());
		}
	
	@Test
	public void Fight_vs_Psi_test() {
		t1 = new Trainer(pFg);
		t2 = new Trainer(pP);
		arbiter = new Judge(t1,t2);
		
		t1.select(standard);	// Resist
		t2.select(standard);	// Weak
		
		assertEquals(20, pFg.getHP());
		assertEquals(90, pP.getHP());
		}
	
	@Test
	public void Fight_vs_Thunder_test() {
		t1 = new Trainer(pFg);
		t2 = new Trainer(pT);
		arbiter = new Judge(t1,t2);
		
		t1.select(standard);	// Weak
		t2.select(standard); 	// No modifier
		
		assertEquals(60, pFg.getHP());
		assertEquals(20, pT.getHP());
		}
	
	@Test
	public void Psi_vs_Psi_test() {
		t1 = new Trainer(pP);
		t2 = new Trainer(pP2);
		arbiter = new Judge(t1,t2);
		
		t1.select(standard);	// Weak
		
		assertEquals(20, pP2.getHP());
		}
	
	@Test  //Test for Non-modified Psychic damage
	public void Psi_vs_Fire_test() {
		t1 = new Trainer(pP);
		t2 = new Trainer(pF);
		arbiter = new Judge(t1,t2);
		
		t1.select(standard);	// Weak
		
		assertEquals(60, pF.getHP());
		}
}
