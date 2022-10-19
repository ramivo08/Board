package board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import board.model.BoardDao;

@Controller
public class BoardListController {

	private final String command="list.bo";
	private String getPage="/BoardList";
	
	@Autowired
	private BoardDao boardDao;
	
	@RequestMapping(command)
	public String list() {
		
		
		
		
		return getPage;
	}
	
}
