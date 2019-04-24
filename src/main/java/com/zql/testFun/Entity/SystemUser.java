package com.zql.testFun.Entity;

import java.io.Serializable;

public class SystemUser implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 293668667167041205L;

	private String loginId;
	private String userName;
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
