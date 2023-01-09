package com.jina.project.member.model.vo;

public class Member {
	private int idno;
	private String id;
	private String password;
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(int idno, String id, String password) {
		super();
		this.idno = idno;
		this.id = id;
		this.password = password;
	}
	public int getIdno() {
		return idno;
	}
	public void setIdno(int idno) {
		this.idno = idno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	
}
