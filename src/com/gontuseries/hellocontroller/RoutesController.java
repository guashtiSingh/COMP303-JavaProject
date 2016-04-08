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
	private Board board;
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

    //Handler
	@RequestMapping(value= "/boards/{boardID}", method=RequestMethod.GET)
	public String findTopics(@PathVariable String boardID, Model model) {
		//boards.getBoard(board.boardID);
		model.addAttribute("board",boards.getBoard(board.boardID));
		return "topic";
	}

	public User getUser() {
		return user;
	}

	protected void setUser(User user) {
		this.user = user;
	}

}
