package com.Test.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users_dtls")
public class User {

	@Id
	@Column(name = "USER_ID")
	private Integer userid;

	@Column(name = "USER_NAME")
	private String username;

	@Column(name = "USER_EMAIL")
	private String useremail;

	@Column(name = "USER_PHNO")
	private Long userphno;

	@Column(name = "USER_COUNTRY")
	private String usercountry;

	@Column(name = "USER_AGE")
	private Integer userage;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", useremail=" + useremail + ", userphno="
				+ userphno + ", usercountry=" + usercountry + ", userage=" + userage + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public Long getUserphno() {
		return userphno;
	}

	public void setUserphno(Long userphno) {
		this.userphno = userphno;
	}

	public String getUsercountry() {
		return usercountry;
	}

	public void setUsercountry(String usercountry) {
		this.usercountry = usercountry;
	}

	public Integer getUserage() {
		return userage;
	}

	public void setUserage(Integer userage) {
		this.userage = userage;
	}

}
