package com.jina.project.board.model.service;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jina.project.board.model.dao.BoardDAO;
import com.jina.project.board.model.vo.Board;
import com.jina.project.board.model.vo.Reply;
import com.jina.project.common.util.PageInfo;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDAO dao;
	
	@Autowired
	private SqlSessionTemplate session;
	
	@Override
	public int getBoardCnt(Map<String, String> map) {
		return dao.selectBoardCnt(session, map);
	}

	@Override
	public List<Board> getBoardList(Map<String, String> map, PageInfo pageInfo) {
		return dao.selectBoard(session, pageInfo, map);
	}

	@Override
	public Board getBoard(int bNo) {
		return null;
	}

	@Override
	public int addboard(Board board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyBoard(Board board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int bNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String saveFile(String filePath, String fileName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteFile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int addReply(Reply reply) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyReply(Reply reply) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteReply(int rNo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
