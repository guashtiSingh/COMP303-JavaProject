package com.gontuseries.hellocontroller;

public class Board {
	
	protected int boardID;
	protected String boardName;
	protected List<Topic> topics;
	
	// Constructor
	public Board(int boardID, String boardName) {
		this.boardID = boardID;
		this.boardName = boardName;
	}
	
	public int getBoardID() {
		return boardID;
	}
	
	public void setBoardID(int bName) {
		this.boardID = bName;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
}
