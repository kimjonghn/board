package com.bord.project.demo.dto.write.board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardResponseDto {
	private int boardId;
	private String boardTitle;
	private String boardContent;
}
