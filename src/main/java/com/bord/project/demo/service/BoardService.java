package com.bord.project.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bord.project.demo.dto.write.WriteReqDto;
import com.bord.project.demo.dto.write.board.BoardResponseDto;
import com.bord.project.demo.dto.write.board.GetBoardRespDto;
import com.bord.project.demo.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
	
	private final BoardRepository boardRepository;
	
	public int write(WriteReqDto writeReqDto) {
		Map<String, Object> map = new HashMap<>();
		
		map.put("title", writeReqDto.getTitle());
		map.put("content", writeReqDto.getContent());
		map.put("password", writeReqDto.getPassword());
		
		return boardRepository.write(map);
	}
	
	public List<BoardResponseDto> board() {
		
		List<BoardResponseDto> responseList = new ArrayList<>();
		
		boardRepository.board().forEach(board ->{
				responseList.add(board.toDto());
		});;
		
		
		return responseList;
	}
	public GetBoardRespDto viewPost(int boardId) {
//		System.out.println(boardRepository.viewPost(boardId).toGetDto().getBoardTitle());
//		return null;
		return boardRepository.viewPost(boardId).toGetDto();
	}
	public boolean checkpassword(int boardId, String passWordData) {
		
		String checkpasswordData = boardRepository.checkpassword(boardId);
		
		if(passWordData.equals(checkpasswordData)) {
			return true;
		}else {
			return false;
			
		}
	}

}
