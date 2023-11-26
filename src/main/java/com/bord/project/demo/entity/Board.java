package com.bord.project.demo.entity;

import com.bord.project.demo.dto.write.board.BoardResponseDto;
import com.bord.project.demo.dto.write.board.GetBoardRespDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {
	
	private int boardId;
	private String title;
	private String content;
	private String password;
	
	public BoardResponseDto toDto() {
		return BoardResponseDto.builder()
				.boardId(boardId)
				.boardTitle(title)
				.boardContent(content)
				.build();
	}
	public GetBoardRespDto toGetDto() {
		return GetBoardRespDto.builder()
				.boardTitle(title)
				.boardContent(content)
				.build();
	}
}
