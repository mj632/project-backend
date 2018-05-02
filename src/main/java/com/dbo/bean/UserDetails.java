package com.dbo.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
@SequenceGenerator(name="user_seq", initialValue=1, allocationSize=10000)
//@NamedQueries({
//				@NamedQuery(
//						name = "findByUname",
//						query = "from UserDetails user where user.uname = :uname"),
//			})
public class UserDetails implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="user_seq")
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
