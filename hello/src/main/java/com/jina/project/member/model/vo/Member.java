package com.jina.project.member.model.vo;


public class Member {
	
	//idNo, id / password
	private int idNo;
	private String id;
	private String password;
	
	// 호출 -> 생성자 
	public Member() {
		super();
	}
	public Member(int idNo, String id, String password) {
		super();
		this.idNo = idNo;
		this.id = id;
		this.password = password;
	}
	
	//getter, setter
	public int getIdNo() {
		return idNo;
	}
	public void setIdNo(int idNo) {
		this.idNo = idNo;
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
	
	// setter / getter 
	

}
