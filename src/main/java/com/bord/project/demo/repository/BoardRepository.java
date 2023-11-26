package com.bord.project.demo.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.bord.project.demo.dto.write.WriteReqDto;
import com.bord.project.demo.entity.Board;

@Mapper
public interface BoardRepository {
	
	public int write(Map<String, Object> map);
	public List<Board> board();
	public Board viewPost(int bordId);
	public String checkpassword(int boardId);
}
