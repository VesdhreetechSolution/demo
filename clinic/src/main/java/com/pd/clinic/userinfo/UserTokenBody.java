package com.pd.clinic.userinfo;

import lombok.Data;

@Data
public class UserTokenBody {

	private String sub;

	private UserResponse userInfo;

	private String exp;

	private String iat;

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public UserResponse getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserResponse userInfo) {
		this.userInfo = userInfo;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public String getIat() {
		return iat;
	}

	public void setIat(String iat) {
		this.iat = iat;
	}

	@Override
	public String toString() {
		return "UserTokenBody [sub=" + sub + ", userInfo=" + userInfo + ", exp=" + exp + ", iat=" + iat + "]";
	}

}
