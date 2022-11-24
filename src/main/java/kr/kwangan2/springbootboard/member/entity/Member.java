package kr.kwangan2.springbootboard.member.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Member {

	@Id
	private String id;
	private String password;
	private String role;
	private String name;
	
}
