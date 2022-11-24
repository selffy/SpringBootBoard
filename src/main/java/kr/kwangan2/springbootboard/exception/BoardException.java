package kr.kwangan2.springbootboard.exception;

//프로그램 실행 시에 발생할 수 있는 모든 예외의 최상위 부모로 사용할 클래스 구현
public class BoardException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public BoardException(String message) {
		super(message);
	}
}
