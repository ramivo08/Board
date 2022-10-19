package board.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import board.model.BoardBean;
import board.model.BoardDao;

@Controller
public class BoardWriteController {

	private final String command ="write.bo";
	private String getPage="/writeForm";
	private String gotoPage="redirect:/list.bo";
	
	
	@Autowired
	private BoardDao boardDao;
	
	@RequestMapping(value=command, method=RequestMethod.GET)
	public String write() {
		
		return getPage;
	}
	
	
	@RequestMapping(value=command, method= RequestMethod.POST)
	public ModelAndView write(@ModelAttribute("board") BoardBean board, BindingResult result) {
		
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
			mav.setViewName(getPage);
			return mav;
		}
		
		int cnt =boardDao.insertBoard(board);
		
		mav.setViewName(gotoPage);
		return mav;
		
	}
	
}
