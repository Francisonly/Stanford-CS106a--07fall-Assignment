/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	public void run() {
		for(int i=0;i<2;i++) {
			turnLeft();
			streetMason();
			turnRight();
			avenueMason();
			turnRight();
			streetMason();
			turnLeft();
			avenueMason();
		}
		
	}
	private void streetMason() {
		while(frontIsClear()) {
			while(noBeepersPresent()) {
				putBeeper();
			}
			move();
		}
	}

	private void avenueMason() {
		for(int a=1;a<5;a++) {
			if(frontIsClear()) {
				move();
			}
		}
	}
}
