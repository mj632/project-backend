package com.dbo.bean;

import java.sql.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="customer_details")
@SequenceGenerator(name="customer_seq", initialValue=1, allocationSize=10000)
public class CustomerDetails {

	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="customer_seq")
	private long id;
	
	@Column(name="fname") private String fname;
	@Column(name="lname") private String lname;
	@Column(name="dob") private Date dob;
	@Column(name="email") private String email;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "uid") 
	@JsonIgnore private UserDetails user;
	
	public CustomerDetails()
	{
		
	}
	
//	 @Override
//	    public String toString() {
//	        String result = String.format(
//	                "CustomerDetails[uid=%d, fname='%s', lname='%s', dob='%s', email='%s']%n",
//	                id, fname, lname, dob, email);
//	        if (user != null) {
//	            result += String.format(
//	                    "UserDetails[id=%d, emailAddress='%s', password='%s', name='%s', createdBy=%d]%n",
//	                    user.getUid(), user.getUname(), user.getUpassword());
//	        }
//
//	        return result;
//	    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserDetails getUser() {
		return user;
	}

	public void setUser(UserDetails user) {
		this.user = user;
	}
}
