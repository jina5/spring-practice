package com.jina.project.member.model.dao;

import java.util.List;

import com.jina.project.member.model.vo.Member;

//dao������ interface...

public interface MemberDAO {
	List<Member> selectAll(); //�߻�޼��� : ����θ� �ۼ��ϰ� �����δ� �ۼ����� ���� ä�� ���� �� ��
}
