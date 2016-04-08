package com.gontuseries.hellocontroller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BoardsController {
	protected List<Board> boards;
	
	// Constructor - initializes the board list
	public BoardsController(){
		
		boards = new ArrayList<Board>();
		boards.add(new Board(1,"COMP-303 Java EE"));
		boards.add(new Board(2, "COMP-397 Web Game Programming"));
		boards.add(new Board(3, "COMP-308 Emerging Technologies"));
	}
	
	public Iterator<Board> getIterator(){
		return boards.iterator();
	}

	public Board getBoard (int index) {
		
		return boards.get(index);
	}

}
