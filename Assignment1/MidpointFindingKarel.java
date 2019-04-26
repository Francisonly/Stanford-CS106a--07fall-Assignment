import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {
	  public void run() {
		  conLength();
		  turnLeft();
		  turnLeft();
		  findMid();
		  putBeeper();
	  }
	  private void conLength() {
		  int i = 1;
		  while(frontIsClear()) {
			  move();
			  i++;
		  }
		  j = i+1;
	  }
	  private void findMid() {
		  for(int k = 0; k < (j-1) / 2; k++) {
			  move();
		  }
	  }
	  private int j;
}