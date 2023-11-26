package com.bord.project.demo.dto.write;

import lombok.Data;

@Data
//@NoArgsConstructor
//@AllArgsConstructor //생성자 생략
public class WriteReqDto {
	
	private String title;
	private String content;
	private String password;
}
