package com.gontuseries.hellocontroller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BoardsController {
	protected List<Board> boards;
	
	// Constructor - initializes the board
	public BoardsController(){
		
		boards = new ArrayList<Board>();
		
		Board b = new Board(1, "COMP-303 Java EE");
		b.addTopic(1, "Spring Framework problems");
			b.getTopic(1).addPosting("Message 1");
			b.getTopic(1).addPosting("Message 2");
			b.getTopic(1).addPosting("Message 3");
		b.addTopic(2, "Are we getting fair grades?");
			b.getTopic(2).addPosting("Message 1");
			b.getTopic(2).addPosting("Message 2");
			b.getTopic(2).addPosting("Message 3");
		b.addTopic(3, "JavaEE job postings");
			b.getTopic(3).addPosting("Message 1");
			b.getTopic(3).addPosting("Message 2");
			b.getTopic(3).addPosting("Message 3");
		b.addTopic(4, "Off-topic: beer friday night!");
			b.getTopic(4).addPosting("Message 1");
			b.getTopic(4).addPosting("Message 2");
			b.getTopic(4).addPosting("Message 3");
		boards.add(b);
		
		b = new Board(2, "COMP-397 Web Game Programming");
		b.addTopic(1, "Box2D physics simulation questions");
			b.getTopic(1).addPosting("Message 1");
			b.getTopic(1).addPosting("Message 2");
			b.getTopic(1).addPosting("Message 3");
		b.addTopic(2, "Tips to create a good game");
			b.getTopic(2).addPosting("Message 1");
			b.getTopic(2).addPosting("Message 2");
			b.getTopic(2).addPosting("Message 3");
		b.addTopic(3, "Post links to lesson videos here");
			b.getTopic(3).addPosting("Message 1");
			b.getTopic(3).addPosting("Message 2");
			b.getTopic(3).addPosting("Message 3");
		b.addTopic(4, "Off-topic: PS4 ou XboxOne?");
			b.getTopic(4).addPosting("Message 1");
			b.getTopic(4).addPosting("Message 2");
			b.getTopic(4).addPosting("Message 3");
		boards.add(b);
		
		b = new Board(3, "COMP-308 Emerging Technologies");
		b.addTopic(1, "The state of Javascript development");
			b.getTopic(1).addPosting("Message 1");
			b.getTopic(1).addPosting("Message 2");
			b.getTopic(1).addPosting("Message 3");
		b.addTopic(2, "MongoDB reliability issues");
			b.getTopic(2).addPosting("Message 1");
			b.getTopic(2).addPosting("Message 2");
			b.getTopic(2).addPosting("Message 3");
		b.addTopic(3, "Angular books and tutorials");
			b.getTopic(3).addPosting("Message 1");
			b.getTopic(3).addPosting("Message 2");
			b.getTopic(3).addPosting("Message 3");
		b.addTopic(4, "Off-topic: let's exchange Facebook profiles here");
			b.getTopic(4).addPosting("Message 1");
			b.getTopic(4).addPosting("Message 2");
			b.getTopic(4).addPosting("Message 3");
	
		boards.add(b);
		
	}
	
	public Iterator<Board> getIterator(){
		return boards.iterator();
	}

	public Board getBoard (int index) {
		return boards.get(index - 1); // Collections are zero-based.
	}

}
