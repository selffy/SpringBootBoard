package kr.kwangan2.springbootboard.board.service.impl;

import java.util.List;

import org.apache.catalina.authenticator.SavedRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kwangan2.springbootboard.board.entity.Board;
import kr.kwangan2.springbootboard.board.repository.BoardRepository;
import kr.kwangan2.springbootboard.board.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardRepository boardRepo;

	@Override
	public List<Board> listBoard(Board board) {
		return (List<Board>) boardRepo.findAll();
	}

	@Override
    public Board getBoard(Board board, String action) {
      Board findBoard = boardRepo.findById(board.getSeq()).get();
		  if(action!=null && action.equals("getBoard")) {
		     findBoard.setCnt(findBoard.getCnt()+1);
		  }
	  boardRepo.save(findBoard);
	  return findBoard;
    }

	@Override
	public void insertBoard(Board board) {
		boardRepo.save(board);
		
	}

	@Override
	public void updateBoard(Board board) {
		Board findboard = boardRepo.findById(board.getSeq()).get();
		findboard.setTitle(board.getTitle());
		findboard.setContent(board.getContent());
		boardRepo.save(findboard);
	}

	@Override
	public void deleteBoard(Board board) {
		boardRepo.deleteById(board.getSeq());
	}

}
