# Pokemon TCG

Command line implementation of the Pokemon TCG for the course cc3002.


## Current Status
This project does not currently have a game to be played. It does though contain objects that can be used to assemble said game in the future.
This project features:

* A trainer class which represents the player. Its able to play Pokemon and Energy cards using double dispatch. 

* Pokemon Cards played on the bench are stored on a Queue, after an attack has been executed, the trainer being attacked is instructed to check if his Pokemon has been defeated, if so the bench activates the Pokemon on the top of the queue 


* Pokemon Cards that can attack each other when instructed. Weakness and Resistance modifiers implemented using double dispatch. Energy cards associated with them are stored in a custom object (Ledger).

* Energy Cards are handled by the Ledger, this object keeps track of the amount of cards given to it using a hashmap. This object is also able to check if a given ability can be executed given the energy cards available.

* Abilities use a Ledger object to represent their cost. Current implementation only consider attacks and can be given to a Pokemon during its initialization (Up to 4 abilities per Pokemon).

## Prerequisites
This project requires JUnit v4.0 for the test execution

## Available tests
* Bench Test:
   * Verifies that active pokemons are replaced properly, while keeping the number of pokemons on the bench lower than 5.

* Cost Evaluation Test:
   * Verifies that a pokemon cannot use an attack with a cost higher than the number of energies the pokemon has associated within it.

* Equality Test:
   * Tests implementation of  the equals  method between different objects

* Hand Test;
   * Checks that a card is removed from the player's hand after being played

* Weakness-Resistance Test:
   * Verifies that the specified attack modifiers between pokemon types have been defined correctly.