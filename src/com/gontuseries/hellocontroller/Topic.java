package com.gontuseries.hellocontroller;

public class Topic {
	
	protected int topicID;
	protected String topicName;
	
	//Constructor
	public Topic(int topicID, String topicName) {
		this.topicID = topicID;
		this.topicName = topicName;
	}
	
	public int getTopicID() {
		return topicID;
	}

	public void setTopicID(int topicID) {
		this.topicID = topicID;
	}

	public String getTopicName() {
		return topicName;
	}
	
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

}
