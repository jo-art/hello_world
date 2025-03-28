package com.yedam.mapper;

import java.util.List;

import com.yedam.vo.BoardVO;

public interface BoardMapper {
	//목록
	List<BoardVO> selectBoard();
	//emd
	int insertBoard(BoardVO board);
	int updateBoard(BoardVO board);
	int deleteBoard(BoardVO board);
}
