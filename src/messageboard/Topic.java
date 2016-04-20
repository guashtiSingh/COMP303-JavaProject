package messageboard;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Topic {
	
	protected int topicID;
	protected String topicName;
	protected List<String> postings;

	//Constructor
	public Topic(int topicID, String topicName) {
		this.topicID = topicID;
		this.topicName = topicName;
		this.postings = new ArrayList<String>();
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
	
	public Iterator<String> getPostingsIterator(){
		return postings.iterator();
	}
	
	public List<String> getPostings() {
		return postings;
	}

	public void setPostings(List<String> messages) {
		this.postings = messages;
	}
	
	public void addPosting(String postingDescription) {
		this.postings.add(postingDescription);
	}
	
	public String getPosting (int index){
		return this.postings.get(index-1);		
	}

}
