package com.dbo.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class UserDetails implements Serializable{
	
	private static final long serialUID = -3009157732242241606L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long uid;
	
	@Column(name="uname")
	private String uname;
	
	@Column(name="upassword")
	private String upassword;
	
	public UserDetails(String uname, String upassword) {
		// TODO Auto-generated constructor stub
		this.uname = uname;
		this.upassword = upassword;
	}

	protected UserDetails() {
		// TODO Auto-generated constructor stub
	}
	
//	@Override
//	public String toString()
//	{
//		return String.formate("user");
//	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

}
