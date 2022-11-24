package kr.kwangan2.springbootboard.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.kwangan2.springbootboard.board.entity.Board;
import kr.kwangan2.springbootboard.board.service.BoardService;
import kr.kwangan2.springbootboard.member.entity.Member;

@Controller
@RequestMapping("/board")
public class BoardController{

	@Autowired
	private BoardService boardService;
	
	@ModelAttribute("member")
	public Member setMemer() {
		return new Member();
	}
	
	@RequestMapping("/listBoard")
	public String listBoard(Model model, @ModelAttribute("member") Member member, Board board) {
		if(member.getId() == null) {
			return "redirect:/member/login";
		}
		List<Board> boardList = boardService.listBoard(board);
		model.addAttribute("boardList", boardList);
		return "/board/listBoard";
	}

    @GetMapping("/getBoard")
    public String getBoard(@ModelAttribute("member") Member member, Board board, Model model, String action) {
		if(member.getId() == null) {
			return "redirect:/member/login";
		}
         model.addAttribute("board", boardService.getBoard(board,action));
      return "/board/getBoard";
    }

	
	@GetMapping("/insertBoard")
	public String insertBoard(@ModelAttribute("member") Member member, Board board) {
		if(member.getId() == null) {
			return "redirect:/member/login";
		}
		return "/board/insertBoard";
	}
	
	
	@PostMapping("/insertBoardProc")
	public String insertBoardProc(@ModelAttribute("member") Member member, Board board) {
		if(member.getId() == null) {
			return "redirect:/member/login";
		}
		boardService.insertBoard(board);
		return "redirect:/board/listBoard";
	}
	
	@PostMapping("/updateBoardProc")
	public String updateBoard(@ModelAttribute("member") Member member, Board board) {
		if(member.getId() == null) {
			return "redirect:/member/login";
		}
		boardService.updateBoard(board);
		return "redirect:/board/listBoard";
	}
	
	@GetMapping("/deleteBoard")
	public String deleteBoard(@ModelAttribute("member") Member member, Board board) {
		if(member.getId() == null) {
			return "redirect:/member/login";
		}
		boardService.deleteBoard(board);
		return "redirect:/board/listBoard";
	}
	
	@GetMapping("/hello")
	public String hello(@ModelAttribute("member") Member member, Model model){
		if(member.getId() == null) {
			return "redirect:/member/login";
		}
	model.addAttribute("greeting", "Hello Thymleaf!!!");
	return "/board/hello";
	}
}