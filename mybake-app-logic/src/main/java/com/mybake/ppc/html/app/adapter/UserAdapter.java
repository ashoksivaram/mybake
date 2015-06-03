package com.mybake.ppc.html.app.adapter;

import com.mybake.poc.html.uiobjects.JSUserInfo;
import com.mybake.ppc.model.usermanagement.User;

public interface UserAdapter {
	User toUser(JSUserInfo jsUserInfo);
}
