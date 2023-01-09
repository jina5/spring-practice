package com.jina.project.board.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jina.project.board.model.vo.Board;
import com.jina.project.board.model.vo.Reply;
import com.jina.project.common.util.PageInfo;

@Repository
public class BoardDAOImpl implements BoardDAO{

	@Override
	public int selectBoardCnt(SqlSession session, Map<String, String> map) {
		return session.selectOne("",map);
	}

	@Override
	public List<Board> selectBoard(SqlSession session, PageInfo pageinfo, Map<String, String> map) {
		map.put("start", "" + pageinfo.getStartList()); //100개리스트있으면 10개씩 10페이지, 1페이지 1~10/ 2페이지 11~20.... 여기서 11이 start 20 end
		map.put("end",""+pageinfo.getEndList());
		return session.selectList("", map);
	}

	@Override
	public Board selectBoardDetail(SqlSession session, int bNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertBoard(SqlSession session, Board board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBoard(SqlSession session, Board board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBoard(SqlSession session, int bNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertReply(SqlSession session, Reply reply) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateReply(SqlSession session, Reply reply) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteReply(SqlSession session, int rNo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
