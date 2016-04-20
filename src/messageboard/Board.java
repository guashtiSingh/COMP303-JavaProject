package messageboard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Board {
	
	protected int boardID;
	protected String boardName;
	protected List<Topic> topics;
	
	// Constructor
	public Board(int boardID, String boardName) {
		this.boardID = boardID;
		this.boardName = boardName;
		this.topics = new ArrayList<Topic>();
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
	
	public void addTopic(int topicID, String topicName) {
		Topic newTopic = new Topic(topicID, topicName);
		this.topics.add(newTopic);
	}
	

	public Topic getTopic (int index){
		return this.topics.get(index-1);		
	}

	public Iterator<Topic> getTopicsIterator(){
		return topics.iterator();
	}
}
