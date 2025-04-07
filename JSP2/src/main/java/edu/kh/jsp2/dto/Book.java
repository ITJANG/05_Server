package edu.kh.jsp2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Getter
//@Setter
//@ToString

@Data // getter / setter / to String
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 매개변수 생성자
public class Book {
	
	private String title;	// 제목
	private String writer;	// 작성자
	private int price;		// 가격
	
	
	// 메서드 (생성자, getter/setter/toString)
	
	
}
