package kr.kwangan2.springbootboard.exception;

//게시판 프로그램에서 발생할 수 있는 모든 예외를 표현하기 위한 클래스 구현
public class BoardNotFoundExcetpion extends BoardException {

	private static final long serialVersionUID = 1L;

	public BoardNotFoundExcetpion(String message) {
		super(message);
	}

	
}
