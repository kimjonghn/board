package com.bord.project.demo.dto.write.board;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class GetBoardRespDto {
	private int boardId;
	private String boardTitle;
	private String boardContent;
}
