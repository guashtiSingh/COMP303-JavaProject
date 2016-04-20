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
			b.getTopic(1).addPosting("Brian says: I cannot set persistence to work with Spring, any tips?");
			b.getTopic(1).addPosting("Amy says: Take a look at StackOverflow, they have some info on it.");
			b.getTopic(1).addPosting("Brian says: Thanks Amy!");
		b.addTopic(2, "Are we getting fair grades?");
			b.getTopic(2).addPosting("Jagpreet says: I think the grading system is confusing.");
			b.getTopic(2).addPosting("Chad says: Yeah, I don't agree with half of the wording on last test's questions");
			b.getTopic(2).addPosting("Vanessa says: We should discuss this with the prof");
		b.addTopic(3, "JavaEE job postings");
			b.getTopic(3).addPosting("John says: Hey, Bell is hiring JavaEE developers.");
			b.getTopic(3).addPosting("John says: I can forward your resumes if you are interested");
		b.addTopic(4, "Off-topic: beer friday night!");
			b.getTopic(4).addPosting("Trisha says: So you guys wanna go for drinks after the test?");
			b.getTopic(4).addPosting("Brian says: I'm in!");
			b.getTopic(4).addPosting("John says: I could use a beer... or 20!");
		boards.add(b);
		
		b = new Board(2, "COMP-397 Web Game Programming");
			b.addTopic(1, "Box2D physics simulation questions");
			b.getTopic(1).addPosting("Brian says: I cannot set collisions to work with Box2D, any tips?");
			b.getTopic(1).addPosting("Amy says: Take a look at StackOverflow, they have some info on it.");
			b.getTopic(1).addPosting("Brian says: Thanks Amy!");
		b.addTopic(2, "Tips to create a good game");
			b.getTopic(2).addPosting("Paul says: There's a lecture on TED Talks about it, it's super cool.");
			b.getTopic(2).addPosting("Paul says: Link - http://youtu.be/01234kunsfd");
			b.getTopic(2).addPosting("Amelie says: Cool, thanks!");
		b.addTopic(3, "Post links to lesson videos here");
			b.getTopic(3).addPosting("Kim says: Lesson 1 - http://youtu.be/01234kunsfd");
			b.getTopic(3).addPosting("Kim says: Lesson 2 - http://youtu.be/dfu8hdsvc3");
		b.addTopic(4, "Off-topic: PS4 ou XboxOne?");
			b.getTopic(4).addPosting("Bonnie says: so which one should I buy?");
			b.getTopic(4).addPosting("Chad says: None, buy a PC and ascend from peasantry");
		boards.add(b);
		
		b = new Board(3, "COMP-308 Emerging Technologies");
		b.addTopic(1, "The state of Javascript development");
			b.getTopic(1).addPosting("Douglas says: Cool article about it here - http://www.butdoesitfloat.com/");
		b.addTopic(2, "MongoDB reliability issues");
			b.getTopic(2).addPosting("Brian says: I cannot add documents to my database, any tips?");
			b.getTopic(2).addPosting("Amy says: Take a look at StackOverflow, they have some info on it.");
			b.getTopic(2).addPosting("Brian says: Thanks Amy!");
		b.addTopic(3, "Angular books and tutorials");
			b.getTopic(3).addPosting("Oscar says: Read them here - http://www.w3schools.com/angular/");
			b.getTopic(3).addPosting("Sonia says: I saw some good stuff on Mozilla's MDN site too");
		b.addTopic(4, "Off-topic: let's exchange Facebook profiles here");
			b.getTopic(4).addPosting("Wilson says: My FB is 'WillAwesome', just look me up");
			b.getTopic(4).addPosting("Elaine sais: Mine is 'Ellie0328420'");
			b.getTopic(4).addPosting("Shonda says: Mine is 'GreysAnatomy4Eva'");
		boards.add(b);
		
	}
	
	public Iterator<Board> getIterator(){
		return boards.iterator();
	}

	public Board getBoard (int index) {
		return boards.get(index - 1); // Collections are zero-based.
	}

}
