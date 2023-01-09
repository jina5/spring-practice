package com.jina.project.board.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jina.project.board.model.service.BoardService;
import com.jina.project.board.model.vo.Board;
import com.jina.project.common.util.PageInfo;



@Controller
public class BoardController {
	
	// 원래는 BoardService bs = new BoardService(); 하면서 계속 메모리에 채우는데..
	// @autowired 하면 톰캣이 처음에 스프링 구동(빌드)할떄 컴포넌트 다 스캔하면서,
	// 필요한 것들을 미리 메모리에 담아둔다.
	// 처음에 메모리 공간 하나에 bs를 만들어놓고, 필요하면 메모리에 있는 것을 불러와서 사용한다.
	// 메모리 관리에 용이하다.
	@Autowired 
	private BoardService bs;
	
	@GetMapping("/list.do")
	public String getBoardList(@RequestParam(required=false) Map<String,String> map, Model model) { 
		//1.전체 리스트 갯수
		//2. 검색어 있으면 검색어 매핑
		//3. 게시판 리스트 가져오기 + paging
		int page = 1;
		
		if (map.containsKey("page")) {
			page = Integer.parseInt(map.get("page"));
		}
		
		//map : searchType, searchValue
		
		
		//이거 왜만듬??????????????????????????
//		Map<String, String> searchMap = new HashMap<>();
//		if (map.containsKey("searchType")) {
//			if (map.containsKey("searchValue")) {
//				searchMap.put("searchType", map.get("searchType"));
//				searchMap.put("searchValue", map.get("searchValue"));
//			}
//		}
		PageInfo pageInfo = new PageInfo(page,10, bs.getBoardCnt(map), 10); //currentPage, pageLimit, listCount, listLimit
		List<Board> list = bs.getBoardList(map, pageInfo);
		model.addAttribute("bList",list);
		return "board/list";
	}
	
}