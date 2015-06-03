package com.mybake.ppc.html.app.adapter.imp;

import com.mybake.poc.html.uiobjects.JSUserInfo;
import com.mybake.ppc.html.app.adapter.UserAdapter;
import com.mybake.ppc.html.app.common.Utlities;
import com.mybake.ppc.model.common.PersonName;
import com.mybake.ppc.model.usermanagement.User;
import com.mybake.ppc.model.usermanagement.UserInfo;

public class UserAdapterImp implements UserAdapter {

	public User toUser(JSUserInfo jsUserInfo) {
		User user = new User();
		user.setGuid(Utlities.getNewUUID());
		user.setUserLoginId(jsUserInfo.getUserId());
		UserInfo userInfo = new UserInfo();
		PersonName personName = new PersonName();
		personName.setFirstName(jsUserInfo.getUserName());
		userInfo.setPersonName(personName );
		user.setUserInfo(userInfo );
		return user;
	}

}
