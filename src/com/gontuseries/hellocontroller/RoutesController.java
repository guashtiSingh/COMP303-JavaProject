package com.gontuseries.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


// All website routes are controlled here.
@Controller
public class RoutesController {
	private User user;
	private BoardsController boards;
	
	// Handler for the username form submission
	@RequestMapping(value="/main", method=RequestMethod.POST)
    public String usernameSubmit(@ModelAttribute User user, Model model) {
		// Register the user name in the user object inside this controller
        this.setUser(user);
        // Create the boards controller - it will initialize the board list
        this.boards = new BoardsController();
        // Add those two objects to the model (meaning they'll be seen by the page)
        model.addAttribute("user", user);
        model.addAttribute("availableBoards", this.boards.getIterator());
        // Show 'main.jsp' to the user
        return "main";
    }

    // Handler for the board homepage (topic selection list)
	@RequestMapping(value= "/boards/{boardID}", method=RequestMethod.GET)
	public String findTopics(@PathVariable String boardID, Model model) {
		Board currentBoard = boards.getBoard(Integer.parseInt(boardID));
		model.addAttribute("board", currentBoard );
		model.addAttribute("availableTopics", currentBoard.getTopicsIterator() );
		return "topic";
	}
	
	//[/SpringMVCProject/boards/boards/1/topic/1]
    // Handler for the topic selection list
	@RequestMapping(value= "/boards/boards/{boardID}/topic/{topicID}", method=RequestMethod.GET)
	public String findMessages(@PathVariable String boardID, @PathVariable String topicID, Model model) {
		Board currentBoard = boards.getBoard(Integer.parseInt(boardID));
		Topic currentTopic = currentBoard.getTopic(Integer.parseInt(topicID));
		//Topic currentTopic = currentBoard.getTopic(2);
		//Topic currentTopic = new Topic(10, "hola");
		//System.out.print(currentTopic.getTopicName());
		model.addAttribute("board", currentBoard );
		model.addAttribute("topic", currentTopic );
		model.addAttribute("availablePostings", currentTopic.getPostingsIterator());
		return "postings";
	}

	public User getUser() {
		return user;
	}

	protected void setUser(User user) {
		this.user = user;
	}

}
