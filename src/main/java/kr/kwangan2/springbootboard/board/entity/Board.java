package kr.kwangan2.springbootboard.board.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Board {
	
	public Board(String title,String writer,String content,Date createDate,Long cnt) {
		this.title=title;
		this.writer=writer;
		this.content=content;
		this.createDate=createDate;
		this.cnt=cnt;
	}
	private String title;
	
	@Id @GeneratedValue
	private Long seq;
	
	@Column(updatable = false)
	private String writer;
	
	private String content;
	
	@Column(insertable = false, updatable = false, columnDefinition = "date default sysdate")
	private Date createDate;
	
	@Column(insertable = false, columnDefinition = "number default 0")
	private Long cnt;
}
