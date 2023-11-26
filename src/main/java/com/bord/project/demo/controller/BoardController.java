package com.bord.project.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bord.project.demo.dto.write.WriteReqDto;
import com.bord.project.demo.service.BoardService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardService boardService;
	
	@CrossOrigin
	@PostMapping("/write")
	public ResponseEntity<?> write(@RequestBody WriteReqDto writeReqDto){
		return ResponseEntity.ok().body(boardService.write(writeReqDto));
	}
	
	@CrossOrigin
	@GetMapping("/board")
	public ResponseEntity<?> borad(){
		return ResponseEntity.ok().body(boardService.board());
	}
	@CrossOrigin
	@GetMapping("/board/{boardId}")
	public ResponseEntity<?> viewPost(@PathVariable int boardId){
		System.out.println(boardId);
		return ResponseEntity.ok().body(boardService.viewPost(boardId));
	}
	@CrossOrigin
	@GetMapping("/board/checkpassword")
	public ResponseEntity<?> checkpassword(int boardId, String passWordData){
		
		return ResponseEntity.ok().body(boardService.checkpassword(boardId, passWordData));
	}
	
}
