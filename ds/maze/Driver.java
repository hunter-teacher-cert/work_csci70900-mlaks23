
import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args) {
      //System.out.print(m);
	     boolean solved;

	     Maze m = new Maze("maze.dat");
       System.out.print(m);
	     solved = m.solve(1,1);

	/*
	  Knights k - new Knights(5);
	  solved = k.solve(1,1);
	*/
  /*
	Knights k = new Knights(5);
	k.solve(2,2,1);
  */
    }
}
