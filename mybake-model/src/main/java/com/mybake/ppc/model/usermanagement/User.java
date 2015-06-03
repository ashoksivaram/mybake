package com.mybake.ppc.model.usermanagement;

import com.mybake.ppc.model.common.ModelBase;

public class User extends ModelBase {

	private String userLoginId;
	private UserType userType;
	private String password;
	private UserInfo userInfo;

	public User() {

	}

	public String getUserLoginId() {
		return userLoginId;
	}

	public void setUserLoginId(String userLoginId) {
		this.userLoginId = userLoginId;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

}
