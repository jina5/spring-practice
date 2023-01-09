package com.jina.project.board.model.service;

import java.util.List;
import java.util.Map;

import com.jina.project.board.model.vo.Board;
import com.jina.project.board.model.vo.Reply;
import com.jina.project.common.util.PageInfo;

public interface BoardService {
	
	public int getBoardCnt(Map<String, String> map);
	public List<Board> getBoardList(Map<String, String> map, PageInfo pageInfo);
	public Board getBoard(int bNo);
	public int addboard(Board board);
	public int modifyBoard(Board board);
	public int delete(int bNo);
	
	//파일
	public String saveFile(String filePath, String fileName);
	public void deleteFile();
	
	//댓글
	public int addReply(Reply reply);
	public int modifyReply(Reply reply);
	public int deleteReply(int rNo);
	
}
