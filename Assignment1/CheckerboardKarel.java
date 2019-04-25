/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	public void run() {
		while(frontIsClear()){
			checkFirstTwoStreet();
			if(frontIsClear()) {
				move();
				turnRight();
			}
		}
		
	}
	private void checkFirstTwoStreet() {
		checkFirstStreet();
		turnLeft();
		move();
		turnLeft();
		checkFirstStreet();
		turnRight();
	}
	private void checkFirstStreet() {
		for(int a=0;a<3;a++) {
			putBeeper();
			move();
			move();
			
		}
		putBeeper();
		move();
	}

}
