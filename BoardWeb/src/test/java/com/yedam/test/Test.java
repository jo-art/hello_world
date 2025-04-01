package com.yedam.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yedam.common.DataSource;
import com.yedam.mapper.BoardMapper;
import com.yedam.vo.BoardVO;

public class Test {
	public static void main(String[] args) {
		SqlSessionFactory sqlSessionFactroy =DataSource.getInstance();
		
		try(SqlSession sqlSession= sqlSessionFactroy.openSession()){
			BoardMapper mapper =sqlSession.getMapper(BoardMapper.class);
		
		List<BoardVO> list = mapper.selectBoard(3); //sqlSession.selectList("com.yedam.mapper.BoardMapper.selectBoard");
		for(BoardVO brd:list) {
			System.out.println(brd.toString());
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
