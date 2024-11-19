package com.pd.clinic.userinfo;

import org.springframework.stereotype.Component;


@Component
public class UserAuthorizationContextProvider {

	private static ThreadLocal<UserResponse> userAuthorizationInfoContext = new ThreadLocal<UserResponse>();

	public static UserResponse getUserAuthorizationInfoContext() {
		return userAuthorizationInfoContext.get();
	}

	public static void setUserAuthorizationInfoContext(UserResponse userAuthorizationInfo) {
		userAuthorizationInfoContext.set(userAuthorizationInfo);
	}

	public static void reset() {
		userAuthorizationInfoContext.remove();
	}

}
