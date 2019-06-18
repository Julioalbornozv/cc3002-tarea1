# Pokemon TCG

Command line implementation of the Pokemon TCG for the course cc3002.


## Current Status
This project does not currently have a game to be played. It does though contain objects that can be used to assemble said game in the future.
This project features:

* A trainer class which represents the player. Its able to play Pokemon and Energy cards using double dispatch. 

* A Judge class which controls the flow of the game, using the observer pattern the judge recieves notifications from the players after they play a card or select an ability. The judge keeps track of global effects and game restrictions which can affect the cards being used.

* Pokemon Cards played on the bench are stored on a List, after an attack has been executed, the trainer being attacked is instructed to check if his Pokemon has been defeated, if so the bench activates the Pokemon on the top of the queue. 

* Pokemon Cards that can attack each other when instructed. Weakness and Resistance modifiers implemented using double dispatch. Energy cards associated with them are stored in a custom object (Ledger). Pokemons can evolve between multiple stages (Basic > Stage 1 > Stage 2), replacing their pre-evolution while inheriting any energy card their predecessor held.

* Energy Cards are handled by the Ledger, this object keeps track of the amount of cards given to it using a hashmap. This object is also able to check if a given ability can be executed given the energy cards available.

* A Deck class which is used to simulate the deck and cemetery of a player, this class acts as an adapter between the owner and a stack structure.

* Abilities use a Ledger object to represent their cost and an Effect class to store their effects on the game. Abilities can be standard (apply an effect) or attacks (which also inflict damage).

* Trainer Cards contain an effect that when used will affect the state of a game, they can have immideate effects or can affect the game for multiple turns. Trainer cards come in three forms: Stadiums (global effects), Items(instant or passive which then are equipped to a pokemon) and Support cards (instant effect).

* Abilities and Trainer cards encode their effects using the Effect class which implements the visitor pattern to interact with multiple objects of the game. This class also contains a turn restriction which when toggle restrict that effect from being used more than once

* For this project the following effects where implemented:
   * Proffessor Cozmo's Discovery
   * Potion
   * Heal
   * Frozen City Stadium
   * Electric Shock

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

* Evolution Test
   * Verifies that pokemons evolution in the expected manner and checks if energies are transferred between phases

* Deck Test:
	* Verifies its methods function properly
	
* A test for each effect implemented for this project