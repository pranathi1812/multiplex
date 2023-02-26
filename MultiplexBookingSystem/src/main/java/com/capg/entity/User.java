package com.capg.entity;

//import java.util.List;


//import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;





@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private long userId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="mobile_no")
	private long mobileNo;
	
	@Column(name="user_type")
	private char userType;
	
	@Column(name="password")
	private String password;
	
//	@OneToMany(mappedBy="user", cascade= CascadeType.ALL)
//	private List<Booking> bookings;

	public User(long userId, String userName, String emailId, long mobileNo, char userType, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.userType = userType;
		this.password = password;
//		this.bookings = bookings;
	}

	public long getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public char getUserType() {
		return userType;
	}

	public String getPassword() {
		return password;
	}

//	public List<Booking> getBookings() {
//		return bookings;
//	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setUserType(char userType) {
		this.userType = userType;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public void setBookings(List<Booking> bookings) {
//		this.bookings = bookings;
//	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", emailId=" + emailId + ", mobileNo=" + mobileNo
				+ ", userType=" + userType + ", password=" + password + "]";
	}
	
	

	

	
	}
	
	
	

