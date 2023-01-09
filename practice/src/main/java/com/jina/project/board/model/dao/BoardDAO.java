package com.jina.project.board.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.jina.project.board.model.vo.Board;
import com.jina.project.board.model.vo.Reply;
import com.jina.project.common.util.PageInfo;

public interface BoardDAO {
	//기능
	//sqlSession : dbms랑 연결
	//httpSession : 브라우저에 저장된 세션 토큰
	
	//1. 목록조회
	//글갯수
	public int selectBoardCnt(SqlSession session, Map<String,String> map);
	//검색 목록
	public List<Board> selectBoard(SqlSession session, PageInfo pageinfo, Map<String, String> map);
	
	//2. 글 조회
	public Board selectBoardDetail(SqlSession session, int bNo);
	
	//3. 작성 조회 수정
	public int insertBoard(SqlSession session, Board board);
	public int updateBoard(SqlSession session, Board board);
	public int deleteBoard(SqlSession session, int bNo);
	
	//4. 댓글
	public int insertReply(SqlSession session, Reply reply);
	public int updateReply(SqlSession session, Reply reply);
	public int deleteReply(SqlSession session, int rNo);
	
}
