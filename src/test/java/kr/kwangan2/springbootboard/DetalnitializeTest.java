package kr.kwangan2.springbootboard;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.kwangan2.springbootboard.board.entity.Board;
import kr.kwangan2.springbootboard.board.repository.BoardRepository;
import kr.kwangan2.springbootboard.member.entity.Member;
import kr.kwangan2.springbootboard.member.repository.MemberRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class DetalnitializeTest {

	@Autowired
	private MemberRepository memberRepo;
	
	@Autowired
	private BoardRepository boardRepo;
	
	@Test
	public void testDataInsert() {
		Member member = new Member("member1", "self111", "ROLE_USER", "세영");
		memberRepo.save(member);
		
		Member member2 = new Member("member2", "nana222", "ROLE_ADMIN", "혜련");
		memberRepo.save(member2);
		
		for(int i = 1; i<=3; i++) {
			Board board = new Board("selffy's 제목"+i, "세영", "selffy's 내용 "+i, new Date());
			boardRepo.save(board);
		}
		
		for(int i = 1; i<=3; i++) {
			Board board2 = new Board("nana's 제목"+i, "혜련", "nana's 내용 "+i, new Date());
			boardRepo.save(board2);
		}
	}

}
