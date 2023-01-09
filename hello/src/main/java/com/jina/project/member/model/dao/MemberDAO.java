package com.jina.project.member.model.dao;

import java.util.List;

import com.jina.project.member.model.vo.Member;

//dao에서는 interface...

public interface MemberDAO {
	List<Member> selectAll(); //추상메서드 : 선언부만 작성하고 구현부는 작성하지 않은 채로 남겨 둔 것
}
