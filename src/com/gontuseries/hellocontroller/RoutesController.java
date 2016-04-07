package com.gontuseries.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

	public User getUser() {
		return user;
	}

	protected void setUser(User user) {
		this.user = user;
	}

}
